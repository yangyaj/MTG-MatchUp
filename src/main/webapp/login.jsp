<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 10/3/16
  Time: 6:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>
<body>
<jsp:include page="menu.jsp"/>
<div>
    <h2 align="center">Login</h2>
    <form class="form-horizontal">
        <div class="form-group">
            <label class="control-label col-sm-4" for="username">Username:</label>
            <div class="col-sm-4">
                <input type="username" class="form-control" id="username">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-4" for="pwd">Password:</label>
            <div class="col-sm-4">
                <input type="password" class="form-control" id="pwd">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-5 col-sm-7">
                <button type="reset" class="btn btn-default">Clear</button>
                <button type="submit" class="btn btn-default">Login</button>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-5 col-sm-7">
                <a href="forgotUsername.jsp">Forgot Username?</a>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-5 col-sm-7">
                <a href="forgotPassword.jsp">Forgot Password?</a>
            </div>
        </div>
    </form>
</div>
</body>

</html>

