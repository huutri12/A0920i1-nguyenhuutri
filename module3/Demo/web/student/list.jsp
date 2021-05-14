<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PV
  Date: 31/03/2021
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Student</title>
</head>
<body>
    <a href="save" style="color: lightgreen">Create new Student</a>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Address</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <c:forEach items="${student}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td>${student.address}</td>
                <th><a href="delete?id=${student.id}">Delete</a></th>
                <th><a href="edit?id=${student.id}">Edit</a></th>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
