
var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 2000); // Change image every 2 seconds
}

var slideIndex = 0;
showSlidess();

function showSlidess() {
  var i;
  var slides = document.getElementsByClassName("Slides2");
  var dots = document.getElementsByClassName("tod");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlidess, 2000); // Change image every 2 seconds
}

window.onload = function () {
    if (window.history && window.history.pushState) {
        window.history.pushState('backward', null, ''); // Creates a new history entry

        window.onpopstate = function () {
            // When browser back button is clicked
            // Make an AJAX call to logout servlet
            var xhr = new XMLHttpRequest();
            xhr.open("GET", "LogOut", true); // Call your logout servlet here
            xhr.send();
        };
    }
};



function openForm() {
	document.getElementById("myForm").style.display = "block";
	document.getElementById("overlay").style.display = "block";
	}

function closeForm() {
	document.getElementById("myForm").style.display = "none";
	document.getElementById("overlay").style.display = "none";
	}

