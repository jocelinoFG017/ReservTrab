<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>
			Listar
		</title>
		<link rel="stylesheet" href="../assets/css/materialize.min.css">
		<script src="../assets/js/materialize.min.js"> </script>
	</head> 
	<body>
        
   <jsp:include page="../menu.jsp">
		<table>
			<thead>
				<tr>
					<th> Descrição </th>
					<th> # </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${itemList}" var="corrente"> <!--   -->
					<tr>
						<td> ${corrente.descricao}</td><!-- cria a celula  -->
						<td> <a href="editar?id=${corrente.idItem }"> editar</a> <!--  botao para editar o item -->
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
	
		
	</body>
</html>