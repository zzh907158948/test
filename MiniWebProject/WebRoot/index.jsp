<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
		<title>Index | Welcome To Lightning Ltd.net</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta name="description" content="Home page"/>
		<link href="./style.css" rel="stylesheet" type="text/css" />
		<link href="./layout.css" rel="stylesheet" type="text/css" />
		<script src="maxheight.js" type="text/javascript"></script>
	</head>
	
<body id="page1" onload="new ElementMaxHeight();">
	
	<!-- the top header begins-->
	<div id="header">
		<div class="container">
			
			<div class="row-1">
				
				<div class="logo"><img alt="" src="./image/comlogo1.png" /></div>
				<div class="top-links">
					<form  name="form" method="post" action="./login" >
						<button type="submit" name="submit" value="login" ><img alt="" src="./image/login1.png" /></button>
           	  		</form>
           	  	</div>
           	  	
			</div>
			
			<div class="row-2">
				<!-- nav box begins -->
            	<div class="nav-box">
            		<div class="left">
               			<div class="right">
                  			<ul>
                     			<li><a href="index.jsp" class="first-current"><em><b>HOME</b></em></a></li>
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
            	<!-- nav box ends -->
        	</div>
      	</div>
   	</div>
   	<!-- the top header ends -->
   	<!-- content -->
   	 <div id="content">
      <div class="container">
      	<!-- main-banner-big begin -->
         <div class="main-banner-big">
         	<div class="inner">
            	<h1>Clear Goals And Continuous Efforts Lead To Finally Success</h1>
            </div>
         </div>
         <!-- main-banner-big end -->
		 <div class="main-banner-big2">
         	<div class="inner"> 
				<h1>Our Main Product  Lightning Bug</h1>
				<a href="main-product.jsp" class="button"><em><b>LEARN MORE</b></em></a>
            </div>
         </div>
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