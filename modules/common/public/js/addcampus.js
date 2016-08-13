$(document).ready(function(){
    $("#is_main_campus").change(function() {
        if(this.checked) {
            //change value attribute to true
            $(this).attr("value","true");
        }
    });
    /*........................................*/
});