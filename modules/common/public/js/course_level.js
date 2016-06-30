$(document).ready(function(){
    $(".delete-course-level").click(function(){
        var confirm_delete = confirm("You are about to DELETE 1 course level");

        if(confirm_delete){
            return true;
        }else{
            return false;
        }
    });
});