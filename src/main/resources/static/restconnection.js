$(document).ready(function () {
    $("#successbutton").click(function () {
        $.get('http://localhost:8080/v1/smoke/getSelectedMapAndSideNades?ctOrT=T&csMap=DUST2', function (data) {
            $("#descr").text(data[0].description);
        });
    });
});