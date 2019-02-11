<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
	<head>
		<title>Contact Us | Welcome To Lightning Ltd.net</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta name="description" content="Contact us page"/>
		<link href="style.css" rel="stylesheet" type="text/css" />
		<link href="layout.css" rel="stylesheet" type="text/css" />
		<script src="maxheight.js" type="text/javascript"></script>
	</head>

	<body id="page6" onload="new ElementMaxHeight();">
		<!-- header -->
		<div id="header">
			<div class="container">
				<div class="row-1">
				<div class="logo"><img alt="" src="image/comlogo1.png" /></div>
				<div class="top-links">
					<form  name="form" method="post" action="./login" >
						<button type="submit" name="submit" value="login" ><img alt="" src="image/login1.png" /></button>
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
                                          	<h2>Contact Us</h2>
			    							<p>If you have any comments on our company, or would like to ask for help, please fill in the following information truthfully, we will respond promptly.</p>                            
                                          	<form id="contacts-form" method="post" action="./contact-us">
				   								<fieldset>
										 			<div class="field"><label>Full Name:</label><input type="text" value="" name="name"required/></div>
                     								<div class="field"><label>E-mail:</label><input type="text" value="" name="email"required/></div>
                     								<div class="field"><label>Title:</label><input type="text" value="" name="title"required/></div>
                     								<div class="field"><label>Message:</label><textarea cols="" rows="" name="message" required></textarea></div>
                     								<div class="alignright"><button type="submit"><em><b>Submit</b></em></button></div>
                     							</fieldset>
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
            <!-- box end -->
         </div>
         <div class="wrapper">
         	<div class="col-1 maxheight">
            	<!-- box begin -->
               <div class="box maxheight">
                  <div class="border-top maxheight">
                     <div class="border-right maxheight">
                        <div class="border-bot maxheight">
                           <div class="border-left maxheight">
                              <div class="left-top-corner maxheight">
                                 <div class="right-top-corner maxheight">
                                    <div class="right-bot-corner maxheight">
                                       <div class="left-bot-corner maxheight">
                                          <div class="inner">
                                             <h2>Give Us a Call</h2>
                   								<ul class="list2">
					   								<li><b>Beijing:</b> 010-2323-3489</li>
                       								<li><b>New York:</b> 5893-384-019</li>
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
            <div class="col-2 maxheight">
            	<!-- box begin -->
               <div class="box maxheight">
                  <div class="border-top maxheight">
                     <div class="border-right maxheight">
                        <div class="border-bot maxheight">
                           <div class="border-left maxheight">
                              <div class="left-top-corner maxheight">
                                 <div class="right-top-corner maxheight">
                                    <div class="right-bot-corner maxheight">
                                       <div class="left-bot-corner maxheight">
                                          <div class="inner">
                                            <h2>Our Offices</h2>
		   	       							<ul class="list2">
					   							<li><b>Beijing,China:</b> no.10, HaiDian District</li>
			           							<li><b>New York,U.S:</b> 472, 58.sa, 223 District</li>
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
            <div class="col-3 maxheight">
            	<!-- box begin -->
               <div class="box maxheight">
                  <div class="border-top maxheight">
                     <div class="border-right maxheight">
                        <div class="border-bot maxheight">
                           <div class="border-left maxheight">
                              <div class="left-top-corner maxheight">
                                 <div class="right-top-corner maxheight">
                                    <div class="right-bot-corner maxheight">
                                       <div class="left-bot-corner maxheight">
                                          <div class="inner">
                                             <h2>E-mail</h2>
		   		   								<ul class="list2">
					   								<li>LIGHTNING2008@163.com</li>
													<li>WEL1018qos@126.com</li>
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