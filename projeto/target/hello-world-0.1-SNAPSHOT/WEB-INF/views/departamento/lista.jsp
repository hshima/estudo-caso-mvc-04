<%@	page import="java.util.List" %>
<%@	page import="org.example.models.departamento.Departamento" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Lista de Departamentos</title>
</head>
<body>
  <h1>Lista Departamentos</h1>
  <table>
    <tr>
      <th>Sigla</th>
      <th>Nome</th>
    </tr>
    
    <%
      List<Departamento> departamentos = (List<Departamento>) request.getAttribute("departamentos");
      for(Departamento dep : departamentos) {
    %>
    
    <tr>
      <td><%= dep.sigla %></td>
      <td><%= dep.nome %></td>
    </tr>

    <%
      }
    %>
  </table>
</body>
</html>