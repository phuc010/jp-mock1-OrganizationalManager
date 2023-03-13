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
<title>Organisation List</title>
<link rel="stylesheet" href="./resources/css/index.css">
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
    crossorigin="anonymous">
<link rel="stylesheet"
    href="https://pro.fontawesome.com/releases/v5.15.4/css/all.css" />
<script src="https://code.jquery.com/jquery-3.6.1.js"
    integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
    crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <div>
            <p class="fs-3 fw-bold text-success">Organisation List</p>
        </div>
        <div class="d-flex justify-content-between">
            <div class="d-flex">
                <a href="${pageContext.request.contextPath}/index"
                    class="text-primary text-decoration-none">All</a> &nbsp;
                <p>|</p>
                &nbsp; <a href="./filer09"
                    class="text-primary text-decoration-none fw-bold">0 - 9</a> &nbsp;
                <p>|</p>
                &nbsp; <a href="./filerae"
                    class="text-primary text-decoration-none fw-bold">A B C D E</a>
                &nbsp;
                <p>|</p>
                &nbsp; <a href="./filerfj"
                    class="text-primary text-decoration-none fw-bold">F G H I J</a>
                &nbsp;
                <p>|</p>
                &nbsp; <a href="./filerkn"
                    class="text-primary text-decoration-none fw-bold">K L M N</a>
                &nbsp;
                <p>|</p>
                &nbsp; <a href="./fileror"
                    class="text-primary text-decoration-none fw-bold">O P Q R</a>
                &nbsp;
                <p>|</p>
                &nbsp; <a href="./filersv"
                    class="text-primary text-decoration-none fw-bold">S T U V</a>
                &nbsp;
                <p>|</p>
                &nbsp; <a href="./filerwz"
                    class="text-primary text-decoration-none fw-bold">W X Y Z</a>
            </div>
            <div class="d-flex align-items-center">
                <a class="create" href="./OrganisationDetail1">Create</a> &nbsp;
                <c:choose>
                    <c:when test="${checkme== 'on' }">
                        <form id="form"
                            action="${pageContext.request.contextPath}/${path}">
                            <input id="all" checked type="checkbox" name="checkme"> <label
                                for="all">Include In-active</label>
                        </form>
                    </c:when>
                    <c:when test="${checkme!= 'on' }">
                        <form id="form"
                            action="${pageContext.request.contextPath}/${path}">
                            <input id="all" unchecked type="checkbox" name="checkme">
                            <label for="all">Include In-active</label>
                        </form>
                    </c:when>
                    <c:otherwise>
                        <form id="form"
                            action="${pageContext.request.contextPath}/${path}">
                            <input id="all" unchecked type="checkbox" name="checkme">
                            <label for="all">Include In-active</label>
                        </form>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
        <div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th scope="col"><a href="sort?checkme=${checkme}">Organisation
                                Name</a></th>
                        <th scope="col">Head Office Address Line 1</th>
                        <th scope="col">Postcode</th>
                        <th scope="col">Contact</th>
                        <th scope="col">Is Active?</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="t" items="${organisationList}">
                        <tr>
                            <td>
                                <!-- Button trigger modal --> <c:choose>
                                    <c:when test="${t.active == 'Yes'}">
                                        <button type="button"
                                            class="btn btn-link text-decoration-none">
                                            ${t.organisationName}</button>
                                    </c:when>
                                    <c:otherwise>
                                        <button type="button"
                                            class="btn btn-link text-decoration-none"
                                            data-bs-toggle="modal" data-bs-target="#exampleModal${t.stt}">
                                            ${t.organisationName}</button>
                                        <!-- Modal -->
                                        <div class="modal fade" id="exampleModal${t.stt}"
                                            tabindex="-1" aria-labelledby="exampleModalLabel${t.stt}"
                                            aria-hidden="true">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <h5 class="modal-title" id="exampleModalLabel${t.stt}">Notice</h5>
                                                        <button type="button" class="btn-close"
                                                            data-bs-dismiss="modal" aria-label="Close"></button>
                                                    </div>
                                                    <div class="modal-body">Do you want to make this
                                                        Organization active?</div>
                                                    <div class="modal-footer">
                                                        <button type="button" class="btn btn-secondary"
                                                            data-bs-dismiss="modal">Cancel</button>
                                                        <a href="updateActive?stt=${t.stt}"
                                                            class="btn btn-primary">OK</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td>${t.addressLine1}</td>
                            <td>${t.postCode}</td>
                            <td>${t.contact}</td>
                            <td>${t.active}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <c:if test="${totalPages == 0 }">
            <p class="text-danger d-flex justify-content-center h2">No record found</p>
        </c:if>
        <c:if test="${totalPages != 0 }">
            <div class="d-flex justify-content-end">
                <div class="paging">
                    <a href="${path}?page=1&checkme=${checkme}"><i
                        class="fas fa-step-backward"></i></a> &nbsp;
                    <c:choose>
                        <c:when test="${currentPage == 1}">
                            <a href="${path}?page=1&checkme=${checkme}"><i
                                class="fas fa-caret-left"></i></a>
                        </c:when>
                        <c:otherwise>
                            <a href="${path}?page=${currentPage-1}&checkme=${checkme}"><i
                                class="fas fa-caret-left"></i></a>
                        </c:otherwise>
                    </c:choose>
                    &nbsp; <span>Page</span> <input type="text" disabled
                        value="${currentPage}"> <span>of ${totalPages}</span>
                    &nbsp;
                    <c:choose>
                        <c:when test="${currentPage == totalPages}">
                            <a href="${path}?page=${totalPages}&checkme=${checkme}"><i
                                class="fas fa-caret-right"></i></a>
                        </c:when>
                        <c:otherwise>
                            <a href="${path}?page=${currentPage+1}&checkme=${checkme}"><i
                                class="fas fa-caret-right"></i></a>
                        </c:otherwise>
                    </c:choose>
                    &nbsp; <a href="${path}?page=${totalPages}&checkme=${checkme}"><i
                        class="fas fa-step-forward"></i></a>
                </div>
            </div>
        </c:if>
    </div>
    <script src="./resources/js/Index.js"></script>
    <script
        src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
    <script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
        integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
        crossorigin="anonymous"></script>
</body>
</html>
