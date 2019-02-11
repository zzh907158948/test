<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html>
	<head>
		<title>Partners | Welcome To ATC Ltd.net</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta name="description" content="Partners page"/>
		<link href="style.css" rel="stylesheet" type="text/css" />
		<link href="layout.css" rel="stylesheet" type="text/css" />
		<script src="maxheight.js" type="text/javascript"></script>
	</head>

	<body id="page4" onload="new ElementMaxHeight();">
		<!-- header -->
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
                     			<li><a href="index.jsp" class="first"><em><b>HOME</b></em></a></li>
                        		<li><a href="about-us.jsp"><em><b>ABOUT US</b></em></a></li>
                        		<li>
                        			<form name="form" method="post"action="./lookproduct" >
								  		<button name="display" type="submit"><b>PRODUCT</b></button>
								  	</form>
								</li>
                        		<li><a href="partners.jsp"class="current"><em><b>PARTNERS</b></em></a></li>
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
   		<!-- content -->
   		<div id="content">
      <div class="container">
      	<!-- main-banner-small begin -->
         <div class="main-banner-small">
         	<div class="inner">
            	<h1>Clear Goals And Continuous Efforts Lead To Finally Success</h1>
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
                                       	<h2>Introduction Of Partners</h2>
         								<p>Our company has cooperated with many famous companies, including Chinese companies and companies abroad.</p>
                                       	<ul class="list2">
										   	<li>
											   	<img alt="" src="./image/par1.png" />
                 							   	<h4><strong>Asea Brown Boveri</strong></h4>
				 								<p>Asea Brown Boveri (usually referred to as ABB) is a Swiss-Swedish multinational company headquartered in Zurich, Switzerland, with operations in the fields of robotics, motors, energy, and automation.</p>
             								</li>
             								<li>
				 								<img alt="" src="./image/par22.png" />
                 								<h4><strong>Amazon</strong></h4>
                 								<p>Amazon (Amazon, NASDAQ: AMZN) is the largest online e-commerce company in the United States, located in Seattle, Washington. Now it has expanded into a wide range of other products and has become the world's largest online product Business.</p>
             								</li>
			 								<li>
				 								<img alt="" src="./image/par33.png" />
                 								<h4><strong>Google</strong></h4>
                 								<p>Google is a multinational technology company based in the United States, which includes Internet search, cloud computing, advertising technology, etc., while developing and providing a large number of Internet-based products and services.</p>
             								</li>
             								<li>
				 								<img alt="" src="./image/par44.png" />
                 								<h4><strong>Alibaba</strong></h4>
                 								<p>Alibaba Group Holding Limited is a Chinese multinational conglomerate specializing in e-commerce, retail, Internet, AI and technology.It provides consumer-to-consumer, business-to-consumer and business-to-business sales services via web portals, as well as electronic payment services, shopping search engines and cloud computing services.</p>
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