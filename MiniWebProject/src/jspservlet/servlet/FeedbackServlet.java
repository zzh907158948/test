package jspservlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.FeedbackDAO;
import jspservlet.dao.impl.FeedbackDAOImpl;
import jspservlet.vo.Feedback;

public class FeedbackServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
			}
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		Feedback feedback= new Feedback();
		
		feedback.setName(req.getParameter("name"));
		feedback.setEmail(req.getParameter("email"));
		feedback.setTitle(req.getParameter("title"));
		feedback.setMessage(req.getParameter("message"));
		FeedbackDAO dao = new FeedbackDAOImpl();
		int flag=0;
		try{
		flag=dao.insertfeedback(feedback);
		}catch(Exception e){
			
			e.printStackTrace();
		}			  
		if(flag ==1){
			res.sendRedirect("./success.jsp");
		}
		else{
			res.sendRedirect("./error.jsp");
		}
	}
}
