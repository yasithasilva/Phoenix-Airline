<%-- 
    Document   : ticketbook
    Created on : Oct 6, 2022, 1:14:21 AM
    Author     : Yasitha Silva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">

    <title>Book Tickets</title>
    <link rel="icon" type="image/x-icon" href="assets/images/icon.png" >

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Additional CSS Files -->
    <script src="https://kit.fontawesome.com/b8742f4821.js" crossorigin="anonymous"></script>
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
                        <li><a href="checkflight.jsp">Check Flight</a></li>
                        <li><a href="ticketbook.jsp" class="active">Book Tickets</a></li>
                        <li><a href="stafflogin.jsp">Staff Login</a></li>
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
          <h2>Flight Tickets on your fingertips</h2>
        </div>
      </div>
    </div>
  </div>

  <div class="more-info reservation-info">
    <div class="container">
      <div class="row">
        <div class="col-lg-4 col-sm-6">
          <div class="info-item">
            <i class="fa-brands fa-paypal"></i>
            <h4>Pay Online</h4>
            <p>You can pay via payoner or paypal</p>
          </div>
        </div>
        <div class="col-lg-4 col-sm-6">
          <div class="info-item">
            <i class="fa-solid fa-book"></i>
            <h4>Reserve Easy</h4>
            <p>Book Your Tickets By a click</p>
          </div>
        </div>
        <div class="col-lg-4 col-sm-6">
          <div class="info-item">
            <i class="fa-solid fa-mobile-screen-button"></i>
            <h4>Smart Ticket</h4>
            <p>No Papers, Get Ticket on your phone</p>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div class="reservation-form">
    <div class="container">
      <div class="topic">
        <h1 class="test01">Book your ticket</h1>
        <br>
        <br>
      </div>
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
                          <label for="Name" class="form-label">Full Name </label>
                          <input class="box" type="text" name="name" class="Name" placeholder="nimal silva" autocomplete="on" required>
                     </td>
                      </tr>
                      <tr>
                        <td>
                          <label for="Name" class="form-label">Passport Number </label>
                          <input class="box" type="text" name="name" class="Name" placeholder="N-xxxxx" autocomplete="on" required>
                     </td>
                      </tr>
                      <tr>
                        <td>
                          <label for="Name" class="form-label">From </label>
                          <input class="box" type="text" name="name" class="Name" placeholder="example" autocomplete="on" required>
                     </td>
                      </tr>
                    
                    <tr>
                      <td>
                        <label for="Name" class="form-label">To</label>
                        <input class="box" type="text" name="email" class="name" placeholder="example@123" autocomplete="on" required>
                    </td>
                    </tr>
                    <tr>
                      <td>
                        <label for="Name" class="form-label">Date</label>
                        <input type="date" name="date" class="date" required>
                   </td>
                    </tr>
                  
                  <tr>
                    <td> Class 
                      <select>
                        <option selected disabled> Choose Class </option>
                        <option value="premium">Premium </option>
                        <option value="first">First</option> 
                        <option value="Normal">Normal</option>
                      </select>
                    </td>
                  </tr>

                  <tr>
                    <td>
                      <label for="Name" class="form-label">Person </label>
                      <input class="box" type="text" name="person" class="name" placeholder="put number" autocomplete="on" required>
                  </td>

                  <tr>
                    <td> Payment Method
                      <select>
                        <option selected disabled> Choose Payment </option>
                        <option value="paypal">Paypal </option>
                        <option value="payoner">Payoner</option> 
                        <option value="Visa">Visa</option>
                      </select>
                    </td>
                  </tr>
                
                  
                  </th>
                </table>
                    
              </div>                       

                     <button class="signup"> Book now </button>
                  
        
                
                    
             
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
          <p>Copyright © 2022 <a href="#">Phoenix Airline</a> Company. All rights reserved. 
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
