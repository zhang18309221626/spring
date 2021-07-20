<%--
  Created by IntelliJ IDEA.
  User: jack
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${hello}
    <hr/>
    <a href="${pageContext.request.contextPath}/findAccount?accountId=10&accountName=zhangsan">查询账户</a>

    <hr/>
    <form action="${pageContext.request.contextPath}/updateAccount" method="post">
        用户ID：<input type="text" name="sid" ><br/>
        用户名：<input type="text" name="sname" ><br/>
        用户性别：<input type="text" name="ssex" ><br/>
        用户生日：<input type="text" name="sbirthday" ><br/>
        账户 1 名称：<input type="text" name="accounts[0].name" ><br/>
        账户 1 金额：<input type="text" name="accounts[0].money" ><br/>
        账户 2 名称：<input type="text" name="accounts[1].name" ><br/>
        账户 2 金额：<input type="text" name="accounts[1].money" ><br/>
        账户 3 名称：<input type="text" name="accountMap['one'].name" ><br/>
        账户 3 金额：<input type="text" name="accountMap['one'].money" ><br/>
        账户 4 名称：<input type="text" name="accountMap['two'].name" ><br/>
        账户 4 金额：<input type="text" name="accountMap['two'].money" ><br/>
        <input type="submit" value="保存">

    </form>

    <hr/>
    <a href="${pageContext.request.contextPath}/param?name=zhangsan">requestParam注解</a>

    <hr/>
    <form action="${pageContext.request.contextPath}/body" method="post">
        用户名称：<input type="text" name="username" ><br/>
        用户密码：<input type="password" name="password" ><br/>
        用户年龄：<input type="text" name="age" ><br/>
        <input type="submit" value="保存">
    </form>
    <hr/>
    <a href="${pageContext.request.contextPath}/studentPathVariable/100">pathVariable 注解</a>
    <hr/>
    <img src="${pageContext.request.contextPath}/images/a.jpg">
    <hr/>
    <form action="${pageContext.request.contextPath}/updateStudent" method="post">
        用户ID：<input type="text" name="sid" ><br/>
        用户名：<input type="text" name="sname" ><br/>
        用户性别：<input type="text" name="ssex" ><br/>
        <input type="submit" value="保存">
    </form>
    <hr/>
    <form action="${pageContext.request.contextPath}/fileUpload" method="post" enctype="multipart/form-data">
        用户ID：<input type="text" name="sid" ><br/>
        用户名：<input type="text" name="sname" ><br/>
        用户性别：<input type="text" name="ssex" ><br/>
        图片上传：<input type="file" name="pic"><br/>
        <input type="submit" value="保存">
    </form>

    <hr/>
    <form action="${pageContext.request.contextPath}/doFileUpload" method="post" enctype="multipart/form-data">
        用户ID：<input type="text" name="sid" ><br/>
        用户名：<input type="text" name="sname" ><br/>
        用户性别：<input type="text" name="ssex" ><br/>
        图片上传：<input type="file" name="pic"><br/>
        <input type="submit" value="保存">
    </form>
</body>
</html>
