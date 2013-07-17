<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Dish Up - Restaurantes</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
		<link href="css/style.css" rel="stylesheet" media="screen">
	</head>
	<body>
	<div class="row-fluid">
		<div class="navbar">
			<div class="navbar-inner">
		    	<a class="brand" href="#"><img src="img/logo.png" width="100" /></a>
		    	<ul class="nav">
		    		<li class="divider-vertical"></li>
		    		<li class="top-title"><a href="#">Administrador de Restaurantes</a></li>
		    	</ul>
		    	<ul class="nav pull-right">
		    		<li class="divider-vertical"></li>
 						<li class="dropdown">
   						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
     							${userName}
     							<b class="caret"></b>
   						</a>
   						<ul class="dropdown-menu">
     							<li><a href="#">Minha conta</a></li>
     							<li><a href="<spring:url value="logout"/>">Sair</a></li>
   						</ul>
 						</li>
		    		<li class="divider-vertical"></li>
		        	<li><a href="#">Ajuda</a></li>
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
						<form:form action="" method="" modelAttribute="">
							<!-- CNPJ do Restaurante -->
							<div class="control-group control-adm">
								<label class="control-label" for="CNPJ">CNPJ</label>
								<div class="controls">
									<input type="text" id="rootCNPJ" name="rootCNPJ" class="input-medium" placeholder="">&nbsp;&nbsp;
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
								<label class="control-label" for="tipoCulinaria">Tipo de Culinaria</label>
								<select>
									<option>Selecione</option>
									<c:forEach items="${culinaryTypeList}" var="culinary">
										<option value="${culinary.id}"> ${culinary.name} </option>
									</c:forEach>
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
								<label class="control-label" for="logradouro">Endereço</label>
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
									<c:forEach items="${countryList}" var="country">
										<option value="${country.id}"> ${country.name} </option>
									</c:forEach>
								</select>
							</div>
							<!-- Estado -->
							<div class="control-group control-adm">
								<label class="control-label" for="bairro">Estado</label>
								<select>
									<option>Selecione</option>
									<c:forEach items="${stateList}" var="state">
										<option value="${state.id}"> ${state.name} </option>
									</c:forEach>	
								</select>
							</div>
							<!-- Cidade -->
							<div class="control-group control-adm">
								<label class="control-label" for="bairro">Cidade</label>
								<select>
									<option>Selecione</option>
									<c:forEach items="${cityList}" var="city">
										<option value="${city.id}"> ${city.name} </option>
									</c:forEach>
								</select>
							</div>
							<ul class="breadcrumb">
								<li class="active">Informações de Contato do Restaurante</li>
							</ul>
							<!-- Telefone do Restaurante -->
							<div class="control-group control-adm">
								<label class="control-label" for="telephone">Telefone</label>
								<div class="controls">
									<input type="text" id="dddTelefone" class="input-mini" placeholder="">&nbsp;&nbsp;
									<input type="text" id="numeroTelefone" class="input-medium" placeholder="">
								</div>
							</div>
							<!-- Site do Restaurante -->
							<div class="control-group control-adm">
								<label class="control-label" for="site">Site</label>
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
									<input type="text" id="controlCPF" class="input-mini" placeholder="">
								</div>
							</div>
							<div class="control-group control-adm">
								<label class="control-label" for="nome">Nome</label>
								<div class="controls">
									<input type="text" id="nome" class="input-xxlarge" placeholder="">
								</div>
							</div>
							<div class="control-group control-adm">
								<label class="control-label" for="cargo">Cargo</label>
								<select>
									<option>Selecione</option>
									<c:forEach items="${employmentList}" var="employment">
										<option value="${employment.id}"> ${employment.name} </option>
									</c:forEach>
								</select>
							</div>
							<!-- Telefone do Responsavel Restaurante -->
							<div class="control-group control-adm">
								<label class="control-label" for="telefone">Telefone Responsavel</label>
								<div class="controls">
									<input type="text" id="dddTelefoneResponsavel" class="input-mini" placeholder="">&nbsp;&nbsp;
									<input type="text" id="numeroTelefoneResponsavel" class="input-medium" placeholder="">
								</div>
							</div>
							<div align="center">
				    			<button type="submit" class="btn btn-danger btn-medium">Cadastrar</button>
				    		</div>
				    	</form:form>
				    </div>
				    <div style="height: 40px;">
				    </div>
				</div>
			</div>
		</div>
	</div>
	<!-- Scripts Verificar a possibilidade futuramente de manter somente um unico JS -->
	<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="js/jquery.maskedinput.min.js" type="text/javascript"></script>
	<script src="js/jquery.limit-1.2.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script type="text/javascript">
	$(document).ready(function(){
		/* inclusao das mascaras nos campos */
		$("#rootCNPJ").mask("99.999.999",{placeholder:" "});
		$("#filialCNPJ").mask("9999",{placeholder:" "});
		$("#controlCNPJ").mask("99",{placeholder:" "});
		$("#CEP").mask("99999-999",{placeholder:" "});
		$("#dddTelefone").mask("999",{placeholder:" "});
		$("#numeroTelefone").mask("9999-9999?9",{placeholder:" "});
		$("#rootCPF").mask("999.999.999",{placeholder:" "});
		$("#controlCPF").mask("99",{placeholder:" "});
		$("#dddTelefoneResponsavel").mask("999",{placeholder:" "});
		$("#numeroTelefoneResponsavel").mask("9999-9999?9",{placeholder:" "});
		/* inclusao dos limitadores de caracteres nos campos */
		$("#email").limit('100');
		$("#razaoSocial").limit('100');
		$("#site").limit('100');
		$("#logradouro").limit('100');
		$("#numero").limit('20');
		$("#bairro").limit('80');
		$("#nome").limit('100');
		$("#complemento").limit('100');
	});
	</script>
</body>
</html>