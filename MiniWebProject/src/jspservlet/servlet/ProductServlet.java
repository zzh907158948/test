package jspservlet.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.ProductDAO;
import jspservlet.dao.impl.ProductDAOImpl;
import jspservlet.dao.impl.UserDAOImpl;
import jspservlet.vo.Product;
import jspservlet.vo.User;

public class ProductServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		}
		
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
			
		HttpSession session=req.getSession();
		ProductDAO dao = new ProductDAOImpl();
		ArrayList<Product> productList = null;
		Product product = null;
		if(req.getParameter("display")!= null)
		{
			try{		
				productList = dao.displayProduct();
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
				
				session.setAttribute("productList",productList);						
				res.sendRedirect("./product.jsp");
			
		}else if(req.getParameter("detail")!= null)
		{
			String ID = req.getParameter("detail");
			
			try{		
				product = dao.detailProduct(ID);
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
				
				session.setAttribute("productdetail",product);						
				res.sendRedirect("./product1.jsp");
		}else{
			try{		
				productList = dao.displayProduct();
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
				
				session.setAttribute("productList",productList);						
				res.sendRedirect("./product.jsp");
			
		}
	}
	
}
