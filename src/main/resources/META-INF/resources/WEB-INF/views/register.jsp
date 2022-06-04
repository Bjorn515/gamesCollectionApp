<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pl">
<%@ include file="./partials/head.jsp" %>
<%@ include file="./partials/navi.jsp" %>

<body  class = "homepage">
<div id="zawartosc">

    <div class="bg-white lg:w-4/12 md:6/12 pt-6 w-10/12 m-auto my-10 shadow-md">
        <div class="py-8 px-8 rounded-xl">
            <h1 class="font-medium text-2xl mt-3 text-center">Login</h1>
            <form action="/register" method="post" class="mt-6">
                <div class="my-5 text-sm">
                    <label for="name" class="block text-black">Username</label>
                    <input type="username" autofocus id="name"  name="name" class="rounded-sm px-4 py-3 mt-3 focus:outline-none bg-gray-100 w-full" placeholder="Username" />
                </div>

                <div class="my-5 text-sm">
                    <label for="email" class="block text-black">Email</label>
                    <input type="email" id="email"  name="email" class="rounded-sm px-4 py-3 mt-3 focus:outline-none bg-gray-100 w-full" placeholder="Email" />
                </div>

                <div class="my-5 text-sm">
                    <label for="password" class="block text-black">Password</label>
                    <input type="password" id="password"  name="password" class="rounded-sm px-4 py-3 mt-3 focus:outline-none bg-gray-100 w-full" placeholder="Password" />
                </div>
                <button type = "submit" class="buttsLogin">Register</button>
            </form>
            <p class="mt-12 text-xs text-center font-light text-gray-400"> Already have an account? <a href="/login" class="text-black font-medium"> Log in </a> </p>

        </div>
    </div>
</div>

</body>
</html>