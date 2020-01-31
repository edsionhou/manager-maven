<%--
  Created by IntelliJ IDEA.
  User: edison
  Date: 2020/1/31
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><添加用户></title>

</head>
<body>
    <form action="/manager/user/addUser" method="post">
        姓名：<input type="text" name="username"/> <br/>
        年龄：<input   type="text" name="userage"/><br/>
        <input type="submit" value="Ok"/>


    </form>
</body>
</html>
