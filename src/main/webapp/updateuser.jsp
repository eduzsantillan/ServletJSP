<%--
  Created by IntelliJ IDEA.
  User: edu
  Date: 15/10/22
  Time: 07:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>

    <h1>Ingrese el DNI </h1>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">

</head>
<body>

    <nav class="navbar bg-light">
        <div class="container">
            <a class="navbar-brand" href="#">
                <img src="/docs/5.2/assets/brand/bootstrap-logo.svg" alt="Bootstrap" width="30" height="24">
            </a>
            <p>Update User</p>
        </div>
    </nav>

    <div class="container">
        <form action="<%=request.getContextPath()%>/UpdateUserServlet" method="post">

            <div class="mb-3">
                <label for="nroDoc" class="form-label">Nro Documento :</label>
                <input type="text" class="form-control" id="nroDoc" name="nroDoc" >
            </div>



            <div class="mb-3">
                <label for="name" class="form-label">Name :</label>
                <input type="text" class="form-control" id="name" name="name">
            </div>

            <div class="mb-3">
                <label for="lastname" class="form-label">Last name :</label>
                <input type="text" class="form-control" id="lastname" name="lastname">
            </div>

            <div class="mb-3">
                <label for="username" class="form-label">Username :</label>
                <input type="text" class="form-control" id="username" name="username">
            </div>

            <div class="mb-3">
                <label for="pass" class="form-label">Pass :</label>
                <input type="password" class="form-control" id="pass" name="pass" >
            </div>

            <div class="mb-3">
                <label for="tipDoc" class="form-label">Tipo Doc :</label>
                <input type="text" class="form-control" id="tipDoc" name="tipDoc" >
            </div>

            <div class="mb-3">
                <label for="enable" class="form-label">Enable :</label>
                <input type="text" class="form-control" id="enable" name="enable" >
            </div>

            <div class="col-auto">
                <button type="submit" class="btn btn-primary mb-3">Update User</button>
            </div>

        </form>
    </div>




    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>





</body>
</html>
