<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="jspservlet.vo.Product"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>Product | Welcome To Lightning Ltd.net</title>
			<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
			<meta http-equiv="Content-Style-Type" content="text/css" />
			<meta name="description" content="Product page"/>
			<link href="style.css" rel="stylesheet" type="text/css" />
			<link href="layout.css" rel="stylesheet" type="text/css" />
		<script src="maxheight.js" type="text/javascript"></script>
	</head>

<body id="page3" onload="new ElementMaxHeight();">
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
								  <button class="current" name="display" type="submit"><b>PRODUCT</b></button>
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
            	<h1>Clear Goals And Continuous Efforts Lead To Finally Success</h1>
            </div>
         </div>
         <!-- main-banner-small end -->
		<div class="wrapper">	
		<%	
				int i=0;
				ArrayList<Product> productList = (ArrayList<Product>)session.getAttribute("productList");
				if(productList!=null){
					for(Product product:productList){%>
		    				
         
         	 <div class="col-1 ">         			        	
            	<!-- box1 begin -->
               <div class="box1 maxheight">
                  <div class="border-top maxheight">
                     <div class="border-right maxheight">
                        <div class="border-bot maxheight">
                           <div class="border-left maxheight">
                              <div class="left-top-corner maxheight">
                                 <div class="right-top-corner maxheight">
                                    <div class="right-bot-corner maxheight">
                                       <div class="left-bot-corner maxheight">
                                          <div class="inner">
                                             <h2>Name: <%=product.getName()%></h2>
											  <div class="p1">
												  <img alt="" src="<%=product.getPicture()%>">
											  </div>
											  <form method="post" action="./lookproduct" >
                                             		<button class="button1" type="submit" name ="detail" value=<%=product.getProID()%>><em><b>Details</b></em></button>
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
               <!-- box1 end -->
            </div>
           
           
         
         <%}
         } %>
		   </div>
      </div>
   </div>
   <!-- footer -->
   <div id="footer">
	   <div class="container">
         <div class="wrapper">
			 <div class="fleft">Copyright &copy; 2018</div>
             <div class="fright">Lighting Welcome You</div>
      	 </div>
	   </div>
   </div>
</body>
</html>
