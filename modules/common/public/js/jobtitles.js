$(document).ready(function() {
    /*add job and append after form validate*/
   $("#jobplacementform").validate({
        submitHandler: function(form) {
            var course_id = $('#course_name').val();
            $("#select-course-id").text(course_id);
            var job_title = $("#job_placement_name").val();
            var title_url = $("#job_placement_blog_url").val();
            var description = $("#job_placement_description").val();
            /*append a div to job-tag*/
            $('#job-tags').prepend('<div class="alert alert-info job-content-class">' +
                                        '<a href="#" title="Remove" class="close" data-dismiss="alert" aria-label="close"><i class="fa fa-times text-red" style="color:red" aria-hidden="true"></i></a>' +
                                        '<span id="job-title">' + job_title + '</span> #' +
                                        '<span id="title_url">' + title_url + '</span> #'+
                                        '<span id="job-description">' + description + '</span>' +
                                    '</div>');

            form.reset();

            $('#job-title-btn-append-div').html('<hr><p align="right">' +
                                                      '<button id="save-job-titles" class="btn btn-primary save-job-title"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save all job titles</button>' +
                                                 '</p>');
        }
    });


    /*Loop in the div, extract data, create json and submit data, when 'save-job-titles' button is clicked*/

    $('#job-title-btn-append-div').on('click','.save-job-title',function(){
        var jsonArr = [];
        //Revolve loading gif in place of save button
        $('#job-title-btn-append-div').html("<i class='fa fa-spinner' aria-hidden='true'></i>");
        $('#job-tags .job-content-class').each(function(i){
            var content = $(this).text();
            var contentArray = content.split("#");
            var job_title = contentArray[0];
            var title_url = contentArray[1];
            var description = contentArray[2];
            jsonArr.push({"job_title":job_title,"title_url":title_url,"description":description})
        });            ///post to url and wait for feedback in json form
        var course_id = $('#select-course-id').text().trim();
        var titles = JSON.stringify(jsonArr);
        $.post("/course/job/save/"+ course_id,{courses:titles}, function(data){

            if(data['success'] == 1){
                $('#job-title-btn-append-div').html("");
                 $('#job-tags').html("");
                 $('#job-title-error').html("<div id='test' class='alert alert-success'>" + data['message'] + "</div>");

                 $("#test").fadeTo(2000, 500).slideUp(500, function(){
                     $("#test").alert('close');
                 });

            }else{
                 $('#job-title-btn-append-div').html("");
                 $('#job-title-btn-append-div').html('<hr><p align="right">' +
                                                           '<button id="save-job-titles" class="btn btn-primary save-job-title"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save all job titles</button>' +
                                                      '</p>');
                 $('#job-title-error').html("<div class='alert alert-danger'>" + data['message'] + "</div>");

            }
          },'json');
    });

});
