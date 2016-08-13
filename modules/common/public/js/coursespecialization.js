$(document).ready(function() {
    /*add job and append after form validate*/
   $("#coursespecializationform").validate({
        submitHandler: function(form) {
            var course_id = $('#course_name').val();
            $("#select-course-id").html(course_id);
            var course_specialization = $("#specialization_name").val();
            var specialization_url = $("#course_specialization_blog_url").val();
            var specialization_description = $("#specialization_description").val();
            /*append a div to job-tag*/
            $('#specialization-tags').prepend('<div class="alert alert-info specialization-content-class">' +
                                        '<a href="#" title="Remove" class="close" data-dismiss="alert" aria-label="close"><i class="fa fa-times text-red" style="color:red" aria-hidden="true"></i></a>' +
                                        '<span id="course-specialization">' + course_specialization + '</span> #' +
                                        '<span id="specialization_url">' + specialization_url + '</span> #'+
                                        '<span id="specialization-description">' + specialization_description + '</span>' +
                                    '</div>');

            form.reset();

            $('#course-specialization-btn-append-div').html('<hr><p align="right">' +
                                                      '<button id="save-course-specializations" class="btn btn-primary save-course-specialization"><i class="fa fa-floppy-o" aria-hidden="true"></i>Save all specialization tags</button>' +
                                                 '</p>');
        }
    });


    /*Loop in the div, extract data, create json and submit data, when 'save-job-titles' button is clicked*/

    $('#course-specialization-btn-append-div').on('click','.save-course-specialization',function(){
        var jsonArr = [];
        //Revolve loading gif in place of save button
        $('#course-specialization-btn-append-div').html("<i class='fa fa-spinner' aria-hidden='true'></i>");
        $('#specialization-tags .specialization-content-class').each(function(i){
            var content = $(this).text();
            var contentArray = content.split("#");
            var course_specialization = contentArray[0];
            var specialization_url = contentArray[1];
            var specialization_description = contentArray[2];
            jsonArr.push({"course_specialization":course_specialization,"specialization_url":specialization_url,"specialization_description":specialization_description})
        });            ///post to url and wait for feedback in json form
        var course_id = $('#select-course-id').text().trim();
        var specializations = JSON.stringify(jsonArr);
        $.post("/course/specialization/save/"+ course_id,{specializations:specializations}, function(data){

            if(data['success'] == 1){
                $('#course-specialization-btn-append-div').html("");
                 $('#specialization-tags').html("");
                 $('#course-specialization-error').html("<div id='test' class='alert alert-success'>" + data['message'] + "</div>");

                 $("#test").fadeTo(2000, 500).slideUp(500, function(){
                     $("#test").alert('close');
                 });

            }else{
                 $('#course-specialization-btn-append-div').html("");
                 $('#course-specialization-btn-append-div').html('<hr><p align="right">' +
                                                           '<button id="save-course-specializations" class="btn btn-primary save-course-specialization"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save all specialization tags</button>' +
                                                      '</p>');
                 $('#course-specialization-error').html("<div class='alert alert-danger'>" + data['message'] + "</div>");

            }
          },'json');
    });

});
