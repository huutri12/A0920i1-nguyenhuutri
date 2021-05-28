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
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Thêm Mới</h2>
            </caption>
                <th>Name</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Price</th>
                <td>
                    <input type="number" name="price" id="price" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Discount</th>
                <td>
                    <input type="number" name="discount" id="discount" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Stock</th>
                <td>
                    <input type="number" name="stock" id="stock" size="15"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Thêm"/>
                </td>
            </tr>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
