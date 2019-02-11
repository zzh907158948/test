package jspservlet.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest; 

import javax.servlet.ServletException; 
import javax.servlet.http.HttpSession;


import java.io.IOException;
import jspservlet.dao.impl.UserDAOImpl;
import jspservlet.vo.User;

public class RegisterServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		}
		
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
			
		
		User user= new User();
		user.setUsername(req.getParameter("username"));
		user.setPassword(req.getParameter("password1"));
		user.setAddress(req.getParameter("address"));	
		user.setPhone(req.getParameter("phone"));
		user.setEmail(req.getParameter("email"));
		UserDAOImpl dao = new UserDAOImpl();
		int flag=0;
		
		try{
			
			flag=dao.insertByUsername(user);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		if(flag==1){
			HttpSession session=req.getSession();
			session.setAttribute("username1",user.getUsername());			
			session.setAttribute("address",user.getAddress());
			session.setAttribute("phone",user.getPhone());
			session.setAttribute("email",user.getEmail());
			res.sendRedirect("./registersuccess.jsp");
		}
		else{
			res.sendRedirect("./error.jsp");
		}
		
		
		}

}
