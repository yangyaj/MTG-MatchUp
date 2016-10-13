<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 10/3/16
  Time: 7:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>
<body>
<jsp:include page="menu.jsp"/>
<h2 align="center">Enter Email to Reset Password</h2>
<form class="form-horizontal">
    <div class="form-group">
        <label class="control-label col-sm-4" for="email">Email:</label>
        <div class="col-sm-4">
            <input type="email" class="form-control" id="email">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-5 col-sm-7">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-5 col-sm-7">
            <a href="login.jsp">Back to Login</a>
        </div>
    </div>
</form>
</body>

</html>

