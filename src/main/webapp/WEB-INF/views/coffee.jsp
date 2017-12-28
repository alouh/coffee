<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Operator
  Date: 2017/12/22
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title>菜单</title>
    </head>
    <body>
        <h1>你要喝点啥</h1>
        <c:forEach items="${coffeeBeanList}" var="coffeeBean">
            <li id="coffeeBean_<c:out value="coffeeBean.id"/>">
                <div class="coffeeBeanMessage">
                    <c:out value="${coffeeBean.message}"/>
                </div>
                <div>
                    <span class="coffeeBeanDate"><c:out value="${coffeeBean.date}"/></span>
                </div>
                <div>
                    <span class="coffeeBeanLocation">
                        (<c:out value="${coffeeBean.latitude}"/>,
                        <c:out value="${coffeeBean.longitude}"/>)
                    </span>
                </div>
            </li>
        </c:forEach>
    </body>
</html>
