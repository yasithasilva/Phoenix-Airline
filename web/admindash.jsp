<%-- 
    Document   : about
    Created on : Oct 6, 2022, 1:02:26 AM
    Author     : Yasitha Silva
<<<<<<< HEAD
--%><%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
=======
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
>>>>>>> 0237f06933917514e63abfa19dc6775a364bdeaf
<html>
    <head>
        <head>
        
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">

    <title>Staff Dashboard</title>
    <link rel="icon" type="image/x-icon" href="assets/images/icon.png" >

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Additional CSS Files -->
    <link rel="stylesheet" href="assets/css/fontawesome.css">
    <link rel="stylesheet" href="assets/css/templatemo-woox-travel.css">
    <link rel="stylesheet" href="assets/css/owl.css">
    <link rel="stylesheet" href="assets/css/animate.css">
    <link rel="stylesheet"href="https://unpkg.com/swiper@7/swiper-bundle.min.css"/>

    </head>
    <body>
        
  <!-- ***** Preloader Start ***** -->
  <div id="js-preloader" class="js-preloader">
    <div class="preloader-inner">
      <span class="dot"></span>
      <div class="dots">
        <span></span>
        <span></span>
        <span></span>
      </div>
    </div>
  </div>
  <!-- ***** Preloader End ***** -->

  <!-- ***** Header Area Start ***** -->
  <header class="header-area header-sticky">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <nav class="main-nav">
                    <!-- ***** Logo Start ***** -->
                    <a href="index.html" class="logo">
                        <img src="assets/images/logoup.png" alt="">
                    </a>
                    <!-- ***** Logo End ***** -->
                    <!-- ***** Menu Start ***** -->
                    <ul class="nav">
                        <li><a href="index.html">Home</a></li>
                        <li><a href="admindash.jsp" class="active">Dashboard</a></li>
                        <li><a href="flightm.jsp">Flight Menu</a></li>
                        <li><a href="ticketm.jsp">Ticket Menu</a></li>
                        <li><a href="userm.jsp">User Menu</a></li>
                        <li><a href="staffreq.jsp">Staff Requests</a></li>
                        
                    </ul>   
                    <a class='menu-trigger'>
                        <span>Menu</span>
                    </a>
                    <!-- ***** Menu End ***** -->
                </nav>
            </div>
        </div>
    </div>
  </header>
  <!-- ***** Header Area End ***** -->

  <div class="second-page-heading">
    <div class="container">
      <div class="row">
        <div class="col-lg-12">
          <h4>Admin Dashboard</h4>
          <h2>Acess Manging Portals Below</h2>
          
          <div class="main-button"><a href="flightm.jsp">  Manage Flights   </a></div>
          <div class="main-button"><a href="ticketm.jsp">  Manage Tickets  </a></div>
          <div class="main-button"><a href="userm.jsp">    Manage Users    </a></div>
          <div class="main-button"><a href="staffreq.jsp">    Staff Requests    </a></div>
        </div>
      </div>
    </div>
  </div>


  <footer>
    <div class="container">
      <div class="row">
        <div class="col-lg-12">
          <p>Copyright © 2022 <a href="#">Phoenix Airlines</a> Company. All rights reserved. 
          <br>Design: <a href="" target="_blank" title="">NSBM Green University</a></p>
        </div>
      </div>
    </div>
  </footer>


  <!-- Scripts -->
  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

  <script src="assets/js/isotope.min.js"></script>
  <script src="assets/js/owl-carousel.js"></script>
  <script src="assets/js/wow.js"></script>
  <script src="assets/js/tabs.js"></script>
  <script src="assets/js/popup.js"></script>
  <script src="assets/js/custom.js"></script>

  <script>
    $(".option").click(function(){
      $(".option").removeClass("active");
      $(this).addClass("active"); 
    });
  </script>

    </body>
</html>
