<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pl">
<%@ include file="./partials/head.jsp" %>
<%@ include file="./partials/navi.jsp" %>

<body  class = "homepage">
<div>

    <div class="bg-white lg:w-4/12 md:6/12 pt-6 w-10/12 m-auto my-10 shadow-md">
        <div class="py-8 px-8 rounded-xl">
            <h1 class="font-medium text-2xl mt-3 text-center">Login</h1>
            <form action="/login" method="post" class="mt-6">
                <div class="my-5 text-sm">
                    <label for="username" class="block text-black">Email</label>
                    <input type="email" autofocus id="username"  name="username" class="rounded-sm px-4 py-3 mt-3 focus:outline-none bg-gray-100 w-full" placeholder="Email" />
                </div>
                <div class="my-5 text-sm">
                    <label for="password" class="block text-black">Password</label>
                    <input type="password" id="password"  name="password" class="rounded-sm px-4 py-3 mt-3 focus:outline-none bg-gray-100 w-full" placeholder="Password" />
                </div>
                <button type = "submit" class="buttsLogin">Login</button>
            </form>
            <p class="mt-12 text-xs text-center font-light text-gray-400"> Don't have an account? <a href="/register" class="text-black font-medium"> Create One </a> </p>

        </div>
    </div>
</div>


</body>
</html>