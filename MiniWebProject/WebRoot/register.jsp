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
    
	function getHTTPObject(){
		var xhr = false;
		if(window.XMLHttpRequest){
			xhr = new XMLHttpRequest();
		}
		else if(window.ActiveXObject){
			xhr = new ActiveXObject("Microsoft.XMLHTTP");
		}
		return xhr;
	}
    function checkUserName() {
    	
        createXMLHttp();
        var username = document.getElementById("username").value;
         
        if (username == "") {
            document.getElementById("showmessage").innerHTML = "You must input the username";
            
        }else{

       	 		xmlhttp.open("POST", "./ValidateName", true);
       	 		
        		xmlhttp.setRequestHeader("Content-type",
               	"application/x-www-form-urlencoded");
      			xmlhttp.send("username=" + username);
        		xmlhttp.onreadystatechange = function() {
            //      alert(xmlhttp.readyState);
            //      alert(xmlhttp.status);
            	if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                	console.log(xmlhttp.responseText);
               	
                	document.getElementById("showmessage").innerHTML = xmlhttp.responseText;
           		 }
        	}
        }
    }
</script>
   
    <script>
  	function validForm(){
		
		var x=document.getElementById("email").value;//email
		var atindex=x.indexOf("@");
		var dotindex=x.lastIndexOf(".");
		var y=document.getElementById("phone").value;//phone number
		var password = document.getElementById("password1").value; 
		var password1 = document.getElementById("password2").value; //password
		var m = $('#showmessage').text();
    	var n= "Username availability";
		//判断email格式是否正确

		if (dotindex<1||atindex<1 || dotindex<atindex+2 || dotindex+2>=x.length){//.和@不能是第一个字符；@必须在.之前，且两者之间要有字符；.之后必须有一个以上字符
			alert("Not a valid e-mail address");
  		return false;
		}
		//判断phone格式是否正确
		if(isNaN(y)||y.length!=11)
		{
		alert("Please enter a valid 11-digit number!");
		return false;
		}
		//判断password是否一致
		if(password!=password1){
			alert("Password input is inconsistent! please enter again!");
		return false;
		}
		if(password.length<6){
			alert("Password should be at least 6 characters long")
		return false;
		}
		if(m!=n){
    	alert(m);
    	return false;
    	}
	}

	</script>
		<title>Register | Welcome To Lightning Ltd.net</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta name="description" content="Register page"/>
		<link href="style.css" rel="stylesheet" type="text/css" />
		<link href="layout.css" rel="stylesheet" type="text/css" />
		<script src="maxheight.js" type="text/javascript"></script>
	</head>

<body id="page5" onload="new ElementMaxHeight();">
		<!-- the top header begins-->
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
                        			<li><a href="register.jsp"class="current"><em><b>REGISTER</b></em></a></li>
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
                                          	<h2>Register Here</h2>
			    							<p>If you want to inter the big family of our company, you need to fill in all blinks following.</p>
                                          	<form  id="contacts-form2" method="post" onsubmit="return validForm();" action ="./register">
                                             	<fieldset>                                               	
                                             		<div class="field"><label>User Name:</label><input type="text" id="username" name="username" required oninvalid=
    												"setCustomValidity('Please input your username');" oninput="setCustomValidity('');"
    												onblur="checkUserName();"/></div><br/>
					 								<div id="showmessage" ></div>
                     								<div class="field"><label>Password:</label><input type="password" id="password1" name="password1" required="required"/></div>
                     								<div class="field"><label>Confirm Password:</label><input type="password" id="password2" name="password2" required="required"/></div>                     	
													<div class="field"><label>E-mail Address:</label><input id="email" type="text" id="email" name="email"required oninvalid="setCustomValidity('Please input your e-mail');"oninput="setCustomValidity('');"/></div>
													<div class="field"><label>Phone Number:</label><input type="text" name="phone"id="phone" required="required"required oninvalid="setCustomValidity('Please input your phone number');" oninput="setCustomValidity('');"/></div>
													<div class="field"><label>Address:</label><input type="text" name="address"id="address" required oninvalid="setCustomValidity('Please input your address');" oninput="setCustomValidity('');"/></div>							
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


