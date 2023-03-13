<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Trang Lỗi</title>
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
    crossorigin="anonymous">
</head>
<body>
    <div class="container">
         <div>
            <p class="fs-3 fw-bold text-success"> Organisation Details</p>
        </div>
        <div class="mt-3">
                <div class="d-flex justify-content-between">
                    <div class="d-flex">
                        <a href="./OrganisationDetail1" class="btn btn-outline-secondary">Details 1</a>
                        <a href="./OrganisationDetail2" class="btn btn-outline-secondary">Details 2</a>
                        <a href="./OrganisationDetail3" class="btn btn-outline-secondary">Details 3</a>
                        <c:if test="${succesfully != null }">
                           <a href="#" class="btn btn-outline-secondary">BU/Directorates</a>
                        </c:if>
                    </div>
                    <div class="d-flex align-items-center">
                        <a href="./index" class="btn btn-secondary">Back</a>
                    </div>
                </div>
        <p class="fs-3 fw-bold text-danger">Đã xảy ra lỗi</p>
        </div>
    </div>
</body>
</html>
