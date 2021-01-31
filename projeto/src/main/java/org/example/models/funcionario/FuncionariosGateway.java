package org.example.models.funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.example.models.ConnectionFactory;
import org.example.models.departamento.Departamento;
import org.example.models.departamento.DepartamentoGateway;
import org.example.models.funcionario.Funcionario;

public class FuncionariosGateway {

	private Connection conn = ConnectionFactory.getConnection();

	public List<Funcionario> getAll() throws SQLException {
		List<Funcionario> funcionarios = new ArrayList<>();
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM funcionarios;");

			DepartamentoGateway dg = new DepartamentoGateway();
			//Departamento departamento = dg.getall();
		while (rs.next()) {
			Departamento departamento = dg.getByCodigo(rs.getLong("codigo_departamento"));
			
			Funcionario f = new Funcionario(rs.getLong("cpf"), rs.getString("nome"), rs.getString("email"),
					departamento);
			funcionarios.add(f);
		}
		rs.close();
		
		return funcionarios;
	}

	public void create(Short cpf, String nome, String email, Short departamento) throws SQLException {
		String SQL_INSERT = "INSERT INTO funcionarios (cpf, nome, email, departamento) VALUES (?, ?, ?, ?);";
		PreparedStatement pstm = conn.prepareStatement(SQL_INSERT);
		pstm.setShort(1, cpf);
		pstm.setString(2, nome);
		pstm.setString(3, email);
		pstm.setShort(4, departamento);
		pstm.execute();
		pstm.close();
	}

	public void update(Short cpf, String nome, String email, Short departamento) throws SQLException {
		String SQL_UPDATE = "UPDATE funcionarios SET nome = ?, email = ?, departamento = ? WHERE cpf = ?;";
		PreparedStatement pstm = conn.prepareStatement(SQL_UPDATE);
		pstm.setString(1, nome);
		pstm.setString(2, email);
		pstm.setShort(3, departamento);
		pstm.setShort(4, cpf);
		pstm.executeUpdate();
		pstm.close();
	}

	public void delete(Short cpf) throws SQLException {
		String SQL_DELETE = "DELETE FROM funcionarios WHERE cpf= ?;";
		PreparedStatement pstm = conn.prepareStatement(SQL_DELETE);
		pstm.setShort(1, cpf);
		pstm.executeUpdate();
		pstm.close();
	}

}