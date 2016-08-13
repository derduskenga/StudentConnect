$(document).ready(function(){
        $("#campus_id.detect-change").change(function() {
                 //$('#campus_id').prop('disabled', false);
                //change value attribute to true
                var campus_id = $(this).val();
                  $.ajax({
                      type: 'POST',
                      url: '/institution/fetchschool/'+ campus_id,
                      data: {},
                      dataType: "json",
                      success: function(data){
                          var options = '<option class="blank" value="">Select schools/faculty</option>';
                          for(var key in data){
                                var school_id = data[key]['id'];
                                var school_name = data[key]['name'];
                                options = options + '<option value="' + school_id + '">' + school_name + '</option>';
                          }
                          $('#school_id').html(options);
                      },
                       statusCode: {
                           400: function() {
                                $('#school_id').html('<option class="blank" value="">Select schools/faculty</option>');
                               alert('This Campus does not exist or has no faculty. Consider adding faculties to this institution');
                           },
                            500: function() {
                               $('#school_id').html('<option class="blank" value="">Select schools/faculty</option>');
                              alert('Internal server error! Contact admin');
                            }
                      }
                  });
        });
});

function validateAddCourseForm(){
    if($('#institution_course').val() == ""){
        alert("Select course name");
        return false;
    }else if ($('#institutioncourseform input:checked').length == 0){
        alert("Select one certification course");
        return false;
    }else{
        return true;
    }
}