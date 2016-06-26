$(document).ready(function(){


//hover code

	$('ul.nav li.dropdown').hover(function() {
  $(this).find('.dropdown-menu').stop(true, true).delay(200).fadeIn(500);
}, function() {
  $(this).find('.dropdown-menu').stop(true, true).delay(200).fadeOut(500);
});


//subscription code

$('.close_subscribe').click(function(){

  

    $('.subscribe-row').hide();


});

$('#close').click(function(){


	$('#bit').hide();



});



  


});

