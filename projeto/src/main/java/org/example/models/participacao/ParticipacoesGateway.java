package org.example.models.participacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.example.models.ConnectionFactory;
import org.example.models.participacao.Participacao;

public class ParticipacoesGateway {

	private Connection conn = ConnectionFactory.getConnection();

	public List<Participacao> getAll() throws SQLException {
		List<Participacao> participacao = new ArrayList<>();
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM participacoes;");

		while (rs.next()) {
			Participacao p = new Participacao(rs.getShort("codigo"), rs.getLong("cpf_funcionario"), (Date) rs.getDate("data_entrada"), (Date) rs.getDate("date_saida"), rs.getString("title"));
			participacao.add(p);
		}
		rs.close();

		return participacao;
	}

	public void create(Short cpf, String nome, Date dataEntrada, Date dataSaida, String title) throws SQLException {
		String SQL_INSERT = "INSERT INTO participacoes (cpf_funcionario, data_entrada, data_saida, title) VALUES (?, ?, ?, ?);";
		PreparedStatement pstm = conn.prepareStatement(SQL_INSERT);
		pstm.setShort(1, cpf);
		pstm.setDate(2, java.sql.Date.valueOf(dataEntrada.toString()));
		pstm.setDate(3, java.sql.Date.valueOf(dataSaida.toString()));
		pstm.setString(4, title);
		pstm.execute();
		pstm.close();
	}

	public void update(Short cpf, String nome, String email, Short departamento) throws SQLException {
		String SQL_UPDATE = "UPDATE participacoes SET nome = ?, email = ?, departamento = ? WHERE cpf = ?;";
		PreparedStatement pstm = conn.prepareStatement(SQL_UPDATE);
		pstm.setString(1, nome);
		pstm.setString(2, email);
		pstm.setShort(3, departamento);
		pstm.setShort(4, cpf);
		pstm.executeUpdate();
		pstm.close();
	}

	public void delete(Short codigo) throws SQLException {
		String SQL_DELETE = "DELETE FROM participacoes WHERE codigo= ?;";
		PreparedStatement pstm = conn.prepareStatement(SQL_DELETE);
		pstm.setShort(1, codigo);
		pstm.executeUpdate();
		pstm.close();
	}

}