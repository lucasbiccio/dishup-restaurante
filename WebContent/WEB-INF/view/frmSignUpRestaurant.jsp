<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Dish Up - Restaurantes</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<script src="js/jquery-1.9.1.min.js"></script>
		<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
		<link href="css/style.css" rel="stylesheet" media="screen">
		<script src="js/bootstrap.min.js"></script>
	</head>
<body>
	<div class="row-fluid">
		<div class="navbar">
			<div class="navbar-inner">
			    <a class="brand" href="#">
			    	<img src="img/logo.png" width="100" />
			    </a>
			    <ul class="nav">
			    	<li class="divider-vertical"></li>
			    	<li class="top-title">
			    		<a href="#">Dish Up - Restaurantes</a>
			    	</li>
			    </ul>
			    <ul class="nav pull-right">
			    	<li class="divider-vertical"></li>
			        <li>
			        	<a href="#">Ajuda</a>
			        </li>
			    </ul>
			</div>
		</div>
	</div>
	<div class="row box-adm">
      	<div class="span12 box-home">
      		<div class="tabbable tabs-left">
				<ul class="nav nav-tabs">
				    <li class="active"><a href="#tab1" data-toggle="tab">Cadastre-se</a></li>
				</ul>
				<div class="tab-content">
				    <div class="tab-pane active" id="tab1">
				    	<ul class="breadcrumb">
							<li class="active">Dados Básicos - Restaurante</li>
						</ul>
						<!-- Email do Restaurante -->
						<div class="control-group control-adm">
							<label class="control-label" for="emailRestaurante">E-mail</label>
							<div class="controls">
								<input type="text" id="emailRestaurante" class="input-xxlarge" placeholder="">
							</div>
						</div>
						<!-- CNPJ do Restaurante -->
						<div class="control-group control-adm">
							<label class="control-label" for="rootCNPJ">CNPJ</label>
							<div class="controls">
								<input type="text" id="rootCNPJ" class="input-medium" placeholder="">&nbsp;&nbsp;
								<input type="text" id="filialCNPJ" class="input-mini" placeholder="">&nbsp;&nbsp;
								<input type="text" id="controlCNPJ" class="input-mini" placeholder="">&nbsp;&nbsp;
							</div>
						</div>
						<!-- Razao Social do Restaurante -->
						<div class="control-group control-adm">
							<label class="control-label" for="razaoSocial">Razão Social</label>
							<div class="controls">
								<input type="text" id="razaoSocial" class="input-xxlarge" placeholder="">
							</div>
						</div>
						<div class="control-group control-adm">
							<label class="control-label" for="bairro">Tipo de Culinaria</label>
							<select>
								<option>Selecione</option>
							</select>
						</div>
						<ul class="breadcrumb">
							<li class="active">Endereço Restaurante</li>
						</ul>
						<!-- CEP -->
						<div class="control-group control-adm">
							<label class="control-label" for="CEP">CEP</label>
							<div class="controls">
								<input type="text" id="CEP" class="input-medium" placeholder="">
							</div>
						</div>
						<!-- Logradouro -->
						<div class="control-group control-adm">
							<label class="control-label" for="logradouro">Logradouro</label>
							<div class="controls">
								<input type="text" id="logradouro" class="input-xxlarge" placeholder="">
							</div>
						</div>
						<!-- Número -->
						<div class="control-group control-adm">
							<label class="control-label" for="numero">Número</label>
							<div class="controls">
								<input type="text" id="numero" class="input-medium" placeholder="">
							</div>
						</div>
						<!-- Complemento -->
						<div class="control-group control-adm">
							<label class="control-label" for="complemento">Complemento</label>
							<div class="controls">
								<input type="text" id="complemento" class="input-large" placeholder="">
							</div>
						</div>
						<!-- Bairro -->
						<div class="control-group control-adm">
							<label class="control-label" for="bairro">Bairro</label>
							<div class="controls">
								<input type="text" id="bairro" class="input-xxlarge" placeholder="">
							</div>
						</div>
						<!-- Pais -->
						<div class="control-group control-adm">
							<label class="control-label" for="bairro">Pais</label>
							<select>
								<option>Selecione</option>
							</select>
						</div>
						<!-- Estado -->
						<div class="control-group control-adm">
							<label class="control-label" for="bairro">Estado</label>
							<select>
								<option>Selecione</option>
							</select>
						</div>
						<!-- Cidade -->
						<div class="control-group control-adm">
							<label class="control-label" for="bairro">Cidade</label>
							<select>
								<option>Selecione</option>
							</select>
						</div>
						<ul class="breadcrumb">
							<li class="active">Informações de Contato do Restaurante</li>
						</ul>
						<!-- Telefone do Restaurante -->
						<div class="control-group control-adm">
							<label class="control-label" for="rootCNPJ">Telefone</label>
							<div class="controls">
								<input type="text" id="dddTelefone" class="input-mini" placeholder="">&nbsp;&nbsp;
								<input type="text" id="numeroTelefone" class="input-medium" placeholder="">
							</div>
						</div>
						<!-- Site do Restaurante -->
						<div class="control-group control-adm">
							<label class="control-label" for="rootCNPJ">Site</label>
							<div class="controls">
								<input type="text" id="site" class="input-xxlarge" placeholder="">
							</div>
						</div>
						<ul class="breadcrumb">
							<li class="active">Responsável pelo Restaurante ou Pessoa de Contato</li>
						</ul>
						<div class="control-group control-adm">
							<label class="control-label" for="rootCPF">CPF</label>
							<div class="controls">
								<input type="text" id="rootCPF" class="input-medium" placeholder="">&nbsp;&nbsp;
								<input type="text" id="controlCNPJ" class="input-mini" placeholder="">
							</div>
						</div>
						<div class="control-group control-adm">
							<label class="control-label" for="nome">Nome</label>
							<div class="controls">
								<input type="text" id="name" class="input-xxlarge" placeholder="">
							</div>
						</div>
						<div class="control-group control-adm">
							<label class="control-label" for="bairro">Cargo</label>
							<select>
								<option>Selecione</option>
							</select>
						</div>
						<!-- Telefone do Restaurante -->
						<div class="control-group control-adm">
							<label class="control-label" for="rootCNPJ">Telefone</label>
							<div class="controls">
								<input type="text" id="dddTelefone" class="input-mini" placeholder="">&nbsp;&nbsp;
								<input type="text" id="numeroTelefone" class="input-medium" placeholder="">
							</div>
						</div>
				    </div>
				    <div align="center">
				    <button type="submit" class="btn btn-danger btn-medium">Cadastrar</button>
				    </div>
				    <div style="height: 40px;">
				    </div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>