<%@ page import="isil.pe.proyjsp.model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: edu
  Date: 1/10/22
  Time: 09:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>User's List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
</head>
<body>

    <div class="container">

        <table class="table">
            <thead>
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Last Name</th>
                <th scope="col">Username</th>
                <th scope="col">Document Type</th>
                <th scope="col">Document Number</th>
                <th scope="col">Enable</th>
            </tr>
            </thead>
            <tbody>
            <%List<User> userList = (List<User>) request.getAttribute("list"); %>
            <%
                for (User user: userList) {
                    %>
            <tr>
                <td><%=user.getName()%></td>
                <td><%=user.getLastname()%></td>
                <td><%=user.getUsername()%></td>
                <td><%=user.getTipDoc()%></td>
                <td><%=user.getNroDoc()%></td>
                <td><%=user.getEnable()%></td>
            </tr>
            <%    }%>
            </tbody>
        </table>
    </div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
</body>
</html>
