<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
      		<div class="span5 offset3 box-login">
      			<form class="form-horizontal" action="login" method="post">
  					<fieldset>
    					<legend>&nbsp;&nbsp;Entrar</legend>
  					</fieldset>
  					<div class="control-group">
    					<label class="control-label" for="email">E-mail</label>
    					<div class="controls">
      						<input type="text" id="email" name="email"/>
    					</div>
  					</div>
  					<div class="control-group">
    					<label class="control-label" for="password">Senha</label>
    					<div class="controls">
      						<input type="password" name="password"/>
      						<span class="help-block">
      							<a class="a-gray" href="#">Esqueci minha senha</a>
      						</span>
    					</div>
  					</div>
  					<div class="control-group">
    					<div class="controls">
      						<button type="submit" class="btn btn-danger btn-medium">Entrar</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      						<a href="<spring:url value="/signUpUserRestaurant" htmlEscape="true"/>">
      							<button type="button" class="btn btn-success btn-medium">Cadastre-se</button>
      						</a>
    					</div>
  					</div>
				</form>
      		</div>
    	</div>
    	<script src="js/jquery-1.9.1.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>