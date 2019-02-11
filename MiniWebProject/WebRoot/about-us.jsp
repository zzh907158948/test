<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html>
	<head>
		<title>About Us | Welcome To Lightning Ltd.net</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta name="description" content="About us page"/>
		<link href="./style.css" rel="stylesheet" type="text/css" />
		<link href="./layout.css" rel="stylesheet" type="text/css" />
		<script src="maxheight.js" type="text/javascript"></script>
	</head>

	
	<body id="page2" onload="new ElementMaxHeight();">
		<!-- header -->
		<div id="header">
			<div class="container">
				<div class="row-1">
					<form  name="form" method="post" action="./login" >
					<div class="logo"><img alt="" src="./image/comlogo1.png" /></div>
					<div class="top-links">
						<button type="submit" name="submit" value="login" ><img alt="" src="./image/login1.png" /></button>
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
                        			<li><a href="about-us.jsp"class="current"><em><b>ABOUT US</b></em></a></li>
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
         <div class="section">
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
                                          <h2>Brief Introduction About Lightning</h2>
			 							  <p>Lightning is a Chinese multinational company headquartered in Beijing. Lightning's revenue of 10 billion euros in 2010 made it one of the world's leading automatic robot companies. It employs approximately 14,000 people in more than 15 countries. Lightning's main product is Lightning Bug, while extensive involvement in the field of automation.</p>
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
         <div class="section">
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
										   <img alt="" src="./image/ab1.jpg">
										   <div class="ab">
										   <h2>Our Goal</h2>
										   <p>Provide the best service for people of different ages and different periods.</p>
										   <h2>Our Slogan</h2>
										   <p>Clear Goals And Continuous Efforts Lead To Finally Success.</p>
										   <h2>Our Faith</h2>
										   <p>Every stage can have an optimistic attitude. It is good to do things that fit this period.</p>
										   </div>
                                          	<div class="clear"></div>
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
										<h2>Team Member</h2>
										<ul class="list2">
				 					  		<li>
					 							<img alt="" src="./image/11.jpg"/>
					 							<h4><strong>Xiaoming Jiang</strong>President and a big boss</h4>
                     							<p>Graduated from University of Cambridge and was awarded a doctoral degree, he is the president and in charge of the company's final decision.</p>
                 							</li>
                 							<li>
                     							<img alt="" src="./image/22.jpg" />
                     							<h4><strong>Hong Wang</strong>Vice president</h4>
                    							<p>Graduated from University of Oxford and was awarded a doctoral degree, he assists the leader in the management and supervision of the department.</p>
                 							</li>
											<li>
												<img alt="" src="./image/33.jpg" />
                     							<h4><strong>Lan Xiao</strong>Marketing Manager</h4>
                     							<p>Graduated from Central University of Finance and Economics and was awarded a doctoral degree, she is in charge of the company's market strategy.</p>
                 							</li>
				 							<li>
                     							<img alt="" src="./image/44.jpg" />
                     							<h4><strong>Xuan Li</strong>Technical Manager</h4>
                     							<p>He graduated from Beijing University of Posts and Telecommunications and was awarded a doctoral degree. He is in charge of the company's technical department.</p>
                 							</li>
				 							<li class="last">
												<img alt="" src="./image/55.jpg"/>
                 								<h4><strong>Rou Fang</strong>Personal assistant</h4>
                 								<p>Graduated from Peking University and was awarded a doctoral degree, she is in charge of the company's personnel resources.</p>
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
