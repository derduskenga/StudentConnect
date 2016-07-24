$(document).ready(function() {
    /*For course Job titles*/
    $('input.typeahead').typeahead({
            name: 'job_placement_name',
            remote:'/course/job/search/%QUERY',
            limit : 10
    });


    /*For course specialization*/

    $('input#specialization_name').typeahead({
                name: 'specialization_name',
                remote:'/course/specialization/search/%QUERY',
                limit : 10
    });


});