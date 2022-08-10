<%--
  Created by IntelliJ IDEA.
  User: Be Quiet
  Date: 10/08/2022
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultat</title>

</head>
<body>
    <%
        String sChoixIA = (String) request.getAttribute("sChoixIA");
        String choixJoueur = (String) request.getAttribute("choixJoueur");
        String resultat = (String) request.getAttribute("resultat");

    %>

    <h1>Résultat de la partie de Chi Fou Mi</h1>
    <h2>l'IA à jouer : <%= sChoixIA %></h2>
    <h2>Vous avez joué : <%= choixJoueur %></h2>
    <h1>Le résultat est : <%= resultat %></h1>

    <p>Vous souhaitez rejouer?</p><a href="${pageContext.request.contextPath}/tpchifoumi/chifoumi.jsp">Cliquez ici !</a>

</body>
</html>
