<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Dishup - Administrador de Restaurantes</title>
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
			    	<a class="brand" href="#"><img src="img/logo.png" width="100" /></a>
			    	<ul class="nav">
			    		<li class="divider-vertical"></li>
			    		<li class="top-title"><a href="#">Administrador de Restaurantes</a></li>
			    	</ul>
			    	<ul class="nav pull-right">
			    		<li class="divider-vertical"></li>
  						<li class="dropdown">
    						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
      							Virgilio Junior
      							<b class="caret"></b>
    						</a>
    						<ul class="dropdown-menu">
      							<li><a href="#">Minha conta</a></li>
      							<li><a href="#">Sair</a></li>
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
    					<li><a href="#tab2" data-toggle="tab">Card�pios</a></li>
    					<li><a href="#tab3" data-toggle="tab">Vouchers</a></li>
				  	</ul>
				  	<div class="tab-content">
				    	<div class="tab-pane active" id="tab1">
				    		<h3>Novo restaurante</h3>
					    	<ul class="breadcrumb">
								<li><a href="#">Gerenciar restaurantes</a> <span class="divider">/</span></li>
								<li class="active">Novo restaurante</li>
							</ul>
					    	<form class="form-horizontal">
					    		<select class="select-copy">
									<option>Copiar dados de...</option>
								  	<option>Restaurante Nome Um</option>
								  	<option>Restaurante Nome Dois</option>
								  	<option>Restaurante Nome Tr�s</option>
								</select><br />
								<div class="box-sing-rest">
									<select class="select-copy first-el-form">
										<option>� filial de...</option>
									  	<option>Restaurante Nome Um</option>
									  	<option>Restaurante Nome Dois</option>
									  	<option>Restaurante Nome Tr�s</option>
									</select>
									<div class="control-group control-adm">
										<label class="control-label" for="inputNomeFantasia">Nome Fantasia</label>
									    <div class="controls">
									    	<input type="text" id="inputNomeFantasia" class="input-xxlarge" placeholder="">
									    </div>
									</div>
									<div class="control-group control-adm">
										<label class="control-label" for="inputNomeFantasia">Raz�o Social</label>
									    <div class="controls">
									    	<input type="text" id="inputNomeFantasia" class="input-xxlarge" placeholder="">
									    </div>
									</div>
									<div class="control-group control-adm">
										<label class="control-label" for="inputNomeFantasia">CNPJ</label>
									    <div class="controls">
									    	<input type="text" id="inputNomeFantasia" class="input-xlarge" placeholder="">
									    </div>
									</div>
									<div class="control-group control-adm">
										<label class="control-label" for="inputNomeFantasia">E-mail</label>
									    <div class="controls">
									    	<input type="text" id="inputNomeFantasia" class="input-xlarge" placeholder="">
									    </div>
									</div>
									<div class="control-group control-adm">
										<label class="control-label" for="inputNomeFantasia">Site</label>
									    <div class="controls">
									    	<input type="text" id="inputNomeFantasia" class="input-xlarge" placeholder="">
									    </div>
									</div>
								</div>
								<div class="box-sing-rest">
									<div class="control-group control-adm first-el-form">
										<label class="control-label" for="inputNomeFantasia">CEP</label>
									    <div class="controls">
									    	<input type="text" id="inputNomeFantasia" class="input-small" placeholder="">
									    </div>
									</div>
									<div class="control-group control-adm">
										<label class="control-label" for="inputNomeFantasia">Endere�o</label>
									    <div class="controls">
									    	<input type="text" id="inputNomeFantasia" class="input-xlarge" placeholder="">
									    </div>
									</div>
									<div class="control-group control-adm">
										<label class="control-label" for="inputNomeFantasia">N�mero</label>
									    <div class="controls">
									    	<input type="text" id="inputNomeFantasia" class="input-mini" placeholder="">
									    </div>
									</div>
									<div class="control-group control-adm">
										<label class="control-label" for="inputNomeFantasia">Complemento</label>
									    <div class="controls">
									    	<input type="text" id="inputNomeFantasia" class="input-large" placeholder="">
									    </div>
									</div>
									<div class="control-group control-adm">
										<label class="control-label" for="inputNomeFantasia">Bairro</label>
									    <div class="controls">
									    	<input type="text" id="inputNomeFantasia" class="input-large" placeholder="">
									    </div>
									</div>
									<select class="select-copy span1 first-select">
										<option>UF</option>
									  	<option>SP</option>
									  	<option>RJ</option>
									  	<option>MG</option>
									</select>
									<select class="select-copy">
										<option>Cidade</option>
									  	<option>S�o Paulo</option>
									  	<option>Rio de Janeiro</option>
									  	<option>Belo Horizonte</option>
									</select>
								</div>
								<div class="box-sing-rest">
									<div class="control-group control-adm first-el-form">
										<label class="control-label" for="inputNomeFantasia">CEP</label>
									    <div class="controls">
									    	<input type="text" id="inputNomeFantasia" class="input-small" placeholder="">
									    </div>
									</div>
									<div class="control-group control-adm">
										<label class="control-label" for="inputNomeFantasia">Endere�o</label>
									    <div class="controls">
									    	<input type="text" id="inputNomeFantasia" class="input-xlarge" placeholder="">
									    </div>
									</div>
								</div>
					    	</form>
					    </div>
					    <div class="tab-pane" id="tab2">
					    	<p>cardapios</p>
					    </div>
					    <div class="tab-pane" id="tab3">
					    	<p>vouchers</p>
					    </div>
				  	</div>
				</div>
      		</div>
    	</div>
	</body>
</html>