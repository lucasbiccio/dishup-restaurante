<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Dishup - Administrador de Restaurantes</title>
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
				    	<li class="active"><a href="#tab1" data-toggle="tab">Restaurantes</a></li>
    					<li><a href="#tab2" data-toggle="tab">Vouchers</a></li>
				  	</ul>
				  	<div class="tab-content">
					    	<div class="tab-pane active" id="tab1">
					    		<ul class="breadcrumb">
									<li><a href="#">Gerenciar restaurantes</a> <span class="divider">/</span></li>
									<li class="active">Novo restaurante</li>
								</ul>
					  		<ul class="nav nav-pills">
								<li class="active"><a href="<spring:url value=""/>">Informa��es gerais</a></li>
							  	<li><a href="<spring:url value=""/>">Dados b�sicos</a></li>
							  	<li><a href="<spring:url value=""/>">Imagens</a></li>
							</ul>
					    	<form:form ccsClass="form-horizontal" action="" method="POST" modelAttribute="restaurant">
					    		<div class="box-sing-rest">
									<fieldset class="form-in-title"><legend>&nbsp;&nbsp;Perfil do restaurante</legend></fieldset>
									<div class="row">
										<div class="span3">
											<div class="img-profile">
												<img src="img/profile-ex.png" class="img-rounded">
												<span class="bottom-image"><a class="link-d" href="#">alterar imagem</a></span>
											</div>
										</div>
										<div class="span7">
											<div class="control-group control-adm first-el-form">
												<label class="control-label large" for="inputNomeFantasia">Nome comercial</label>
											    <div class="controls">
											    	<form:input cssClass="input-xlarge" path=""/>
											    </div>
											</div>
											<div class="control-group control-adm">
												<label class="control-label large" for="inputNomeFantasia">Descri��o resumida</label>
											    <div class="controls">
											    	<form:textarea path="" rows="3" cssClass="input-xlarge" placeholder="Apresenta��o do restaurante (m�x. 150 caracteres)"/>
											    </div>
											</div>
											<div class="control-group control-adm">
												<label class="control-label large" for="inputNomeFantasia">Descri��o completa</label>
											    <div class="controls">
											    	<form:textarea path="" rows="6" ccsClass="input-xlarge" placeholder="Apresenta��o completa do restaurante (m�x. 300 caracteres)"/>
											    </div>
											</div>
											<div class="control-group control-adm">
												<label class="control-label large" for="inputNomeFantasia">Dias e hor�rios de funcionamento</label>
											    <div class="controls">
											    	<textarea rows="2" id="inputNomeFantasia" class="input-xlarge" placeholder="Ex: Segunda a Sexta - 10h00 �s 15h00 / S�bados e Domingos - 10h00 �s 15h00"></textarea>
											    </div>
											</div>
										</div>
									</div>
								</div>
								<div class="btn-form"><button class="btn btn-danger" type="submit">Salvar</button></div>
					    	</form:form>
					    </div>
					    <div class="tab-pane" id="tab2">
					    	<p>vouchers</p>
					    </div>
				  	</div>
				</div>
      		</div>
    	</div>
    	<script src="js/jquery-1.9.1.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>