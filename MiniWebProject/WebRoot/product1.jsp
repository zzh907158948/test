<%@page import="jspservlet.vo.Product"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">



<html>
	<head>
		
		<title>Details | Welcome To Lightning Ltd.net</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta name="description" content="Details page"/>
		<link href="style.css" rel="stylesheet" type="text/css" />
		<link href="layout.css" rel="stylesheet" type="text/css" />
		<script src="maxheight.js" type="text/javascript"></script>
		<script>
  	function checknumber(){
		
		var x=document.getElementById("number").value;//number
		var y=document.getElementById("amount").value;//amount
		
		//判断number格式是否正确
		if(isNaN(x)||x<=0)
		{
		alert("Please enter a correct number!");	
		return false;
		}else if( x > y )
		{		
			alert("Storage is short, please input again");
			return false;
		}else{
			return true;
		}
		
	}
		
	</script>
	</head>
	<body id="page4" onload="new ElementMaxHeight();">
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
                        		<li><a href="contact-us.jsp" class="last"><em><b>CONTACT US</b></em></a></li>
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
            	<h1>Clear Goals And Continuous Efforts Lead To Finally Success</h1>
            </div>
         </div>
         <%Product product = (Product)session.getAttribute("productdetail");%>
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
                                       	<form method="post" action="./product" onsubmit="return checknumber();" >
                                       	<h2>Product ID: <%=product.getProID() %></h2>
										<img class="product" alt="" src="<%=product.getPicture()%>">
										<div class="intro">
											<p><strong>Name: </strong><%=product.getName() %></p>
											<p><strong>Introduction: </strong><%=product.getFuntion() %></p>
											<p><strong>Price: $</strong><%=product.getPrice()%></p>
											<p><strong>Amount: </strong><%=product.getAmount()%></p>
											<p><strong>I want to buy: </strong>
											<input type="text" required="required" id="number" 
												name="<%=product.getProID()%>" onblur="checknumber();"></p>
											<button  type="submit" name="add" value=<%=product.getProID()%>><em><b>Add To Cart</b></em></button>
											<button type="submit" name="buy" value=<%=product.getProID()%>><em><b>Buy</b></em></button>
											<input type="hidden" name="<%=product.getProID()%>price" value=<%=product.getPrice()%>>
											<input type="hidden" name="<%=product.getProID()%>name" value=<%=product.getName()%>>
											<input type="hidden" name="<%=product.getProID()%>picture" value=<%=product.getPicture()%>>
											<input type="hidden" id="amount" name="<%=product.getProID()%>amount" value=<%=product.getAmount()%>>	
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
