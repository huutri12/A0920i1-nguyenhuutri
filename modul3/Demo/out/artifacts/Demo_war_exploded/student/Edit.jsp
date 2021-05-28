<%--
  Created by IntelliJ IDEA.
  User: PV
  Date: 31/03/2021
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Student</title>
</head>
<body>

    <h1>Edit Student</h1>
    <form action="/edit" method="post">
        <label for="id">ID: </label>
        <input id="id" type="text" name="id"/><br>
        <label for="id">Name: </label>
        <input type="text" name="name"/><br>

        <label for="id">Age: </label>
        <input type="text" name="age"/><br>

        <label for="id">Address: </label>
        <input type="text" name="address"/><br>
        <button type="submit">Edit</button>
    </form>
</body>
</html>
