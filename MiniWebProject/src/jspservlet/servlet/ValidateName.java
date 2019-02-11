package jspservlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.impl.UserDAOImpl;
import jspservlet.vo.User;

// @WebServlet("/ValidateName") 可用注释 可用xml
public class ValidateName extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		}
		
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
			
		
		UserDAOImpl dao = new UserDAOImpl();
		int flag=0;
		
	
		String username = req.getParameter("username");
		
		try{
			
			flag=dao.existByUsername(username);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		if(flag==1){
		
	
			res.getWriter().write("Username availability");
		}
		if(flag == 0){
			
			
			res.getWriter().write("Username already exists,please re-enter");
		}
		
		
		}

}
