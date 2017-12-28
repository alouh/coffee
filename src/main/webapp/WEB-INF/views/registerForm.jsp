<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/23
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Register</title>
        <link rel="stylesheet"
              type="text/css"
              href="<c:url value="/resources/css/registerForm.css"/>"/>
    </head>
    <body>
        <h1>Register</h1>
        <sf:form method="post" commandName="userBean">
            <sf:errors path="*" element="div" cssClass="errors"/><br>
            <sf:label path="firstName" cssErrorClass="error">First Name</sf:label>
            :<sf:input path="firstName" cssErrorClass="error"/><br>
            E-mail:<sf:input path="lastName" type="email"/><br>
            User Name:<sf:input path="userName"/><br>
            Password:<sf:password path="password"/><br>
            <input type="submit" value="Register"/>
        </sf:form>
    </body>
</html>
