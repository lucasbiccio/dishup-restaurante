<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			    		<li class="top-title">
			    			<a href="#">Administrador de Restaurantes</a>
			    		</li>
			    	</ul>
			    	<ul class="nav pull-right">
			    		<li class="divider-vertical"></li>
  						<li class="dropdown">
    						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
      							${userName}
      							<b class="caret"></b>
    						</a>
    						<ul class="dropdown-menu">
      							<li>
      								<a href="#">Minha conta</a>
      							</li>
      							<li>
      								<a href="<spring:url value="/logout"/>">Sair</a>
      							</li>
    						</ul>
  						</li>
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
				    	<li class="active">
				    		<a href="#tab1" data-toggle="tab">Restaurantes</a>
				    	</li>
    					<li>
    						<a href="#tab2" data-toggle="tab">Card�pios</a>
    					</li>
    					<li>
    						<a href="#tab3" data-toggle="tab">Vouchers</a>
    					</li>
				  	</ul>
				  	<div class="tab-content">
				    	<div class="tab-pane active" id="tab1">
				    		<h3>Gerencie seus restaurantes</h3>
					    	<p>
					    		<a href="<spring:url value="/newRestaurant" htmlEscape="true"/>">
					    			<button class="btn btn-danger btn-small" type="button">
					    				<i class="icon-plus icon-white"></i>
					    					Novo restaurante
					    			</button>
					    		</a>
					    	</p>
					    	<table class="table table-bordered table-hover table-rest">
				            	<thead>
					                <tr>
					                	<th>#</th>
					                  	<th>Nome</th>
					                </tr>
				            	</thead>
				              	<tbody>
									<c:forEach items="${listRestaurant}" var="restaurant">
					                	<tr>
					                  		<td> ${restaurant.id} </td>
					                  		<td> ${restaurant.socialReason}
					                  			<button class="btn btn-mini btn-inverse pull-right" type="button">
					                  				<i class="icon-remove icon-white"></i>
					                  			</button>
					                  			<button class="btn btn-mini pull-right btn-edit" type="button">
					                  				<i class="icon-pencil"></i>
					                  			</button>
					                  		</td>
					                	</tr>
									</c:forEach>
				              	</tbody>
							</table>
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
