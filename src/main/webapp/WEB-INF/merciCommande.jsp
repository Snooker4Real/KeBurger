<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Burger world</title>
</head>
<body>
<h1>Merci pour la commande</h1>
<h2>Récapitulatif</h2>

<div>
    <c:choose>
        <c:when test="${commande.surPlace==true}">
            <p>Sur place</p>
            <br />
        </c:when>
        <c:otherwise>
            <p>A emporter</p>
            <br />
        </c:otherwise>
    </c:choose>

    <h3>Burger</h3>
    <p> nom : ${commande.burger.nom }<br>
        prix: ${commande.burger.prix }
    </p>
    <h3>Accompagnement</h3>
    <p> nom : ${commande.accompagnement.nom }<br>
        prix: ${commande.accompagnement.prix }
    </p>
    <h3>Boisson</h3>
    <p> nom : ${commande.boisson.nom }<br>
        prix: ${commande.boisson.prix }
    </p>
    <h3>Sauces</h3>
    <ul>
        <c:forEach var="sauce" items="${commande.sauces}">
            <li>${sauce.nom }</li>
        </c:forEach>

    </ul>
    <h3>Remarques</h3>
    <p>
        ${commande.remarques}
    </p>
    <h3>Total</h3>
    <p>
        ${commande.prix} €
    </p>
</div>
</body>
</html>