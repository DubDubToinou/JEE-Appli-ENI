<%--
  Created by IntelliJ IDEA.
  User: Be Quiet
  Date: 11/08/2022
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajout d'un Repas</title>
</head>
<body>

    <h1>Ajouter un repas</h1>

    <form action="${pageContext.request.contextPath}/ServletAjoutRepas" method="post">
        <label for="dateRepas">Date</label>
        <input type="date" name="dateRepas" id="dateRepas"><br><br>

        <label for="heureRepas">Heure Repas</label>
        <input type="time" name="heureRepas" id="heureRepas"><br><br>

        <label for="alimentsRepas">Liste des Aliments</label>
        <textarea id="alimentsRepas" name="alimentsRepas" rows="2" cols="70"></textarea><br><br>

        <input type="submit" value="Ajouter le Repas">
        <input type="submit" value="Retour à l'accueil">
    </form>
</body>
</html>
