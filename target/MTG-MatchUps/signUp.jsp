<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 10/3/16
  Time: 6:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<jsp:include page="head.jsp"/>

<body>
<jsp:include page="menu.jsp"/>
<div class="container">
    <h2 align="center">Sign Up</h2>
    <form class="form-horizontal">
        <div class="form-group">
            <label class="control-label col-sm-4" for="firstName">First Name:</label>
            <div class="col-sm-4">
                <input type="firstName" class="form-control" id="firstName">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-4" for="lastName">Last Name:</label>
            <div class="col-sm-4">
                <input type="lastName" class="form-control" id="lastName">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-4" for="email">Email address:</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="email">
            </div>
        </div>
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
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>
</div>
</body>

</html>

