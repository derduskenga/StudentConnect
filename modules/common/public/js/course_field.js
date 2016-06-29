$(document).ready(function(){
    $(".delete-course-field").click(function(){
        var confirm_delete = confirm("You are about to DELETE 1 course field");

        if(confirm_delete){
            return true;
        }else{
            return false;
        }
    });
});