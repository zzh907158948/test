package jspservlet.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.mail.handlers.message_rfc822;

import jspservlet.dao.CartDAO;
import jspservlet.dao.ProductDAO;
import jspservlet.dao.impl.CartDAOImpl;
import jspservlet.dao.impl.ProductDAOImpl;
import jspservlet.dao.impl.UserDAOImpl;
import jspservlet.vo.Cart;
import jspservlet.vo.Product;
import jspservlet.vo.User;

public class BuyServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		}
		
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		HttpSession session=req.getSession();
		Date day=new Date();   
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		System.out.println(df.format(day));   	
		
		if(req.getParameter("information")!=null)
		{
		
			
			User user=(User)session.getAttribute("user");
			
			Product product = (Product)session.getAttribute("product");
			
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			user.setAddress(req.getParameter("address"));	
			user.setPhone(req.getParameter("phone"));
			user.setDate(df.format(day));
			
			session.setAttribute("product",product);	
			session.setAttribute("user",user);
		
			res.sendRedirect("./confirm-address.jsp");
		}
		
	
		
		if(req.getParameter("confirm")!=null)
		{
			CartDAO dao = new CartDAOImpl();
			int flag = 0;		
			User user=(User)session.getAttribute("user");		
			Product product = (Product)session.getAttribute("product");
			
			if( product.getCartID() == 0 ){
				
				try {
					flag = dao.buyProduct(product,user);
				} 
				catch (Exception e) {
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
			else{
				try {
					flag = dao.buyProduct1(product,user);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
				if( flag == 1){
					
					ArrayList<Cart> cartList = null;
					
					try{		
						cartList = dao.displayCart(user);
					
					}
					catch(Exception e){
						e.printStackTrace();
					}		
					
					session.setAttribute("cartList",cartList);			
					
					res.sendRedirect("./cart.jsp");		
				}
				else{
					res.sendRedirect("./error.jsp");
				}
				
			}
															
		}
			
	
		
						
		
	}
}
