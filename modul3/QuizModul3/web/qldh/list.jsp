<%--
  Created by IntelliJ IDEA.
  User: PV
  Date: 03/05/2021
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh Sách Sản Phẩm</h1>
<h2>
    <a href="/qlsp?action=create">Thêm Mới</a>
</h2>
<div align="center">
    <table border="1" cellpadding="5">
        <tr>
            <th>STT</th>
            <th>Name</th>
            <th>Price</th>
            <th>Discount</th>
            <th>Stock</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${qlsp.namesp}"/></td>
                <td><c:out value="${qlsp.gia}"/></td>
                <td><c:out value="${qlsp.mucgiam}"/></td>
                <td><c:out value="${qlsp.tonkho}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
