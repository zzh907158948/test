<%@page import="jspservlet.vo.Cart"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>




<html>
	<head>
		<title>Purchase List | Welcome To Lightning.net</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta name="description" content="Purchase List page"/>
		<link href="style.css" rel="stylesheet" type="text/css" />
		<link href="layout.css" rel="stylesheet" type="text/css" />
		<script src="maxheight.js" type="text/javascript"></script>
	</head>

	<body id="page8" onload="new ElementMaxHeight();">
		<!-- header -->
		<div id="header">
			<div class="container">
				<div class="row-1">
				
				<div class="logo"><img alt="" src="image/comlogo1.png" /></div>
				<div class="top-links">
					<form  name="form" method="post" action="./login" >
						<button type="submit" name="submit" value="login" ><img alt="" src="image/login2.png" /></button>
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
                                              <div class="user-list">
												  <div class="spec">
													  <a href="user.jsp"><h2>User Home</h2></a>
												  </div>
												  <form name="form" method="post"action="./lookproduct" >
                                              	  		<button type="submit" name=""value="product"><h2>Shopping Now</h2></button>
                                              	  </form>
                                              	  <form  name="form" method="post"action="./mycart" >
											      		<button type="submit"value="cart"><h2>Shopping Cart</h2></button>
											      </form>
											      <form  name="form" method="post"action="./myorder" >
											      		<button type="submit"value="order"><h2>Purchase List</h2></button>
											      </form>
											      <form  name="form" method="post"action="./logout" >
											      		<button type="submit"value="logout"><h2>Logout</h2></button>
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
											  <h2>Purchase List</h2>
											  <h2>List 1</h2>
											  <%
	  											List<Cart> cartList = (List<Cart>)session.getAttribute("cartList");			
												double totalprice = 0;
												if(cartList!=null){		
												for(Cart cart:cartList){%>
											  <h2>Cart ID: <%=cart.getCartID() %></h2>
											  <img class="product" alt="" src="<%=cart.getPicture()%>">
											  <div class="intro3">
												  <p><strong>Name: </strong><%=cart.getProName() %></p>
												  <p><strong>Price: $</strong><%=cart.getPrice() %></p>
												  <p><strong>Amount: </strong><%=cart.getNumber()%></p>
												  <p><strong>Total Price: $</strong><%=cart.getPrice()*cart.getNumber()%></p>
											  </div>
											  <p><strong>Product Status </strong>(1 means having bought and 2 means adding into shopping chart): 1</p>
											  <%totalprice += cart.getPrice()*cart.getNumber(); %>
											  <%}
											  } %>
											  <h2>Total Price: <%=totalprice %></h2>
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
