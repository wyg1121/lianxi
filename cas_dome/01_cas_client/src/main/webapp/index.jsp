<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/16
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> <%=request.getRemoteUser()%> one 首页 </h1><br>

<a href="http://localhost:8080/cas/logout?service=http://www.baidu.com">退出登录</a>

</body>
</html>
