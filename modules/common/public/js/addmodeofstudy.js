$(document).ready(function(){

});

function validateAddModeOfStudyForm(){
    if ($('#modeofstudyform input[type=checkbox]:checked').length == 0){
            alert("Select at least one mode of study");
            return false;
        }else{
            return true;
        }
}