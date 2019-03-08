<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.List,br.alura.com.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="removeEmpresa" var="linkServletRemoveEmpresa" />
<c:url value="mostraEmpresa" var="linkServletMostraEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar empresas</title>
</head>
<body>
	
	<c:if test="${not empty empresa}">
	Empresa ${ empresa } cadastrada com sucesso!
	</c:if>
	
	<h1>Lista de empresas</h1>
	
	<ul>
		<c:forEach items= "${empresas}" var = "empresa">
		<fmt:formatDate value="${ empresa.dataAbertura }" var="dataAbertura" pattern="dd/MM/yyyy"/>
			<li> ${ empresa.nome } - ${ dataAbertura }
				<a href="${ linkServletMostraEmpresa }?id=${empresa.id}" > editar </a>
				<a href="${ linkServletRemoveEmpresa }?id=${empresa.id}" > remover </a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>