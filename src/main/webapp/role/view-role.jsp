<%--
  Created by IntelliJ IDEA.
  User: vuvan
  Date: 30/08/2023
  Time: 11:08 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>View Role</h1>
    <bean:write name="role" property="roleName"/>
</body>
</html>
