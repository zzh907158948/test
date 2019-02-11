package jspservlet.dao;

import java.util.ArrayList;
import java.util.function.ObjLongConsumer;

import jspservlet.vo.Product;
import jspservlet.vo.User;

public interface ProductDAO {
	public ArrayList<Product> displayProduct(  ) throws Exception;
	public Product detailProduct(String ID) throws Exception;
	
}
