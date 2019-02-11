package jspservlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import jspservlet.dao.impl.UserDAOImpl;
import jspservlet.io.User;

public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		
	HttpSession session=req.getSession();

	User user= new User();
	user.setUsername(req.getParameter("username"));
	user.setPassword(req.getParameter("password"));
	
	UserDAOImpl dao = new UserDAOImpl();
	int flag=0;
	
	try{
		flag=dao.queryByUsername(user);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	if(flag==1){
		try{
			session.setAttribute("username", user.getUsername());
			user=dao.getByUsername(req.getParameter("username"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		session.setAttribute("user",user);
		res.sendRedirect("./user.jsp");
	}
	else{
		res.sendRedirect("./error.jsp");
	}
	
	
	
	
	}
}
