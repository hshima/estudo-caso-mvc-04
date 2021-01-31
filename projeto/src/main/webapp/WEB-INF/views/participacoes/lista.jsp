<%@	page import="java.util.List" %>
<%@	page import="org.example.models.participacao.Participacao" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Lista de Participação</title>
</head>
<body>
  <h1>Lista Participação</h1>
  <table>
    <tr>
      <th>CPF</th>
      <th>Entrada</th>
			<th>Saida</th>
			<th>Assunto</th>
    </tr>
    
    <%
      List<Participacao> participacoes = (List<Participacao>) request.getAttribute("participacoes");
      for(Participacao p : participacoes) {
    %>
    
    <tr>
      <td><%= p.getCpf_funcionario() %></td>
      <td><%= p.getDataEntrada() %></td>
			<td><%= p.getDataSaida() %></td>
			<td><%= p.getTitle() %></td>
    </tr>

    <%
      }
    %>
  </table>
</body>
</html>