<%@page import="jspservlet.vo.Product"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">



<html>
	<head>
		<title>Product | Welcome To ATC Ltd.net</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css"/>
		<meta name="description" content="Home page - free business website template available at mycodes.net for free download."/>
		<link href="style.css" rel="stylesheet" type="text/css"/>
		<script src="maxheight.js" type="text/javascript"></script>
		<script>
  	function checknumber1(){
		
		var x=document.getElementById("1number").value;//number
		var y=document.getElementById("1amount").value;//amount
		//var x=document.getElementById("amount").value;//number
		
		//var z=document.getElementById("amount").value;//number
				
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
	function checknumber2(){
		
		var x=document.getElementById("2number").value;//number
		var y=document.getElementById("2amount").value;//amount
		//var x=document.getElementById("amount").value;//number
		
		//var z=document.getElementById("amount").value;//number
				
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
	function checknumber3(){
		
		var x=document.getElementById("3number").value;//number
		var y=document.getElementById("3amount").value;//amount
		//var x=document.getElementById("amount").value;//number
		
		//var z=document.getElementById("amount").value;//number
				
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
			<h3>Product Chart</h3>
				
			<% 	
				int i=0;
				ArrayList<Product> productList = (ArrayList<Product>)session.getAttribute("productList");
				if(productList!=null){
					for(Product product:productList){%>
			<div class="user-part4">
					
					<form method="post" action="./product" onsubmit="return checknumber<%=product.getProID()%>();" >
					
					
						<div class="row1">
							<h2>Product ID: <%=product.getProID() %></h2>
						</div>
						<div class="row2">
							<div class="row2-col1">																
								<img alt="" src="./image/<%=product.getName()%>.png">
								<%if(product.getPrice()==300){ %> 
								<img alt="" src="./image/p1.png">
								<%}else if(product.getPrice()==400){%>
								<img alt="" src="./image/p2.jpeg">
								<%}else if(product.getPrice()==200){%>
								<img alt="" src="./image/p3.jpg">
								<%}else{%>
								<img alt="" src="./image/p1.png">
								<%}%>						
							</div>
							<div class="row2-col2">
								<ul>
									<li><strong>Product Name:</strong><%=product.getName()%></li>
									<li><strong>Product Price:</strong><%=product.getPrice()%> </li>
									<li><strong>Product Amount:</strong><%=product.getAmount()%></li>									
									<li><strong>Purchase Quantity:</strong><input type="text" required="required" id="<%=product.getProID()%>number" name="<%=product.getProID()%>" 
										onblur="checknumber<%=product.getProID()%>();"></li>
									<li class="ele5">
										<button class="button" id="amount"type="submit" name="add" value=<%=product.getProID()%>><em><b>Add To Chart</b></em></button>
									</li>
									<li class="ele5">
										<button class="button"id="amount"type="submit" name="buy" value=<%=product.getProID()%>><em><b>Buy</b></em></button>
									</li>
								</ul>
							</div>
						</div>
						<input type="hidden" name="<%=product.getProID()%>price" value=<%=product.getPrice()%>>
						<input type="hidden" name="<%=product.getProID()%>name" value=<%=product.getName()%>>
						<input type="hidden" id="<%=product.getProID()%>amount" name="<%=product.getProID()%>amount" value=<%=product.getAmount()%>>															
					</form>
						
							
			</div>
			
			<%}
		}%>	
		</div>
	<div id="footer">
			<div class="fleft">Copyright &copy; 2018</div>
            <div class="fright">Automatic Tracking Car Ltd</div>
	</div>
	</body>
</html>

