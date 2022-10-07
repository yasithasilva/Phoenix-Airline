<%-- 
    Document   : about
    Created on : Oct 6, 2022, 1:02:26 AM
    Author     : Yasitha Silva
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">

    <title>Staff Dashboard</title>

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
                        <img src="assets/images/logo.png" alt="">
                    </a>
                    <!-- ***** Logo End ***** -->
                    <!-- ***** Menu Start ***** -->
                    <ul class="nav">
                        <li><a href="index.html">Home</a></li>
                        <li><a href="checkflight.jsp">Check Flights</a></li>
                        <li><a href="ticketbook.jsp">Book Tickets</a></li>
                        <li><a href="stafflogin.jsp" class="active">Staff Login</a></li>
                        <li><a href="about.jsp">About</a></li>
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
          <h2>Details Management System</h2>
        </div>
      </div>
    </div>
  </div>

  <div class="more-info reservation-info">
    <div class="container">
      <div class="row">
        <div class="col-lg-4 col-sm-6">
          <div class="info-item">
            <i class="fa fa-phone"></i>
            <h4>Make a Phone Call</h4>
            <a href="#">+123 456 789 (0)</a>
          </div>
        </div>
        <div class="col-lg-4 col-sm-6">
          <div class="info-item">
            <i class="fa fa-envelope"></i>
            <h4>Contact Us via Email</h4>
            <a href="#">company@email.com</a>
          </div>
        </div>
        <div class="col-lg-4 col-sm-6">
          <div class="info-item">
            <i class="fa fa-map-marker"></i>
            <h4>Visit Our Offices</h4>
            <a href="#">24th Street North Avenue London, UK</a>
          </div>
        </div>
      </div>
    </div>
  </div>
 
<div class="search"><input class="searchbox" type="text" placeholder="Enter Flight ID"></div>
<div class="topic">
  <h4>Add Flight</h4>
</div>
  <div class="reservation-form">
    <div class="container">
     <div class="row">
      <tabel>
          <div class="col-lg-12">
          <form id="reservation-form" name="gs" method="submit" role="search" action="#">
            <div class="row">
               <div class="table2">
                <table>
                    <th>
                      <tr>
                        <td>
                          <label for="Name" class="form-label">Flight ID </label>
                          <input class="box" type="text" name="name" class="Name"  autocomplete="on" required>
                     </td>
                      </tr>
                    
                    <tr>
                      <td>
                        <label for="Name" class="form-label">Destination</label>
                        <input class="box" type="text" name="email" class="name"  autocomplete="on" required>
                    </td>
                    </tr>
                    <tr>
                      <td>
                        <label for="Name" class="form-label">Departure Date</label>
                        <input class="box" type="text" name="password" class="Name"  autocomplete="on" required>
                   </td>
                    </tr>
                  
                  <tr>
                    <td>
                      <label for="Name" class="form-label">Chief Pilot</label>
                      <input class="box" type="text" name="passwordconfirm" class="name"  autocomplete="on" required>
                  </td>
                  </tr>
                
                  
                  </th>
                </table>
              </div>        
              <center>
                <div class="border-button"><a href="#">Add</a>
                  <a href="#">Cancel</a></div>
              </center>
              

              
                  
        
                
                    
             
            </div>
          </form>
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
