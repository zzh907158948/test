<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

 
<html>
	<head>
	<script src="jquery/jquery-3.3.1.min.js"></script >
	<script >
    var xmlhttp;
    var flag;
    var x;
    function createXMLHttp() {
        if (window.ActiveXObject) {
            //ie  
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        } else {
            //firefox  
            xmlhttp = new XMLHttpRequest();
        }

    }

    function checkpassword() {
    	
        createXMLHttp();
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;
        if ( username == "" || password == "") {
            
            document.getElementById("showmessage").innerHTML = "You must input the username or password!";
            
        }else{

       	 		xmlhttp.open("POST", "./ValidatePassword", true);
        		xmlhttp.setRequestHeader("Content-type",
               	"application/x-www-form-urlencoded");
      			xmlhttp.send("username=" + username);
      			
        		xmlhttp.onreadystatechange = function()
        		{
                
                 
            		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) 
            		{
                		var x = xmlhttp.responseText;
                		
                		if(x == "0")
                		{
                			
                			document.getElementById("showmessage").innerHTML = "Username does not exist!Please enter again!";
                			
                		}
                		else if(x!=password) {
                			
                			document.getElementById("showmessage").innerHTML = "Error password!";
                			
                		}else{
                			
                			document.getElementById("showmessage").innerHTML = "Correct password!";
                			
                		}
                	        	            	
           		 	}
           		 	
        		}
        		  
        			
        	}       
    }
    function checksubmit(){
    	var x = $('#showmessage').text();
    	var y = "Correct password!";
    	if(x!=y){
    	alert(x);
    	return false;
    	}
    }
</script>
		<title>Log in | Welcome To Lightning Ltd.net</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta name="description" content="Login page"/>
		<link href="style.css" rel="stylesheet" type="text/css" />
		<link href="layout.css" rel="stylesheet" type="text/css" />
		<script src="maxheight.js" type="text/javascript"></script>
	</head>

<body id="page6" onload="new ElementMaxHeight();">
	<!-- the top header begins-->
	<div id="header">
		<div class="container">
			<div class="row-1">
				
				<div class="logo"><img alt="" src="image/comlogo1.png" /></div>
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
                                          	<h2>Log In Now</h2>
			    							<p>Please input your username and correct password.</p>                                      	
                                          	<form id="contacts-form2" method="post" onsubmit="return checksubmit();" action="./login2">
												<fieldset>
													<div class="field"><label>User Name:</label><input id="username" type="text" name="username"required="required"/></div>
                    								<div class="field"><label>Password: </label><input id="password" type="password" name="password"required="required" onblur="checkpassword();"/></div>
                   				 					<div id="showmessage" ></div>			
													<div class="alignright"><button type="submit"><em><b>Login</b></em></button></div>
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

