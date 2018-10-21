<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
    <title>Coin Base</title>
    <link href="../../webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" />
    <script src="../../webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
    <div class="container">
        <h2>Coin List</h2>
        <table class="table table-striped">
            <thead>
                <th scope="row">id</th>
                <th scope="row">country</th>
                <th scope="row">nominal</th>
                <th scope="row">year</th>
                <th scope="row">material</th>
                <th scope="row">diameter</th>
                <th scope="row">weight</th>
                <th scope="row">picture</th>
                <th scope="row">description</th>
            </thead>
            <tbody>
                <c:forEach items="${coinList}" var="coin">
                    <tr>
                        <td>${coin.id}</td>
                        <td>${coin.country}</td>
                        <td>${coin.nominal}</td>
                        <td>${coin.year}</td>
                        <td>${coin.material}</td>
                        <td>${coin.diameter}</td>
                        <td>${coin.weight}</td>
                        <td>${coin.picture}</td>
                        <td>${coin.description}</td>
                        <td>
                            <spring:url value="/coin/edit_coin/${coin.id}" var="updateURL"/>
                            <a class="btn btn-success" href="${updateURL}" role="button">Update</a>
                        </td>
                        <td>
                            <spring:url value="/coin/delete_coin/${coin.id}" var="deleteURL"/>
                            <a class="btn btn-danger" href="${deleteURL}" role="button">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <spring:url value="/coin/add_coin" var="addURL"/>
        <a class="btn btn-primary" href="${addURL}" role="button">Add new coin</a>
    </div>
</body>
</html>