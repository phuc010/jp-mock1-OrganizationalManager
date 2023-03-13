<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Organisation Details 2</title>
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
                <a href="./OrganisationDetail2" class="me-1 btn btn-light details2">Details 2</a>
<!--                 <a href="./OrganisationDetail3" class="me-1 btn btn-secondary">Details 3</a> -->
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
                                <label for="Specialism" class="w-50 col-form-label">Organisation Specialism</label>
                                <div class="overflow-auto col-form-label w-75 border border-secondary">
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Blind/Partially Sighted</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Deaf/Hard of Hearing</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Dysiexia</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Learning Disability</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Mental Health</span>
                                </div>
                            </div>
                            <div class=" d-flex col-auto w-100 align-items-center mb-3">
                                <label for="Capabilities" class="w-50 col-form-label">Service Disablities Capabilities</label>
                                <div class="overflow-auto col-form-label w-75 border border-secondary">
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Chest, Breathing problems</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Conditon retricting mobitily</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Diasbetes</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Difficulty in hearing</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Lorem, ipsum.</span>
                                </div>
                            </div>
                            <div class=" d-flex col-auto w-100 align-items-center mb-3">
                                <label for= "Barriers" class="w-50 col-form-label">Service Barriers Capabilities</label>
                                <div class="overflow-auto col-form-label w-75 border border-secondary">
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Lone Parent</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>ESOL</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Refugee</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Basic Skills</span>
                                </div>
                            </div>
                            <div class=" d-flex col-auto w-100 align-items-center mb-3">
                                <label for="Benifits" class="w-50 col-form-label">Service Benifits Capabilities</label>
                                <div class="overflow-auto col-form-label w-75 border border-secondary">
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Disability Living Allowance</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Employment and Support Allowance</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Incapacity Benifit</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Income Support</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class=" d-flex col-auto w-100 align-items-center mb-3">
                                <label for="Peronal" class="w-50 col-form-label">Service Peronal Circumstances Capabilities</label>
                                <div class="overflow-auto col-form-label w-75 border border-secondary">
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Carer Pesponsibilities</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Lone Parent</span>
                                </div>
                            </div>
                            <div class=" d-flex col-auto w-100 align-items-center mb-3">
                                <label for="Ethnicty" class="w-50 col-form-label">Service Ethnicty Capabilities</label>
                                <div class="overflow-auto col-form-label w-75 border border-secondary">
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>White British</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>White Irish</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Other White</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>White and Black Caribbean</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>White and Black African</span>
                                </div>
                            </div>
                            <div class=" d-flex col-auto w-100 align-items-center mb-3">
                                <label for="Accreditation" class="w-50 col-form-label">Accreditation</label>
                                <div class="overflow-auto col-form-label w-75 border border-secondary">
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Two Ticks</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>Investors In People</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>ISO 9001</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>ISO 14001</span>
                                    <br>
                                    <input class="ms-1" type="checkbox" value="active">
                                    <span>ISO 27001</span>
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