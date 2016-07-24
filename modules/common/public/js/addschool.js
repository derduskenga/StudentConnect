$(document).ready(function(){
    //$('#campus_id').prop('disabled', 'disabled');
    $("#institution_id").change(function() {
             //$('#campus_id').prop('disabled', false);
            //change value attribute to true
            var institution_id = $(this).val();
              $.ajax({
                  type: 'POST',
                  url: '/institution/fetchcampus/'+ institution_id,
                  data: {},
                  dataType: "json",
                  success: function(data){
                      var options = '<option class="blank" value="">Select campus</option>';
                      for(var key in data){
                            var campus_id = data[key]['id'];
                            var campus_name = data[key]['name'];
                            options = options + '<option value="' + campus_id + '">' + campus_name + '</option>';
                      }
                      $('#campus_id').html(options);
                  },
                   statusCode: {
                       400: function() {
                           alert('This university does not exist or has no campuses. Consider adding campuses to this institution');
                       },
                        500: function() {
                          alert('Internal server error! Contact admin');
                        }
                  }
              });
    });
});