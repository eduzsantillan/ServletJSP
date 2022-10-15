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

    <h1> El resultado de la operacion fue exitosa:  </h1>

    <h3> Detalle: <%=request.getAttribute("mensaje")%> </h3>
</body>
</html>
