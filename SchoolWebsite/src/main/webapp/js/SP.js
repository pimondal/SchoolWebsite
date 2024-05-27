function openNav() {
  document.getElementById("mySidenav").style.width = "350px";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
}


function openFormA() {
	document.getElementById("myForm1").style.display = "block";
	document.getElementById("overlay").style.display = "block";
	}

function closeFormA() {
	document.getElementById("myForm1").style.display = "none";
	document.getElementById("overlay").style.display = "none";
	}

function openFormB() {
	document.getElementById("myForm2").style.display = "block";
	document.getElementById("overlay").style.display = "block";
	}

function closeFormB() {
	document.getElementById("myForm2").style.display = "none";
	document.getElementById("overlay").style.display = "none";
	}

function openFormC() {
	document.getElementById("myForm3").style.display = "block";
	document.getElementById("overlay").style.display = "block";
	}

function closeFormC() {
	document.getElementById("myForm3").style.display = "none";
	document.getElementById("overlay").style.display = "none";
	}

function openForm() {
	document.getElementById("myForm").style.display = "block";
	document.getElementById("overlay").style.display = "block";
	}

function closeForm() {
	document.getElementById("myForm").style.display = "none";
	document.getElementById("overlay").style.display = "none";
	}

function validateForm() {
	  var password = document.getElementById("password1").value;
	  var confirm_password = document.getElementById("password2").value;

	  if (password != confirm_password) {
	    alert("Passwords do not match!");
	    return false;
	  }

	  // If the passwords match, you can continue with form submission
	  return true;
	}

/*window.onload = function () {
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
*/