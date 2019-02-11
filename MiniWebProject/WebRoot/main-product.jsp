<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!doctype html>
<html>

	

<head>
	<title>Main Product | Welcome To Lightning Ltd.net</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta name="description" content="Main Product page"/>
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
					<button type="submit"><img alt="" src="image/login1.png" /></button>
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
								  	<button name="display" type="submit"><b>PRODUCT</b></button>
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
                                       	<h2>Lightning Bug</h2>
                                       	<ul class="list2">
										   	<li>
											   	<img alt="" src="./image/product1.jpg" />
                 							   <h4><strong>Introduction</strong></h4>
				 								<p>Lightning Bug is a multiple-control car based on an Arduino MEGA board. It can achieve the following mission accurately and promptly such as reverse parking, reversing radar with alarming apparatus, tracking, headlights, taillights, cornering lights and flame detection. and showing the distance and time on a LED screen in real time.</p>
												<h4><strong>Character</strong></h4>
				 								<p>The character in the movie series Cars called Lightning McQueen is our prototype who inspires us. In the movie series he grew into the king in the automobile racing world but lost his advantage when more advanced devices were equipped on other cars in the new age. However, he finally accepted the fact, regained the confidence and kept going forward and helped another car finish her dream instead of giving up or not recovering after the setback.</p>
												<h4><strong>For Customer</strong></h4>
				 								<p>We aim to pass this spirit to our customers that everyone needs to get accustomed in different periods in our lives but to keep moving forward. Although we can’t be back to past time or overwatch the future, just focus on the present period where we are.</p>

             								</li>
                                       </ul>
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

