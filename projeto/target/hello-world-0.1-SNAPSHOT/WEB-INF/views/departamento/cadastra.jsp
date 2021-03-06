<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Criar Departamento</title>
</head>
<body>
	<h1>Criação de departamento</h1>
	<form action="/create" method="post">
		<table>
			<thead>
					<tr>
						<th>codigo<th>
						<th>nome</th>
						<th>sigla</th>
					</tr>	
			</thead>
			<tbody>
				<tr>
					<td><input type="text" name="codigo" placeholder="codigo" /></td>
					<td><input type="text" name="nome" placeholder="nome"></td>
					<td><input type="text" name="sigla" placeholder="sigla"></td>
				</tr>
				<tr><input type="hidden" name="action" value="submit" /></tr>
				<tr><input type="submit"></tr>
			</tbody>
		</table>
	</form>
</body>
</html>