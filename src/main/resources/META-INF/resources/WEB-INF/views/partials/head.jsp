<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>


<head>
 <meta charset="UTF-8">
 <title>Games Database</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">

 <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
 <link href="https://unpkg.com/tailwindcss@2.0.3/dist/tailwind.min.css" rel="stylesheet">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/cssdist/output.css" />
 <script>
  function myFunction() {
   let x = document.getElementById("myTopnav");
   if (x.className === "topnav") {
    x.className += " responsive";
   } else {
    x.className = "topnav";
   }
  }
 </script>

</head>

