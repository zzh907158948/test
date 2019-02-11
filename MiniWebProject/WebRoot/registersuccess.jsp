<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">



<html>
	<head>
		<title>Register Success | Welcome To Lightning Ltd.net</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta name="description" content="Register Success page"/>
		<link href="style.css" rel="stylesheet" type="text/css" />
		<link href="layout.css" rel="stylesheet" type="text/css" />
		<script src="maxheight.js" type="text/javascript"></script>
	</head>

<body id="page4" onload="new ElementMaxHeight();" >
	<!-- the top header begins-->
	<div id="header">
		<div class="container">
			<div class="row-1">
				<div class="logo"><img alt="" src="image/comlogo1.png" /></div>
				<div class="top-links">
					<form  name="form" method="post" action="./login" >
						<button type="submit" name="submit" value="login" ><img alt="" src="image/login2.png"  /></button>
           	  		</form>
           	  	</div>        	
			</div>
				<div class="row-2">
				<!-- nav box begins -->
            		<div class="nav-box">
            			<div class="left">
               				<div class="right">
                  				<ul>
                     				<li><a href="index.jsp" class="first"><em><b>HOME</b></em></a></li>
                        			<li><a href="about-us.jsp"><em><b>ABOUT US</b></em></a></li>
                        			<li>
                        				<form name="form" method="post"action="./lookproduct" >
								  			<button type="submit"><b>PRODUCT</b></button>
								  		</form>
								  	</li>
                        			<li><a href="partners.jsp"><em><b>PARTNERS</b></em></a></li>
                        			<li><a href="register.jsp"><em><b>REGISTER</b></em></a></li>
                        			<li><a href="contact-us.jsp" class="last"><em><b>CONTACT US</b></em></a></li>
                     			</ul>
                			</div>
               			</div>
            		</div>
            	<!-- nav box ends -->
        	</div>
      	</div>
   	</div>
   	<!-- the top header ends -->
	<!-- content -->
   	<div id="content">
	   	<div class="container">
		   	<!-- main-banner-small begin -->
           	<div class="box">
            <div class="border-top">
               <div class="border-right">
                  <div class="border-bot">
                     <div class="border-left">
                        <div class="left-top-corner">
                           <div class="right-top-corner">
                              <div class="right-bot-corner">
                                 <div class="left-bot-corner">
                                    <div class="inner">
           	<%String username = (String) session.getAttribute("username1"); %>
    		<%String phone = (String) session.getAttribute("phone"); %>
    
    		<%String address = (String) session.getAttribute("address"); %>
    		<%String email = (String) session.getAttribute("email"); %>
    		<p class="re-su"><h8><strong>Your have successfully registered</strong></h8><br/></p>
    		<p class="re-su"><h8><strong>welcome </strong></h8><%=username %><br/></p>
    		<p class="re-su"><h8><strong>Your phone number: </strong></h8><%= phone %><br/></p>
    		<p class="re-su"><h8><strong>Your address:</strong></h8><%= address %><br/></p>
    		<p class="re-su"><h8><strong>Your email: </strong></h8><%= email %><br/></p>
    		<p class="re-su"><h8><strong>Please Login!</strong></h8><br/></p>
    
            
            <form  id="contacts-form2" name="form" method="post"action="./login" >
				<p class="re-su">You have succeed submitting your request!</p>				
					<div class="re-su">				
						<div class="add">	
							<button type="submit" name="submit" value="login" ><em><b>Go to Login</b></em></button>
						</div>
					</div>				 
			</form>
				</div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
		</div>
	</div>

	<div id="footer">
		<div class="fleft">Copyright &copy; 2018</div>
        <div class="fright">Automatic Tracking Car Ltd</div>
	</div>
</body>
</html>


