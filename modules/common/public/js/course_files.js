$(document).ready(function(){
    downloadSampleCourseFile();
    downloadSampleInstitutionFile();
});


function downloadSampleCourseFile(){
  $('.download-sample-excel-file').click(function(event){
            event.preventDefault();
            window.location.href = "/course/file/download";
  });
}

function downloadSampleInstitutionFile(){}