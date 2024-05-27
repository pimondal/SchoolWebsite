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