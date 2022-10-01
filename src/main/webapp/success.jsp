<%--
  Created by IntelliJ IDEA.
  User: edu
  Date: 1/10/22
  Time: 09:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registered successfully</title>
</head>
<body>

    <h1> El usuario que se intentó registrar fue insertado en la base de datos </h1>
    <h1> The user you attempt to add was successfully registered in the database </h1>

    <h3> Filas afectadas : <%=request.getAttribute("rowsaffected")%> </h3>
</body>
</html>
