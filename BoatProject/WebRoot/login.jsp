<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>1</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   		<form  method="post"  action="./login">
			<fieldset>
				<label>User Name:</label><input id="username" type="text" name="username"required="required"/>
                <label>Password: </label><input id="password" type="password" name="password"required="required" onblur="checkpassword();"/>
                <div id="showmessage" ></div>			
				<button type="submit"><em><b>Login</b></em></button>
			</fieldset> 
		</form>
  </body>
</html>
