package jspservlet.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.CartDAO;

import jspservlet.dao.impl.CartDAOImpl;
import jspservlet.vo.Cart;
import jspservlet.vo.Product;
import jspservlet.vo.User;

public class OrderServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		}
		
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
			
		CartDAO dao = new CartDAOImpl();
		ArrayList<Cart> cartList = null;
		User user = new User();
		HttpSession session = req.getSession();
		user.setUsername((String) session.getAttribute("username"));
		
		try{		
			cartList = dao.displayOrder(user);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		

			
			session.setAttribute("cartList",cartList);			
			
			res.sendRedirect("./order.jsp");
		
		
		
		}
}
