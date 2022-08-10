<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link href="../css/stylechifoumi.css" rel="stylesheet">
    <title>JSP - Hello World</title>
</head>
<body>
<div class="formJeu">
<h1 class="h1Tentative"> Tentative Chi-Fou-Mi </h1>

    <form class="formChoix" action="${pageContext.request.contextPath}/jeuChifoumi" method="get" >
        <fieldset>
            <legend>Faite votre choix:</legend>
            <div class="formulaire">
                <label class="labelForm">
                    <input type="radio" name="choixJoueur" value="Pierre"><br>
                    <img src="ressources/img/chi.png" alt="image Chi">
                </label>

                <label  class="labelForm">
                    <input type="radio" name="choixJoueur" value="Feuille"><br>
                    <img  src="ressources/img/fou.png" alt="image Fou">
                </label>
                <label class="labelForm">
                    <input type="radio" name="choixJoueur" value="Ciseaux"><br>
                    <img src="ressources/img/mi.png" alt="image Mi">
                </label>
            </div>
            <button class="buttonFormulaire" name="Valider" type="submit">Jouer</button>

        </fieldset>
    </form>
</div>

</body>
</html>