$(document).ready(function(){
    $(".delete-institution").click(function(){
        var confirm_delete = confirm("You are about to DELETE 1 institution");

        if(confirm_delete){
            return true;
        }else{
            return false;
        }
    });
});