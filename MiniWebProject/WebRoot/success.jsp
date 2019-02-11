<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!doctype html>
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

<body id="page4" onload="new ElementMaxHeight();">
   <!-- header -->
   <div id="header">
      <div class="container">
         <div class="row-1">
           
				<div class="logo"><img alt="" src="image/comlogo1.png" /></div>
				<div class="top-links">
					<form  name="form" method="post" action="./login" >
						<button type="submit" name="submit" value="login" ><img alt="" src="image/login1.png"  /></button>
           	  		</form>
           	  	</div>        	  	
         </div>
         <div class="row-2">
         	<!-- nav box begin -->
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
            <!-- nav box end -->
         </div>
      </div>
   </div>
   <!-- content -->
   <div id="content">
      <div class="container">
      	<!-- main-banner-small begin -->
         <div class="main-banner-small">
         	<div class="inner">
            	<h1>Clear Goals And Continuous Efforts Lead To Finall Success</h1>
            </div>
         </div>
         <!-- main-banner-small end -->
         <!-- box begin -->
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
										<div class="log">
											<h2>You have log out successfully!</h2>
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
         <!-- box end -->
      </div>
   </div>
   <!-- footer -->
   <div id="footer">
	   <div class="container">
         <div class="wrapper">
			 <div class="fleft">Copyright &copy; 2018</div>
             <div class="fright">Lightning Welcome You</div>
      	 </div>
	   </div>
   </div>
</body>
</html>

