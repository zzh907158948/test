package jspservlet.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.CartDAO;
import jspservlet.dao.ProductDAO;
import jspservlet.dao.impl.CartDAOImpl;
import jspservlet.dao.impl.ProductDAOImpl;
import jspservlet.vo.Cart;
import jspservlet.vo.Product;
import jspservlet.vo.User;

public class CartServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		}
		
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		CartDAO dao = new CartDAOImpl();
		int flag = 0;
		ArrayList<Cart> cartList = null;	
		User user = new User();
		HttpSession session = req.getSession();
		
		user.setUsername((String) session.getAttribute("username"));
		System.out.println(user.getUsername());
		
		if(req.getParameter("add") != null)		
		{
			Cart cart = new Cart();
			cart.setCartID(Integer.parseInt(req.getParameter("add")));
			try{		
				flag = dao.addProduct(cart);
			
			}
			catch(Exception e){
				e.printStackTrace();
			}	
			if(flag==1){
				try{		
					cartList = dao.displayCart(user);
			
				}catch(Exception e){
				e.printStackTrace();
				}		
				session.setAttribute("cartList",cartList);		
				res.sendRedirect("./cart.jsp");		
			}
			else{
				res.sendRedirect("./error.jsp");
			}
		}
		else if(req.getParameter("buy") != null)		
		{
			Cart cart = new Cart();
			Product product = new Product();
			String i =req.getParameter("buy");
			product.setAmount(Integer.parseInt(req.getParameter(i+"number")));
			product.setName((String)req.getParameter(i+"proName"));
			product.setPicture((String)req.getParameter(i+"picture"));
			product.setPrice(Integer.parseInt(req.getParameter(i+"price")));
			product.setCartID(Integer.parseInt(i));
			
			
			session.setAttribute("product",product);	
			session.setAttribute("user",user);	
			res.sendRedirect("./poster-address.jsp");		
		
		}
		
		else if(req.getParameter("minus") != null)		
		{
			Cart cart = new Cart();
			cart.setCartID(Integer.parseInt(req.getParameter("minus")));
			try{		
				flag = dao.deleteProduct(cart);
			
			}
			catch(Exception e){
				e.printStackTrace();
			}	
			
			if(flag==1){
				try{		
					cartList = dao.displayCart(user);
			
				}catch(Exception e){
				e.printStackTrace();
				}		
				session.setAttribute("cartList",cartList);		
				res.sendRedirect("./cart.jsp");		
			}
			else{
				res.sendRedirect("./error.jsp");
			}
		}
		
		else if(req.getParameter("drop") != null)		
		{
			Cart cart = new Cart();
			
			cart.setCartID(Integer.parseInt(req.getParameter("drop")));
			try{		
				flag = dao.dropProduct(cart);
			
			}
			catch(Exception e){
				e.printStackTrace();
			}	
			
			if(flag==1){
				try{		
					cartList = dao.displayCart(user);
			
				}catch(Exception e){
				e.printStackTrace();
				}		
				session.setAttribute("cartList",cartList);		
				res.sendRedirect("./cart.jsp");		
			}
			else{
				res.sendRedirect("./error.jsp");
			}
		}
		else{
		
			
			try{		
				cartList = dao.displayCart(user);
		
			}catch(Exception e){
			e.printStackTrace();
			}		
			session.setAttribute("cartList",cartList);					
			
			res.sendRedirect("./cart.jsp");		
		}
	}
}
