<%@	page import="java.util.List" %>
<%@	page import="org.example.models.funcionario.Funcionario" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Lista de Funcionários</title>
</head>
<body>
  <h1>Lista Funcionários</h1>
  <table>
    <tr>
      <th>CPF</th>
      <th>Nome</th>
			<th>email</th>
			<th>Departamento</th>
    </tr>
    
    <%
      List<Funcionario> funcionarios = (List<Funcionario>) request.getAttribute("funcionarios");
      for(Funcionario f : funcionarios) {
    %>
    
    <tr>
      <td><%= f.getCpf() %></td>
      <td><%= f.getNome() %></td>
			<td><%= f.getEmail() %></td>
			<td><%= f.getDepartamento() %></td>
    </tr>

    <%
      }
    %>
  </table>
</body>
</html>