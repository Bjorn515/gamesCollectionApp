<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<body>
<div class="topnav" id="myTopnav">
    
  <a href="/" class="active"><img src="${pageContext.request.contextPath}/img/gamepad (2).png"></a>
  <a href="/games">Games Database</a>
    <sec:authorize access="isAuthenticated()">

  <a href="/gamelist">My Collection</a>
    </sec:authorize>

    <sec:authorize access="isAuthenticated()">
                <a href="/logout">Log out</a>
    </sec:authorize>
    <sec:authorize access="!isAuthenticated()">
                <a href="/login">Log in</a>
    </sec:authorize>
  
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>

