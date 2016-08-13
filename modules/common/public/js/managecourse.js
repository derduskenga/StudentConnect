$(document).ready(function(){
        //one event
        $(".delete-course").click(function(){
            var confirm_course_delete = confirm("You are about to delete 1 course")
            if(confirm_course_delete){
                return true;
            }else{
                return false;
            }
        });
        //another event here

});

