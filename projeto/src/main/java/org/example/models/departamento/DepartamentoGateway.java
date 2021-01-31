package org.example.models.departamento;

import java.sql.*;
import java.util.*;

import org.example.models.departamento.Departamento;
import org.example.models.ConnectionFactory;

public class DepartamentoGateway {
  private Connection conn = ConnectionFactory.getConnection();

  public List<Departamento> getAll() throws SQLException {
    List<Departamento> departamentos = new ArrayList<>();
    Statement statement = conn.createStatement();
    ResultSet rs = statement.executeQuery("SELECT * FROM departamentos;");
    
    while(rs.next()) {
      Departamento dep = new Departamento(rs.getInt("codigo"), rs.getString("nome"), rs.getString("sigla"));
      departamentos.add(dep);
    }
    rs.close();

    return departamentos;
  }

	public Departamento getByCodigo(Long codigo) throws SQLException {
		
		String SQL_INSERT = "SELECT * FROM departamentos WHERE codigo = ?;";
		Statement statement = conn.createStatement();
    PreparedStatement pstm = conn.prepareStatement(SQL_INSERT);
    pstm.setLong(1, codigo);
		ResultSet rs = pstm.executeQuery();
		
		if(rs.next()){
			return new Departamento(rs.getInt("codigo"), rs.getString("nome"), rs.getString("sigla"));
		}
		throw new SQLException("Departamento não identificado");
	}

  public void create(String nome, String sigla) throws SQLException {
    String SQL_INSERT = "INSERT INTO departamentos (nome, sigla) VALUES (?, ?);";
    PreparedStatement pstm = conn.prepareStatement(SQL_INSERT);
    pstm.setString(1, nome);
    pstm.setString(2, sigla);
    pstm.execute();
    pstm.close();
  }

  public void update(int codigo, String nome, String sigla) throws SQLException  {
    String SQL_UPDATE = "UPDATE departamentos SET nome = ?, sigla = ? WHERE codigo = ?;";
    PreparedStatement pstm = conn.prepareStatement(SQL_UPDATE);
    pstm.setString(1, nome);
    pstm.setString(2, sigla);
    pstm.setInt(3, codigo);
    pstm.executeUpdate();
    pstm.close();
  }

  public void delete(int codigo) throws SQLException  {
    String SQL_DELETE = "DELETE FROM departamentos WHERE codigo = ?;";
    PreparedStatement pstm = conn.prepareStatement(SQL_DELETE);
    pstm.setInt(1, codigo);
    pstm.executeUpdate();
    pstm.close();
  }

}