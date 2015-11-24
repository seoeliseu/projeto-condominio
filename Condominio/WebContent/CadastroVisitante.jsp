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
	href="<%=request.getContextPath()%>/resources\css\estilo.css">

<title>Cadastro Visitante</title>
</head>
<body class="conteiner">
	<%@ include file="fragment/topofragment.html"%>

	<section>
	<div class="row">
		<%@ include file="fragment/menu.html"%>
		<div class="col-md-10">
			<article>
			<h3>Cadastro de Visitante</h3>

			<form class="form-horizontal form-search" name="formCoordenador"
				action="visitante?action=cadastrar" method="post">
				<div class="cold-md-12">
					<fieldset class="fsStyle">
						<legend class="legendStyle"> Pessoais </legend>
						
						<div class="form-group">
							<label for="nome" class="col-sm-2 control-label">Nome</label>
							<div class="col-sm-8">
								<input class="form-control " type="text" name="nome"><br>
							</div>
						</div>
						
						<div class="form-group">
							<label for="rg" class="col-sm-2 control-label">RG</label>
							<div class="col-sm-3">
								<input class="form-control " type="text" nome="rg"><br>
							</div>
							<label for="cpf" class="col-sm-2 control-label">CPF</label>
							<div class="col-sm-3">
								<input class="form-control input-form" type="text" nome="cpf"><br>
							</div>
						</div>
						<div class="form-group">
							<label for="parentesco" class="col-sm-2 control-label">Parentesco</label>
							<div class="col-sm-8">
								<select class="form-control" id="parente">
									<option>Coordenador 1</option>
									<option>Coordenador 2</option>
								</select>
							</div>
						</div>
					</fieldset>
					<fieldset class="fsStyle">
						<legend class="legendStyle"> Contato </legend>
						<div class="form-group">
							<label for="celular" class="col-sm-2 control-label">Telefone Celular</label>
							<div class="col-sm-3">
								<input class="form-control " type="text" name="celular"><br>
							</div>
							<label for="fixo" class="col-sm-2 control-label">Telefone Fixo</label>
							<div class="col-sm-3">
								<input class="form-control " type="text" name="fixo"><br>
							</div>
						</div>
					</fieldset>
					<fieldset class="fsStyle">
						<legend class="legendStyle"> Endere�o </legend>
						<div class="form-group">
							<label for="rua" class="col-sm-2 control-label">Rua</label>
							<div class="col-sm-8">
								<input class="form-control " type="text" name="rua"><br>
							</div>
						</div>
						<div class="form-group">
							<label for="bairro" class="col-sm-2 control-label">Bairro</label>
							<div class="col-sm-4">
								<input class="form-control " type="text" name="bairro"><br>
							</div>
							<label for="numero" class="col-sm-2 control-label">N�mero</label>
							<div class="col-sm-2">
								<input class="form-control " type="text" name="numero"><br>
							</div>
						</div>
						<div class="form-group">
							<label for="cep" class="col-sm-2 control-label">CEP</label>
							<div class="col-sm-4">
								<input class="form-control " type="text" name="cep"><br>
							</div>
							<label for="uf" class="col-sm-2 control-label">UF</label>
							<div class="col-sm-2">
								<select class="form-control" >
									<option>GO</option>
									<option>PA</option>
								</select>
							</div>
						</div>
					</fieldset>
					<div class="form-group">
							<div class="col-sm-offset-2 col-sm-1">
								<button class="btn btn-default" type="submit" name="salvar">Salvar</button>
							</div>
							<div class="col-sm-1">
								<button class="btn btn-default" type="button" name="cancelar">Cancelar</button>
							</div>
					</div>
					
				</div>
			</form>

			</article>
		</div>
	</div>
	</section>
	<%@ include file="fragment/rodape.html"%>

	<script src="resources/jquery/jquery-2.1.4.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
	<script src="resources/js/script.js"></script>
</body>
</html>