<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="pl">

<%@ include file="./partials/head.jsp" %>


<%@ include file="./partials/navi.jsp" %>
    
 


    <div id="zawartosc">
        <h2>

        <form action="/search" method="GET">
        <div class="form-group">
        <input type="text" class="form-control" name="search" placeholder="Search Game">
        <button class="s" type="submit"><img src="${pageContext.request.contextPath}/img/search (1).png"></button>
        
        </div>
        </form>
    
        </h2>
        <br>
        <%@ include file="./partials/selectPlatform.jsp" %>
        <br>
        <table>
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Description</th>
                    <th>Platform</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${games}" var="gg" >
                    <tr>
                        <td>${gg.title}</td>
                        <td>${gg.description}</td>
                        <td>${gg.platform}</td>
                        <sec:authorize access="isAuthenticated()">
                        <td><a href="/addGame/${gg.idg}" class="butts" type="submit">Add to my Collection</a></td>
                        </sec:authorize>
                        <sec:authorize access="!isAuthenticated()">
                            <td><a href="/addGame/${gg.idg}" class="buttsOFF" type="submit">Add to my Collection</a></td>
                        </sec:authorize>


                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
<%--@jquery--%>
<%--@toastr_js--%>
<%--@toastr_render--%>
</html>
