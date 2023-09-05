<%--
  Created by IntelliJ IDEA.
  User: vuvan
  Date: 05/09/2023
  Time: 11:03 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE>
<html>
<head>
    <title>Title</title>
</head>
<body>
<bean:write name="user" property="id"/>
<bean:write name="user" property="name"/>
<bean:write name="user" property="age"/>
</body>
</html>
