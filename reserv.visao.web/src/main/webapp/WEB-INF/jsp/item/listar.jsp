<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
     prefix="c" %>
<html>
<head>
<link rel="stylesheet"
    href="../assets/css/materialize.min.css" >
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <script  src="../assets/js/materialize.min.js" ></script>
</head>
<body>
<jsp:include page="../menu.jsp"/>
<table>
	<thead>
	  <tr>
	    <th> Descrição</th>
	    <th> # </th>
	    <th> <i class="material-icons">delete</i> </th>
	  </tr>
	</thead>
	<tbody>
	  <c:forEach items="${itemList}" var="corrente"  >
	  	<tr>
	  	  <td>${corrente.descricao}</td>
	  	  <td>${corrente.idItem }</td>
	  	  
	  	</tr>
	  </c:forEach>
	</tbody>
</table>

</body>
</html>