package jspservlet.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.CartDAO;
import jspservlet.dao.ProductDAO;
import jspservlet.dao.impl.CartDAOImpl;
import jspservlet.dao.impl.ProductDAOImpl;
import jspservlet.vo.Product;
import jspservlet.vo.User;

public class AddCartServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		}
		
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		
		Product product = new Product();		
		User user = new User();
		HttpSession session = req.getSession();
		
		if(session.getAttribute("username")!=null){
			user.setUsername((String) session.getAttribute("username"));	
			CartDAO dao = new CartDAOImpl();
			int flag = 0;
		
			if(req.getParameter("add") != null){			
			
				String i = req.getParameter("add");	
				product.setProID(Integer.parseInt(i));		
				product.setAmount(Integer.parseInt(req.getParameter(i)));	
			
				try {
					flag = dao.addProduct(product,user);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
				if( flag == 1){
					ProductDAO dao1 = new ProductDAOImpl();
					ArrayList<Product> productList = null;
				
				try{		
					productList = dao1.displayProduct();
				
				}
				catch(Exception e){
					e.printStackTrace();
				}		
				
					session.setAttribute("productList",productList);			
				
					res.sendRedirect("./product.jsp");		
				}
				else{
					res.sendRedirect("./error.jsp");
				}
			}
		
		
			if(req.getParameter("buy") != null){		
			
				String i = req.getParameter("buy");	
				product.setProID(Integer.parseInt(i));		
				product.setAmount(Integer.parseInt(req.getParameter(i)));				
				product.setPrice(Integer.parseInt(req.getParameter(i+"price")));
				product.setName((String)req.getParameter(i+"name"));
				product.setPicture((String)req.getParameter(i+"picture"));
				session.setAttribute("product",product);	
				session.setAttribute("user",user);
				
				res.sendRedirect("./poster-address.jsp");		
			
										
			}
		}
		else{
			res.sendRedirect("./nologin.jsp");
		}
	}
}
