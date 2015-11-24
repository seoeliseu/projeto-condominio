<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="resources/bootstrap/css/bootstrap-theme.min.css"
	rel="stylesheet" />
<link href="resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="<%= request.getContextPath()%>/resources/css/estilo.css">

<title>Visitantes</title>
</head>
<body class="conteiner">
	<%@ include file="fragment/topofragment.html"%>

	<section>
	<div class="row">
		<%@ include file="fragment/menu.html"%>
		<div class="col-md-10">
			<article>
				<h3>Lista de visitantes</h3>
			<br />

			<table class="table table-hover">
				<thead>
					<tr>
						<th>Nome</th>
						<th>Motivo</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Jack</td>
						<td>Arrumar fechadura da porta</td>
					</tr>
				</tbody>
			</table>
			<a
				href="<%= request.getContextPath()%>CadastroVisitante.jsp"><button class="btn btn-default">Novo Visitante</button></a>
			</article>
		</div>
	</div>
	</section>
	<%@ include file="fragment/rodape.html"%>

	<script src="resources/jquery/jquery-2.1.4.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
	<script src="resources/script/script.js"></script>
</body>
</html>