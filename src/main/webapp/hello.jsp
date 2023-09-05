<%--
  Created by IntelliJ IDEA.
  User: vuvan
  Date: 29/08/2023
  Time: 02:43 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <title>Title</title>
</head>
<body>
<h1><bean:write name="user" property="name"/></h1>
<h2><bean:write name="user" property="age" format="#####"/></h2>

</body>
</html>
