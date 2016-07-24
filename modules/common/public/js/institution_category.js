$(document).ready(function(){
    $(".delete-institution-category").click(function(){
        var confirm_delete = confirm("You are about to DELETE 1 institution category");

        if(confirm_delete){
            return true;
        }else{
            return false;
        }
    });
});