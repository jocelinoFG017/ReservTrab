<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>
			Editar
		</title>
	</head> 
	<body>
	<jsp:include page="../menu.jsp">
	<c:if test="${gravado }">
	<h1> Item gravado com sucesso</h1>
	</c:if>
		<form action="gravar" method="post">
			<input type="hidden" name="item.ID" value="${entidade.ID}">
			<div class="row">
    		    <div class="input-field col s6">
    		      <input name="item.descricao" type="text" value="${item.descricao}" class="validate" >
        		</div>
       		</div>
			Descricao: <input type="text" name="item.descricao" value="${entidade.descricao}">
			
			
			<input type="submit" class="btn" value="Gravar">
		</form>
	</body>
</html>