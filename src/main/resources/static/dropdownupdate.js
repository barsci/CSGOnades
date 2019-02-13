$(document).ready(function () {
    $('#dropdownside a').click(function () {
        $('#selectedside').text($(this).text());
    });
});

$(document).ready(function () {
    $('#dropdownmap a').click(function () {
        $('#selectedmap').text($(this).text());
    });
});