<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BULIND</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js" integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</head>
<body>
    <div class="">
        <div class="row" id="header">
            <div class="col-1 align-middle text-center">BULIND</div>
            <div class="col-10">2</div>
            <div class="col-1">
                <button class="btn btn-light dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                    김영희
                  </button>
                  <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="#">계정 설정</a></li>
                    <li><a class="dropdown-item" href="#">로그아웃</a></li>
                  </ul>
            </div>
        </div>
        <div class="row" id="body">
            <div class="col-1">
                <ul class="list-unstyled text-center">
                    <a class="text-decoration-none " href="#"><li class="p-2"><h5 class="fw-bold">홈</h5></li></a>
                    <a class="text-decoration-none" href="#"><li class="p-2"><h5 class="fw-bold">About</h5></li></a>
                    <a class="text-decoration-none" href="/demo/board"><li class="p-2"><h5 class="fw-bold">게시판</h5></li></a>
                </ul>
            </div>
            <div class="col-10">
                <div class="row pt-2">
                    <h5 class="fw-bold">홈</h5>
                </div>
                <div class="row">2</div>
            </div>
            <div class="col-1"></div>
        </div>
    </div>
</body>
</html>