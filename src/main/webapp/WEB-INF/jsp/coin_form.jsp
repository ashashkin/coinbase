
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
    <title>Add new coin</title>
    <link href="../../webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" />
    <script src="../../webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
    <div class="container">
        <spring:url value="/coin/save_coin" var="saveURL" />
        <h2>Coin</h2>
        <form:form modelAttribute="coinForm" method="post" action="${saveURL}" cssClass="form">
            <form:hidden path="id"/>
            <div class="form-group">
                <label>Country</label>
                <form:input path="country" cssClass="form-control" id="country"/>
            </div>
            <div class="form-group">
                <label>Nominal</label>
                <form:input path="nominal" cssClass="form-control" id="nominal"/>
            <div class="form-group">
                <label>Year</label>
                <form:input path="year" cssClass="form-control" id="year"/>
            </div>
            <div class="form-group">
                <label>Material</label>
                <form:input path="material" cssClass="form-control" id="material"/>
            </div>
            <div class="form-group">
                <label>Weight</label>
                <form:input path="weight" cssClass="form-control" id="weight"/>
            </div>
            <div class="form-group">
                <label>Diameter</label>
                <form:input path="diameter" cssClass="form-control" id="diameter"/>
            </div>
            <div class="form-group">
                <label class="control-label">Picture</label>
                <form:input path="picture" cssClass="form-control-file" id="picture"/>
            </div>
            <div class="form-group">
                <label>Description</label>
                <form:input path="description" cssClass="form-control" id="description"/>
            </div>
                <button type="submit" class="btn btn-primary">Save</button>
        </form:form>
    </div>
</body>
</html>