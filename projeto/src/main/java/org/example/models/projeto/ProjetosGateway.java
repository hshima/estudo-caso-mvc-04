package org.example.models.projeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.example.models.ConnectionFactory;
import org.example.models.projeto.Projeto;

public class ProjetosGateway {

	private Connection conn = ConnectionFactory.getConnection();

	public List<Projeto> getAll() throws SQLException {
		List<Projeto> projetos = new ArrayList<>();
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM projetos;");

		while (rs.next()) {
			Projeto p = new Projeto(rs.getShort("codigo"), rs.getString("titulo"), (Date) rs.getDate("data_inicio"), (Date) rs.getDate("data_fim"), rs.getShort("codigo_departamento"));
			projetos.add(p);
		}
		rs.close();

		return projetos;
	}

	public void create(Short codigo, String titulo, Date dataInicio, Date dataFim, Short codigoDepartamento) throws SQLException {
		String SQL_INSERT = "INSERT INTO projetos (titulo, dataInicio, dataFim, codigo_departamento) VALUES (?, ?, ?, ?);";
		PreparedStatement pstm = conn.prepareStatement(SQL_INSERT);
		pstm.setString(1, titulo);
		pstm.setDate(2, java.sql.Date.valueOf(dataInicio.toString()));
		pstm.setDate(3, java.sql.Date.valueOf(dataFim.toString()));
		pstm.setShort(4, codigoDepartamento);
		pstm.setShort(5, codigo);
		pstm.execute();
		pstm.close();
	}

	public void update(Short codigo, String titulo, Date dataInicio, Date dataFim, Short codigoDepartamento) throws SQLException {
		String SQL_UPDATE = "UPDATE projetos SET nome = ?, email = ?, departamento = ? WHERE cpf = ?;";
		PreparedStatement pstm = conn.prepareStatement(SQL_UPDATE);
		pstm.setString(1, titulo);
		pstm.setDate(2, java.sql.Date.valueOf(dataInicio.toString()));
		pstm.setDate(3, java.sql.Date.valueOf(dataFim.toString()));
		pstm.setShort(4, codigoDepartamento);
		pstm.setShort(5, codigo);
		pstm.executeUpdate();
		pstm.close();
	}

	public void delete(Short codigo) throws SQLException {
		String SQL_DELETE = "DELETE FROM projetos WHERE codigo= ?;";
		PreparedStatement pstm = conn.prepareStatement(SQL_DELETE);
		pstm.setShort(1, codigo);
		pstm.executeUpdate();
		pstm.close();
	}

}