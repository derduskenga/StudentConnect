$(document).ready(function() {
    var table = $('#certification-courses-table').DataTable();

    /*$('button').click( function() {
        var data = table.$('input, checkbox').serialize();
        alert("The following data would have been submitted to the server: \n\n"+data.substr( 0, 120 )+'...'
        );
        return false;
    } );*/


});

function validateCertificationForm(){
    if($('#course_name').val() == ""){
        alert("Select course name");
        return false;
    }else if ($('#addcertificationform input:checked').length == 0){
        alert("Select at least one certification course");
        return false;
    }else{
        return true;
    }
}