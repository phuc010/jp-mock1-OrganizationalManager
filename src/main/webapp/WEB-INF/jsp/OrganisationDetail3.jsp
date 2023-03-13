<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Organisation Details 3</title>
    <link rel="stylesheet" href="./resources/css/OrganisationDetail2.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.15.4/css/all.css" />
    <script src="https://code.jquery.com/jquery-3.6.1.js"
        integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI=" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <div>
            <p class="fs-3 fw-bold text-success"> Organisation Details</p>
        </div>
        <div class="d-flex justify-content-between">
            <div class="d-flex">
                <a href="./OrganisationDetail1" class="me-1 btn btn-secondary">Details 1</a>
                <a href="./OrganisationDetail2" class="me-1 btn btn-secondary">Details 2</a>
                <a href="./OrganisationDetail3" class="me-1 btn btn-light details2">Details 3</a>
            </div>
           <div class="d-flex align-items-center">
                <button type="button" class="save">Save</button>
                &nbsp;
                <a class="btn back" href="./index">Back</a>
            </div>
        </div>
        <div class="main-input">
            <form class="form" action="./index">
                <div class="container main-input2">
                    <div class="row">
                        <div class="col-sm-6">
                            <div class=" d-flex col-auto w-100 align-items-center mb-3">
                                <label for="Programmes" class="w-50 col-form-label">EOI Programmes</label>
                                <div class="overflow-auto col-form-label w-75 border border-secondary">
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Programmes 1</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Programmes 2</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Programmes 3</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Programmes 4</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Programmes 5</span>
                                </div>
                            </div>
                            <div class=" d-flex col-auto w-100 align-items-center mb-3">
                                <label for="EOIServices" class="w-50 col-form-label">EOI Services</label>
                                <div class="overflow-auto col-form-label w-75 border border-secondary">
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Service 1</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Service 2</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Service 3</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Service 4</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Service 5</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>
</html>