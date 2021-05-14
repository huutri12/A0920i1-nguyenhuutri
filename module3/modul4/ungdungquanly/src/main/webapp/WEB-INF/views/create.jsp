<%--
  Created by IntelliJ IDEA.
  User: PV
  Date: 12/05/2021
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Create Customer</h3>
<form action="/create" method="post">
    <p>Id: <input type="text" name="id"></p>
    <p>Name: <input type="text" name="name"></p>
    <p>Email: <input type="text" name="email"></p>
    <p>Address: <input type="text" name="address"></p>

    <input type="submit" value="Create">
</form>
</body>
</html>
