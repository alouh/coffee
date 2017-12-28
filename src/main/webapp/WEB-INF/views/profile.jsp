<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/23
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title>${userBean.userName}</title>
    </head>
    <body>
        <h1>Your Profile</h1>
        FirstName:<c:out value="${userBean.firstName}"/><br>
        LastName:<c:out value="${userBean.lastName}"/><br>
        Password:<c:out value="${userBean.password}"/><br>
    </body>
</html>
