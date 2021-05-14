<%--
  Created by IntelliJ IDEA.
  User: PV
  Date: 29/03/2021
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Currency Converter</h2>
  <form  action="converter.jsp" method="post">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
  </form>

  <h2>Vietnamese Dictionary</h2>
  <form action="dictionary.jsp" method="post">
    <input type="text" name="search" placeholder="Enter your word: "/>
    <input type="submit" id="sumit" value="Search"/>
  </form>

  </body>
</html>
