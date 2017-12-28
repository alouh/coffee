<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@page session="false" contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title>Coffee Shop</title>
    </head>
    <body>
        <%--<h1><s:message code = "coffee.welcome"/></h1>--%>
        <h1>欢迎</h1>
        <a href="user/register">register<br></a>
        <a href="coffee">菜单2<br></a>
        <a href="https://www.baidu.com">百度<br></a>
    </body>
</html>