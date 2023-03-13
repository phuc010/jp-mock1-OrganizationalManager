$(document).ready(function () {
    $(".organisationName").click(function (e) {
        e.preventDefault();
        confirm("Do you want to make this Organization active?")
    });

});