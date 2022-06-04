<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pl">
<%@ include file="./partials/head.jsp" %>
<head>
<%--    @toastr_css--%>
</head>
<body>
<%@ include file="./partials/navi.jsp" %>
    
    <div >
        <h2>
            <div class="shet">
            <img src="${pageContext.request.contextPath}/img/cd.png" class="icons">
            <input class="stat" name="sumTime" size = "40"; class= "stats" value = "Time that will never come back: ${suma} h" readonly>
            <br>
            <input class="stat" name="collectionSize" size = "40"; class= "stats" value = "Games in collection: ${sumaGier}" readonly>
            </div>
        </h2>
        <br>
        <br>
        <table>
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Platform</th>
                    <th>Playtime(hours)</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>


                <c:forEach items="${gamelist}" var="gg" >
                    <tr>
                        <td>${gg.games.title} </td>
                        <td>${gg.games.platform}</td>
                        <form role="updatePlaytime" action="/updatePlaytime" method="GET">
                            <td><input class="playtime" id="playtime" type="number" min="${gg.playtime}" max="10000" name="playtime" value ="${gg.playtime}">
                                <input type="hidden" id="idl" name="idl" value="${gg.idl}">
                                <button type="submit">Update Playtime</button></td></form>
                        <td><a href="/deleteByIdl/${gg.idl}" class="butts">Remove</a></td>
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
                
     
