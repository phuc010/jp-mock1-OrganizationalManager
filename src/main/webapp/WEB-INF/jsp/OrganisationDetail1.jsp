<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Organisation Details 1</title>
<link rel="stylesheet" href="./resources/css/OrganisationDetail1.css">
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
            <p class="fs-3 fw-bold text-success">Organisation Details 該当するデータが存在しません。</p>
        </div>
        <div class="mt-3">
            <form action="create" method="post">
                <div class="d-flex justify-content-between">
                    <div class="d-flex">
                        <a href="./OrganisationDetail1" class="me-1 btn btn-light details1">Details 1</a>
                        <a href="./OrganisationDetail2" class="me-1 btn btn-secondary">Details 2</a>
<!--                         <a href="./OrganisationDetail3" class="me-1 btn btn-secondary">Details 3</a> -->
                        <c:if test="${succesfully != null }">
                            <a href="#" class="btn btn-secondary">BU/Directorates</a>
                        </c:if>
                    </div>
                    <div class="d-flex align-items-center">
                        <button id="submit" type="submit" class="save">Save</button>
                        &nbsp; <a class="btn back" href="./index">Back</a>
                    </div>
                </div>
                <div class="container main-input">
                    <div class="main-input2">
                        <div class="row">
                            <div class="col-sm-12 col-md-12 col-lg-6">
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="Org-Name"
                                        class="col-form-label w-50 Organisation-Name">Organisation
                                        Name <span style="color: red;">*</span>
                                    </label>
                                    <div class="col-form-label w-75">
                                        <input type="text" id="Org-Name" class="form-control"
                                            name="organisationName" maxlength="200" autofocus
                                            value="${organisation.getOrganisationName()}"> <input
                                            type="hidden" class="form-control" name="active" value="No"
                                            maxlength="200">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="Org-Short-Dec" class="col-form-label w-50 pe-2">Organisation
                                        Short <br> Decription <span style="color: red;">*</span>
                                    </label>
                                    <div class="col-form-label w-75">
                                        <input type="text" id="Org-Short-Dec" name="orShortDecription"
                                            class="form-control" maxlength="200"
                                            value="${organisation.getOrShortDecription()}">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="contact" class="col-form-label w-50">Lead
                                        Contact</label>
                                    <div class="d-flex col-form-label w-75">
                                        <input disabled type="text" class="valueLeadContact" class="form-control"
                                            name="contact" maxlength="200"
                                            value="${organisation.getContact()}"> &nbsp;
                                        <div>
                                        <input type="hidden" class="valueLeadContact" class="form-control"
                                            name="contact" maxlength="200"
                                            value="${organisation.getContact()}">
                                        </div>
                                            <span class="form-text w-25" style="color: blue;">
                                                <button type="button" class="btn btn-link text-decoration-none"
                                                    data-bs-toggle="modal" data-bs-target="#exampleModal">Lookup
                                                </button>
                                            </span>
                                            <!-- Modal -->
                                            <div class="modal fade" id="exampleModal" tabindex="-1"
                                                aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                <div class="modal-dialog">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5 class="modal-title" id="exampleModalLabel">
                                                                Notice</h5>
                                                            <button type="button" class="btn-close"
                                                                data-bs-dismiss="modal" aria-label="Close"></button>
                                                        </div>
                                                        <div class="modal-body">Please choose Lead Contact:

                                                            <div>
                                                                <input type="radio" checked="checked" name="LeadContact" value="Lead Contact 1">
                                                                <span class="checkmark">Lead Contact 1</span>
                                                            </div>
                                                            <div>
                                                                <input type="radio" name="LeadContact" value="Lead Contact 2">
                                                                <span class="checkmark">Lead Contact 2</span>
                                                            </div>
                                                            <div>
                                                                <input type="radio" name="LeadContact" value="Lead Contact 3">
                                                                <span class="checkmark">Lead Contact 3</span>
                                                            </div>
                                                            <div>
                                                                <input type="radio" name="LeadContact" value="Lead Contact 4">
                                                                <span class="checkmark">Lead Contact 4</span>
                                                            </div>
                                                        </div>

                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-secondary"
                                                                data-bs-dismiss="modal">Cancel</button>
                                                            <button id="okLeadContact" type="button" class="btn btn-primary"
                                                                data-bs-dismiss="modal">OK</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- EndModal -->
                                    </div>
                                </div>
                                
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="Add-Line1" class="col-form-label w-50 pe-2">Address
                                        Line 1 <span style="color: red;">*</span>
                                    </label>
                                    <div class="col-form-label w-75">
                                        <input type="text" id="Add-Line1" class="form-control"
                                            name="addressLine1" maxlength="200"
                                            value="${organisation.getAddressLine1()}">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="Add-Line2" class="col-form-label w-50">Address
                                        Line 2</label>
                                    <div class="col-form-label w-75">
                                        <input id="Add-Line2" type="text" class="form-control"
                                            maxlength="200">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="Add-Line3" class="col-form-label w-50">Address
                                        Line 3</label>
                                    <div class="col-form-label w-75">
                                        <input id="Add-Line3" type="text" class="form-control"
                                            maxlength="200">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="Postcode" class="col-form-label w-50 ">Postcode
                                        <span style="color: red;">*</span>
                                    </label>
                                    <div class="d-flex col-form-label w-75">
                                        <input readonly="readonly" type="text" id="valuePostcode" class="form-control"
                                            name="postCode" maxlength="200"
                                            value="${organisation.getPostCode()}"> &nbsp;
                                            <span class="form-text w-25" style="color: blue;">                                             
                                                <button type="button" class="btn btn-link text-decoration-none"
                                                    data-bs-toggle="modal" data-bs-target="#exampleModal1">Lookup
                                                </button>
                                            </span>
                                            <!-- Modal -->
                                            <div class="modal fade" id="exampleModal1" tabindex="-1"
                                                aria-labelledby="exampleModalLabel1" aria-hidden="true">
                                                <div class="modal-dialog">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5 class="modal-title" id="exampleModalLabel1">
                                                                Notice</h5>
                                                            <button type="button" class="btn-close"
                                                                data-bs-dismiss="modal" aria-label="Close"></button>
                                                        </div>
                                                        <div class="modal-body">Please choose Postcode:

                                                            <div>
                                                                <input type="radio" checked="checked" name="Postcode" value="550001">
                                                                <span class="checkmark">550001</span>
                                                            </div>
                                                            <div>
                                                                <input type="radio" name="Postcode" value="550002">
                                                                <span class="checkmark">550002</span>
                                                            </div>
                                                            <div>
                                                                <input type="radio" name="Postcode" value="550003">
                                                                <span class="checkmark">550003</span>
                                                            </div>
                                                            <div>
                                                                <input type="radio" name="Postcode" value="550004">
                                                                <span class="checkmark">550004</span>
                                                            </div>
                                                        </div>

                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-secondary"
                                                                data-bs-dismiss="modal">Cancel</button>
                                                            <button id="okPostcode" type="button" class="btn btn-primary"
                                                                data-bs-dismiss="modal">OK</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- EndModal -->
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="town" class="col-form-label w-50">City/Town</label>
                                    <div class="col-form-label w-75">
                                        <input id="town" type="text" class="form-control"
                                            maxlength="200">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="Country" class="col-form-label w-50">Country</label>
                                    <div class="col-form-label w-75">
                                        <input id="Country" type="text" class="form-control"
                                            maxlength="200">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="Nation" class="col-form-label w-50">Nation/Country</label>
                                    <div class="col-form-label w-75">
                                        <select id="Nation">
                                            <option value=""></option>
                                            <option value="VN">Việt Nam</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-12 col-md-12 col-lg-6">
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="Preferred" class="w-50 col-form-label">Preferred
                                        Organisation</label>
                                    <div class="col-form-label w-75">
                                        <input id="Preferred" type="checkbox" value="active">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="Expression" class="w-50 col-form-label">Expression
                                        of Interest</label>
                                    <div class="col-form-label w-75">
                                        <input id="Expression" type="checkbox" id="eoi">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="Type-of-bus" class="col-form-label w-50">Type
                                        of Business <span style="color: red;">*</span>
                                    </label>
                                    <div class="d-flex col-form-label w-75">
                                        <input disabled="disabled" type="text" class="Type-of-bus" name="typeOfBusiness"
                                            class="form-control" maxlength="200"
                                            value="${organisation.getTypeOfBusiness()}">
                                            <input type="hidden" class="Type-of-bus" name="typeOfBusiness"
                                            class="form-control" maxlength="200"
                                            value="${organisation.getTypeOfBusiness()}">
                                            &nbsp;
                                            <span class="form-text w-25" style="color: blue;">
                                                <button type="button" class="btn btn-link text-decoration-none"
                                                    data-bs-toggle="modal" data-bs-target="#exampleModal2">Lookup
                                                </button>
                                            </span>
                                            <!-- Modal -->
                                            <div class="modal fade" id="exampleModal2" tabindex="-1"
                                                aria-labelledby="exampleModalLabel2" aria-hidden="true">
                                                <div class="modal-dialog">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5 class="modal-title" id="exampleModalLabel2">
                                                                Notice</h5>
                                                            <button type="button" class="btn-close"
                                                                data-bs-dismiss="modal" aria-label="Close"></button>
                                                        </div>
                                                        <div class="modal-body">Please choose Type of Business:

                                                            <div>
                                                                <input type="radio" checked="checked" name="tob" value="Sole Proprietorships">
                                                                <span class="checkmark">Sole Proprietorships</span>
                                                            </div>
                                                            <div>
                                                                <input type="radio" name="tob" value="Partnerships">
                                                                <span class="checkmark">Partnerships</span>
                                                            </div>
                                                            <div>
                                                                <input type="radio" name="tob" value="Corporations">
                                                                <span class="checkmark">Corporations</span>
                                                            </div>
                                                            <div>
                                                                <input type="radio" name="tob" value="Limited Liability Company">
                                                                <span class="checkmark">Limited Liability Company</span>
                                                            </div>
                                                        </div>

                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-secondary"
                                                                data-bs-dismiss="modal">Cancel</button>
                                                            <button id="okTOB" type="button" class="btn btn-primary"
                                                                data-bs-dismiss="modal">OK</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- EndModal -->
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="SICCode" class="col-form-label w-50">SIC
                                        Code</label>
                                    <div class="col-form-label w-75">
                                        <input id="SICCode" disabled type="text"
                                            class="form-control SIC-Code" maxlength="200">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="FullDescription" class="col-form-label w-50">Organisation
                                        Full Description</label>
                                    <div class="col-form-label w-75">
                                        <input id="FullDescription" type="text"
                                            class="form-control Full-Description" maxlength="200">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="phone" class="col-form-label w-50">Phone
                                        Number<span style="color: red;"> *</span>
                                    </label>
                                    <div class="col-form-label w-75">
                                        <input type="text" id="phone" class="form-control"
                                            name="phone" maxlength="200"
                                            value="${organisation.getPhone()}">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="Fax" class="col-form-label w-50">Fax</label>
                                    <div class="col-form-label w-75">
                                        <input id="Fax" type="text" class="form-control"
                                            maxlength="200">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="Email" class="col-form-label w-50">Email</label>
                                    <div class="col-form-label w-75">
                                        <input id="Email" type="email" class="form-control"
                                            maxlength="200">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="WebAddress" class="col-form-label w-50">Web
                                        Address</label>
                                    <div class="col-form-label w-75">
                                        <input id="WebAddress" type="text" class="form-control"
                                            maxlength="200">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="CharityNumber" class="col-form-label w-50">Charity
                                        Number</label>
                                    <div class="col-form-label w-75">
                                        <input id="CharityNumber" type="text" class="form-control"
                                            maxlength="200">
                                    </div>
                                </div>
                                <div class="d-flex col-auto w-100 align-items-center">
                                    <label for="CompanyNumber" class="col-form-label w-50">Company
                                        Number</label>
                                    <div class="col-form-label w-75">
                                        <input id="CompanyNumber" type="text" class="form-control"
                                            maxlength="200">
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-12">
                                <p id="Org-Name-Mess" class="text-danger"></p>
                                <p id="Org-Short-Dec-Mess" class="text-danger"></p>
                                <p id="Add-Line1-Mess" class="text-danger"></p>
                                <p id="Postcode-Mess" class="text-danger"></p>
                                <p id="Type-of-bus-Mess" class="text-danger"></p>
                                <p id="phone-Mess" class="text-danger"></p>
                                <c:if test="${succesfully != null }">
                                    <p id="succesfully" class="text-success">${succesfully}</p>
                                </c:if>
                                <c:if test="${fail != null }">
                                    <p class="text-danger">${fail}</p>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <script src="./resources/js/OrganisationDetail12.js"></script>
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