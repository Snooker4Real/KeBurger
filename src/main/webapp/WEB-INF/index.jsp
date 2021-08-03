<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>KeBurger</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

</head>
<body>

<div class="main card text-center d-flex justify-content-center" style="width: 20rem">
    <h1>Commande de Restauration Rapide</h1>
    <!--Après que le formulaire est submit ça nours enverra à la page /Add-->
    <form action="Entete" method="post">
        <div class="col">
            <div class="form-check">
                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                <label class="form-check-label" for="flexRadioDefault1">
                    Sur place
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
                <label class="form-check-label" for="flexRadioDefault2">
                    A emporter
                </label>
            </div>
        </div>


        <div class="col">
            <label>Votre Burger :</label>
            <select class="form-select" aria-label="Default select example">
                <c:forEach var="burger" items="${burgers}">
                    <option value="${burger.id}">${burger.nom} (${burger.prix})</option> <label>${burger.prix} Euros</label>
                </c:forEach>
            </select>
        </div>

        <div class="col">
            <label>Votre accompagnement : </label>
            <select class="form-select" aria-label="Default select example">
                <c:forEach var="accompagnement" items="${accompagnements}">
                    <option value="${accompagnement.nom}">${accompagnement.nom} (${accompagnement.sup})</option>
                </c:forEach>
            </select>
        </div>

        <div class="col">
            <label>Votre boisson: </label>
            <select class="form-select" aria-label="Default select example">
                <c:forEach var="boisson" items="${boissons}">
                    <option value="${boisson.nom}">${boisson.nom}</option>
                </c:forEach>

            </select>
        </div>
        <div class="col form-floating">
            <label for="floatingTextarea2">Remarque sur la commande</label>
            <textarea class="form-control" placeholder="Laissez une remarque" id="floatingTextarea2" style="height: 100px"></textarea>
        </div>

        <div class="col">
            <label>Sauce :</label>
            <c:forEach var="sauce" items="${sauces}">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                    <label class="form-check-label" for="flexCheckDefault">
                        ${sauce.nom}
                    </label>
                </div>
            </c:forEach>
        </div>

        <div class="col input-group mb-3">
            <span class="input-group-text" id="basic-addon1">Numéro de CB</span>
            <input type="text" class="form-control" placeholder="CB" aria-label="CB" aria-describedby="basic-addon1" maxlength="16">
        </div>

        <div class="col">
        <label>Mois : </label>
            <select class="form-select" aria-label="Default select example">

                <c:forEach var="mois" items="${mois}">
                    <option value="${mois}">${mois}</option>
                </c:forEach>

            </select>
        </div>
        <div class="col">
            <label>Année : </label>
            <select class="form-select" aria-label="Default select example">
                <option value="1">2021</option>
                <option value="1">2022</option>
                <option value="1">2023</option>
                <option value="1">2024</option>
            </select>
        </div>
        <div class="col input-group mb-3">
            <span class="input-group-text" id="basic-addon2">Cryptogramme</span>
            <input type="text" class="form-control" placeholder="Cryptogramme" aria-label="Cryptogramme" aria-describedby="basic-addon1" maxlength="3">
        </div>

        <div class="col-12">
            <button type="submit" value="Entete" class="btn btn-success">Commander</button>
        </div>
    </form>
</div>
</body>
</html>