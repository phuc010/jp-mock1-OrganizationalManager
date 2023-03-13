$(document).ready(function () {

    $('#eoi').change(function () {
        $('#eoi').val($(this).is(':checked'));
    });

    $('#eoi').mousedown(function () {
        if (!$(this).is(':checked')) {
            window.location = "./OrganisationDetail3";
            $(this).trigger("change");
        }
    });

    $('form').submit(function (e) {
        var regexSdt = "^09[0-9]{8,9}$";
        var regexPostcode = "^(550001|550002|550003|550004)$";
        var regexOrganName = "^[0-9AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZaàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz ]*$";

        $("#succesfully").html("");

        if ($("#Org-Name").val().trim() == "" || $("#Org-Name").val() == null ||
            $("#Org-Short-Dec").val().trim() == "" || $("#Org-Short-Dec").val() == null ||
            $("#Add-Line1").val().trim() == "" || $("#Add-Line1").val() == null ||
            $("#valuePostcode").val().trim() == "" || $("#valuePostcode").val() == null ||
            $(".Type-of-bus").val().trim() == "" || $(".Type-of-bus").val() == null ||
            $("#phone").val().trim() == "" || $("#phone").val() == null ||
            !$("#phone").val().trim().match(regexSdt) ||
            !$("#valuePostcode").val().trim().match(regexPostcode) ||
            !$("#Org-Name").val().trim().match(regexOrganName)) {
            //Org-Name
            if ($("#Org-Name").val().trim() == "" || $("#Org-Name").val() == null) {
                $("#Org-Name").addClass("border border-danger");
                $("#Org-Name-Mess").html("Please input the Organisation Name");
            } else {
                if (!$("#Org-Name").val().trim().match(regexOrganName)) {
                    $("#Org-Name").addClass("border border-danger");
                    $("#Org-Name-Mess").html("Organisation Name invalid");
                }
            }
            //Org-Short-Dec
            if ($("#Org-Short-Dec").val().trim() == "" || $("#Org-Short-Dec").val() == null) {
                $("#Org-Short-Dec").addClass("border border-danger");
                $("#Org-Short-Dec-Mess").html("Please input the Organisation Short Decription");
            }

            if ($("#Add-Line1").val().trim() == "" || $("#Add-Line1").val() == null) {
                $("#Add-Line1").addClass("border border-danger");
                $("#Add-Line1-Mess").html("Please input the Address Line 1");
            }

            if ($("#valuePostcode").val().trim() == "" || $("#valuePostcode").val() == null) {
                $("#valuePostcode").addClass("border border-danger");
                $("#Postcode-Mess").html("Please input the Postcode");
            }

            if ($(".Type-of-bus").val().trim() == "" || $(".Type-of-bus").val() == null) {
                $(".Type-of-bus").addClass("border border-danger");
                $("#Type-of-bus-Mess").html("Please input the Type of Business");
            }
            if ($("#phone").val().trim() == "" || $("#phone").val() == null) {
                $("#phone").addClass("border border-danger");
                $("#phone-Mess").html("Please input the Phone Number");
            } else {
                if (!$("#phone").val().trim().match(regexSdt)) {
                    $("#phone").addClass("border border-danger");
                    $("#phone-Mess").html("Phone Number invalid");
                }
            }
            e.preventDefault();
        }
    });

    $("#Org-Name").focus(function () {
        $("#Org-Name").removeClass("border border-danger");
        $("#Org-Name-Mess").html("");
    });

    $("#Org-Short-Dec").focus(function () {
        $("#Org-Short-Dec").removeClass("border border-danger");
        $("#Org-Short-Dec-Mess").html("");
    });

    $("#Add-Line1").focus(function () {
        $("#Add-Line1").removeClass("border border-danger");
        $("#Add-Line1-Mess").html("");
    });

    $("#valuePostcode").focus(function () {
        $("#valuePostcode").removeClass("border border-danger");
        $("#Postcode-Mess").html("");
    });

    $("#phone").focus(function () {
        $("#phone").removeClass("border border-danger");
        $("#phone-Mess").html("");
    });


    $('#okLeadContact').click(function (e) {
        e.preventDefault();
        var LeadContactList = document.getElementsByName('LeadContact');
        var i = 0;
        var length = LeadContactList.length;
        for (i; i < length; i++) {
            if (LeadContactList[i].checked) {
                $(".valueLeadContact").val(LeadContactList[i].value);
                break;
            }
        }
    });

    $('#okPostcode').click(function (e) {
        e.preventDefault();
        var PostcodeList = document.getElementsByName('Postcode');
        var i1 = 0;
        var length1 = PostcodeList.length;
        $("#valuePostcode").removeClass("border border-danger");
        $("#Postcode-Mess").html("");
        for (i1; i1 < length1; i1++) {
            if (PostcodeList[i1].checked) {
                $("#valuePostcode").val(PostcodeList[i1].value);
                break;
            }
        }
    });

    $('#okTOB').click(function (e) {
        e.preventDefault();
        var TOBList = document.getElementsByName('tob');
        var i2 = 0;
        var length2 = TOBList.length;
        $(".Type-of-bus").removeClass("border border-danger");
        $("#Type-of-bus-Mess").html("");
        for (i2; i2 < length2; i2++) {
            if (TOBList[i2].checked) {
                $(".Type-of-bus").val(TOBList[i2].value);
                break;
            }
        }
    });

});