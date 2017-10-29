<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<title>Home Page</title>
		
		<link href="css/style.css" rel="stylesheet" />
		
	</head>
	<body>
	
		<div class="topnav">
		  <a class="active" href="#home">${appTitle}</a>
		  <a href="#contact">Contact Us</a>
		  <a href="#about">About Us</a>
		  <a href="#capgemini">Capgemini</a>
		</div>
		
		<div style="padding-left:16px">
		<hr/>
		<table id ="mobile">
		<tr>
			<th>Mobile Id</th>
    		<th>Mobile Name</th>
    		<th>Price</th>
    		<th>Quantity</th>
    		<th>Action</th>
		</tr>
		
		
		<c:forEach items="${mList}" var="mob">
		<tr>
			<td>	
				<c:out value="${mob.mobileId}"><br/></c:out>
			</td>
			<td>	
				<c:out value="${mob.mobName}"><br/></c:out>
			</td>
			<td>	
				<c:out value="${mob.price}"><br/></c:out>
			</td>
			<td>	
				<c:out value="${mob.quantity}"><br/></c:out>
			</td>
			<td>	
				<c:if test="${mob.quantity > 0}">
					<a href="mobile/book.capg?mobId=${mob.mobileId}">BOOK Mobile</a>
				</c:if>
			
				<c:if test="${mob.quantity == 0}">
					Out Of Stock
				</c:if>
			</td>
		</tr>
			
			</c:forEach>
		
		</table>	

		
	</div>
	
	
	
	<div class="footer">
  		<p>&copy; All Rights Reserved Govind Prajapati</p>
	</div>

	
	
	</body>
</html>