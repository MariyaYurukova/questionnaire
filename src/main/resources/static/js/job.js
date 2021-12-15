

$(function() {
    $("#today").datepicker({
        dateFormat: 'yy-mm-dd',
        minDate: 0,
        maxDate: 0

    });
});

$(function() {
    $("#start").datepicker({
        dateFormat: 'yy-mm-dd',
        maxDate: 0

    });
});


// $(document).ready(function() {
//
//     // SUBMIT FORM
//     $("#form").submit(function(event) {
//         // Prevent the form from submitting via the browser.
//         event.preventDefault();
//         ajaxPost();
//     });
//
//     function ajaxPost() {
//
//         // PREPARE FORM DATA
//         let formData = {
//             description : $("#description").val(),
//             // country : $("#country").val(),
//             // lastName: $("#lastName").val(),
//
//         }
//
//         // DO POST
//         $.ajax({
//             type : "POST",
//             contentType : "application/json",
//             url : window.location + "/jobss",
//             data : JSON.stringify(formData),
//             dataType : 'json',
//             success : function(result) {
//                 if (result.status == "success") {
//
//                     $("#postResultDiv")
//                         .html(
//                             "<p style='background-color:green; color:white; margin-top: 10px'>"
//                             + "Post Successfully!"
//                             + "---> Congrats ! "
//                             + result.object.description+"<br>"
//
//                             +"Yours egn is: "
//                             + result.object.description
//
//                             + "</p>"
//                         );
//                 } else {
//                     $("#postResultDiv").html(
//                         "<strong>Error</strong>");
//                 }
//                 console.log(result);
//             },
//             error : function(e) {
//                 alert("Error!")
//                 console.log("ERROR: ", e);
//             }
//         })
//
//         // $('#egn').val('');
//         // $('#country').val('');
//         // $('#lastName').val('');
//     }
// })
