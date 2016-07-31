$(document).ready(function() {
    var table = $('#certification-courses-table').DataTable();

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