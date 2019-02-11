package jspservlet.dao;

import java.util.ArrayList;

import jspservlet.vo.Cart;
import jspservlet.vo.Product;
import jspservlet.vo.User;

public interface CartDAO {
	public int addProduct( Product product,User user ) throws Exception;
	public int addProduct( Cart cart ) throws Exception;
	public int deleteProduct( Cart cart ) throws Exception;
	public int dropProduct( Cart cart ) throws Exception;
	public int buyProduct( Product product, User user) throws Exception;
	public int buyProduct1( Product product,User user) throws Exception;
	public ArrayList<Cart> displayCart( User user ) throws Exception;
	public ArrayList<Cart> displayOrder( User user ) throws Exception;
}
