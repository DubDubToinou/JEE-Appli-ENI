<%--
  Created by IntelliJ IDEA.
  User: Be Quiet
  Date: 11/08/2022
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Historique des Repas</title>
</head>
<body>

<h1>Liste des repas:</h1>

<table>
    <thead>
        <tr>
           <th style="background: #2AF598">Menu</th>
        </tr>
    </thead>
    <tbody>
        <tr>
           <td>Date</td>
            <td>Heure</td>
            <td>Details</td>
        </tr>
    </tbody>
TODO
    <td>
        <c:forEach items="${ listeDeRepas }" var="listeDeRepas" >
            <c:out value="${}"/>
        </c:forEach>
    </td>

</table>


<a href="${pageContext.request.contextPath}/suiviDesRepas/Accueil.jsp">Retour à l'accueil</a>

</body>
</html>
