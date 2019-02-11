<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!doctype html>
<html>
	<head>
		<title>Product |  Welcome To ATC Ltd.net</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css"/>
		<meta name="description" content="Home page - free business website template available at mycodes.net for free download."/>
		<link href="style.css" rel="stylesheet" type="text/css"/>
		<script src="maxheight.js" type="text/javascript"></script>
	</head>
<body>
		<div id="header">
			<div class="container">
				<div class="row-1">
				<form  name="form" method="post" action="./login" >
				<div class="logo"><img alt="" src="./image/logo-header.jpg" /></div>
				<div class="top-links">
					<button type="submit" name="submit" value="login" ><img alt="" src="./image/log-in1.gif" /></button>
           	  	</div>
           	  	</form>
			</div>
				<div class="row-2">
				<!-- nav box begins -->
            	<div class="nav-box">
            		<div class="left">
               			<div class="right">
                  			<ul>
                     			<li><a href="index.jsp" class="first"><em><b>HOME</b></em></a></li>
                        			<li><a href="about-us.jsp"><em><b>ABOUT US</b></em></a></li>
                        			<li><a href="product-for-vistor.jsp"class="current"><em><b>PRODUCT</b></em></a></li>
                        			<li><a href="partners.jsp"><em><b>PARTNERS</b></em></a></li>
                        			<li><a href="register.jsp"><em><b>REGISTER</b></em></a></li>
                        			<li><a href="contact-us.jsp" class="last-current"><em><b>CONTACT US</b></em></a></li>
                     		</ul>
                		</div>
               		</div>
            	</div>
            	<!-- nav box ends -->
        	</div>
      		</div>
   		</div>
		
		<div id="content">
			<div class="container">
				<!-- main-banner-small begin -->
         		<div class="main-banner-small">
         			<div class="inner">
            			<h1>Clear Goals And Continuous Efforts Lead To Finall Success</h1>
            		</div>
         		</div>
         		<!-- main-banner-small end -->
				
			</div>

			<div class="user-part4">
						<h3>Product Chart</h3>
						<div class="row1">
							<h2>Product ID:1</h2>
						</div>
						<div class="row2">
							<div class="row2-col1">
								<img alt="" src="./image/p1.png">
							</div>
							<div class="row2-col2">
								<ul>
									<li><strong>Product Name:</strong>Tracking Car</li>
									<li><strong>Product Price:</strong>300</li>
									<li><strong>Product Amount:</strong>1000</li>
									<li><strong>Functional Introduction:</strong> It can find the target object and then follow the target.</li>
								</ul>
							</div>
						</div>
			</div>
			<div class="user-part4">
						<div class="row1">
							<h2>Product ID:2</h2>
						</div>
						<div class="row2">
							<div class="row2-col1">
								<img alt="" src="./image/p2.jpeg">
							</div>
							<div class="row2-col2">
								<ul>
									<li><strong>Product Name:</strong>Cleaning Robot</li>
									<li><strong>Product Price:</strong>400</li>
									<li><strong>Product Amount:</strong>500</li>
									<li><strong>Functional Introduction:</strong> It can clean the floor according to the prescribed route.</li>
								</ul>
							</div>
						</div>
			</div>
			<div class="user-part4">
						<div class="row1">
							<h2>Product ID:3</h2>
						</div>
						<div class="row2">
							<div class="row2-col1">
								<img alt="" src="./image/p3.jpg">
							</div>
							<div class="row2-col2">
								<ul>
									<li><strong>Product Name:</strong>Detection Car</li>
									<li><strong>Product Price:</strong>200</li>
									<li><strong>Product Amount:</strong>1500</li>
									<li><strong>Functional Introduction:</strong>It can be used to detect a given target in the wild.</li>
								</ul>
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


