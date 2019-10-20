<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<from:form action="usd" method="post" modelAttribute="usd">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td><form:label path="usd">USD</form:label></td>
                <td><form:input path="usd"/></td>
            </tr>
            <tr>
                <td><form:label path="rate">Rate</form:label></td>
                <td><form:input path="rate"/></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button>Tinh</form:button></td>
            </tr>
        </table>
    </fieldset>
</from:form>
</body>
</html>
