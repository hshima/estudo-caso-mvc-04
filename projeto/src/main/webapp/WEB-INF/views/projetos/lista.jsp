<%@	page import="java.util.List" %>
<%@	page import="org.example.models.projeto.Projeto" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Lista de Projetos</title>
</head>
<body>
  <h1>Lista Projetos</h1>
  <table>
    <tr>
      <th>CPF</th>
      <th>Entrada</th>
			<th>Saida</th>
			<th>Assunto</th>
    </tr>
    
    <%
      List<Projeto> projetos = (List<Projeto>) request.getAttribute("projetos");
      for(Projeto p : projetos) {
    %>
    
    <tr>
      <td><%= p.getTitulo() %></td>
      <td><%= p.getDataInicio() %></td>
			<td><%= p.getDataFim() %></td>
			<td><%= p.getCodigoDepartamento() %></td>
    </tr>

    <%
      }
    %>
  </table>
</body>
</html>