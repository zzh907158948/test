package jspservlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.impl.UserDAOImpl;
import jspservlet.vo.User;

public class ValidatePassword extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		}
		
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
			
		
		UserDAOImpl dao = new UserDAOImpl();
		int flag=0;
		String s = null;
		String username = req.getParameter("username");
		try{
			
			flag=dao.existByUsername(username);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		if(flag==1){
			System.out.println("用户名不存在");
			res.getWriter().write("0");
		}
		
		else if(flag == 0){
			System.out.println("用户名存在");
			try{
				
				s=dao.queryUsername(username);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			res.getWriter().write(s);
		}
		
		
	}

}
