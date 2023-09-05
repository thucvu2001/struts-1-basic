<%--
  Created by IntelliJ IDEA.
  User: vuvan
  Date: 30/08/2023
  Time: 02:50 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE>
<html>
<head>
    <title>Add Group</title>
</head>
<body>
    <h1>Add Group</h1>

<%--    <form action="/struts-1-project/view-group.html" method="post">--%>
<%--        <p>Ten </p><input name="name" type="text">--%>
<%--        <input value="Them" type="submit">--%>
<%--    </form>--%>

    <html:form action="/view-group.html" method="post">
        <p> <bean:message key="group.name"/> </p> <html:text property="groupName" name="group"></html:text>
        <html:submit>Them Group</html:submit>
    </html:form>
</body>
</html>
