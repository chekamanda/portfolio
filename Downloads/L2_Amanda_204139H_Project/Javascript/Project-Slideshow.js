//  Javascript (Slideshow) for ACYT-FASHION , BANNER,WEBSITE,BUSNIESS,UI-DESIGN
 
 var slideIndex = 1;
    showSlides(slideIndex);

    // Next/previous controls
    function plusSlides(n) {
        // slideIndex = slideIndex + n
        showSlides(slideIndex += n);
    }

    // Thumbnail image controls
    function currentSlide(n) {
        showSlides(slideIndex = n);
    }

    function showSlides(n) {
        var i;
        var slides=[];

        // Retrieve slide pictures for mySlides
         slides = document.getElementsByClassName("mySlides");

        //Retrieve slide pictures for demo
        var dots = document.getElementsByClassName("demo");

        //Reset n, if exceed slide.length ,reset to 1
        if (n > slides.length) { slideIndex = 1 }

        //If less than 1, set to slideIndex to slide.length
        if (n < 1) { slideIndex = slides.length }

        //hide all slides
        for (i = 0; i < slides.length; i++) {
            slides[i].style.display = "none";
        }

        //set thumbnails as inactive/not selected
        for (i = 0; i < dots.length; i++) {
            dots[i].className = dots[i].className.replace(" active", "");
        }

        slides[slideIndex - 1].style.display = "block";

        //based on slideIndex, set thumbnail to active
        dots[slideIndex - 1].className += " active";
    }