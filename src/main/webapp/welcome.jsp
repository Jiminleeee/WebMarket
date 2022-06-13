<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- bootstrap cdn 가져오기 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<title>Insert title here</title>
</head>
<body>
    <nav class="navbar navbar-expand navbar-dark bg-dark">
        <div class="container">
            <div class="navbar-header">
                <a href="./welcome.jsp" class="navbar-brand">Home</a></div>
        </div>
    </nav>
    <!-- 점보트론 / p : 패딩 -->
    <div class="p-5 bg-primary text-white">
        <div class="container">
            <h1 class="display-3">
                Welcome to Web Shopping Mall
            </h1>
        </div>
    </div>

    <div class="container">
        <div class="text-center">
            <h3>Welcome to Web Market!</h3>
            <!-- java를 쓰기 위한 태그 -->
            <%
            Date now = new Date();
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
            %>
            현재 접속 시각: <%= format.format(now) %>
          
        </div>
    </div>



    <footer class="container">
        <!-- 카피라이트 -->"C:/Users/501-21/Desktop/java2_003/P004.java"
        <p>&copy; WebMarket</p>
    </footer>
   
</body>
</html>