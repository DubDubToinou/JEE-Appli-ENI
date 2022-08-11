<%--
  Created by IntelliJ IDEA.
  User: Be Quiet
  Date: 11/08/2022
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Accueil Suivi des Repas</title>
</head>
<body>

<h1>Accueil suivi des repas</h1>

<form action="${pageContext.request.contextPath}/ServletAjoutRepas" method="get">
    <input type="submit" value="Ajouter un Repas">
</form>

<form action="${pageContext.request.contextPath}/ServletVisualisationRepas" method="get">
    <input type="submit" value="Historique des Repas">
</form>

</body>
</html>
