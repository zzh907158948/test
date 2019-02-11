package jspservlet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jspservlet.dao.CartDAO;
import jspservlet.db.DBConnect;
import jspservlet.vo.Cart;
import jspservlet.vo.Product;
import jspservlet.vo.User;

public class CartDAOImpl implements CartDAO {

	@Override
	public int addProduct(Product product,User user) throws Exception {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
        String sql = "select * from `javaproject`.`productinfo`where proID=? ";
       
        int flag = 0;
		// 下面是针对数据库的具体操作
        try{
        	
        	// 连接数据库
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setInt(1,product.getProID());		
			// 进行数据库查询操作
			ResultSet rs = (ResultSet) pstmt.executeQuery();
			
			if(rs.next()){
				
				String name = rs.getString("proName");
				product.setPrice( rs.getInt("price"));
				product.setPicture(rs.getString("picture"));				
				product.setName(name);
				//product.setAmount(Integer.parseInt(amount));
						
			}		
			rs.close();
			pstmt.close();
			
			sql = "INSERT INTO `javaproject`.`cart` ( `price`, `username`, `proName`, `status`,`number`,`picture`) VALUES (?,?,?,?,?,?);";
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setInt(1, product.getPrice());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, product.getName());
			pstmt.setInt(4, 2);
			pstmt.setInt(5, product.getAmount());
			pstmt.setString(6, product.getPicture());
			pstmt.executeUpdate();
			pstmt.close();
			
			String sql1 = "UPDATE `javaproject`.`productinfo` SET amount = amount-? WHERE `proName`=?;";
			pstmt = dbc.getConnection().prepareStatement(sql1);
			pstmt.setInt(1, product.getAmount());
			pstmt.setString(2, product.getName());
			pstmt.execute();
			pstmt.close();
			
			flag = 1;		
			}catch ( SQLException e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}finally {
				// 关闭数据库连接
				dbc.close();
				
			}
		return flag;
	}
	
	@Override
	public int addProduct(Cart cart) throws Exception {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
        String sql = "UPDATE `javaproject`.`cart` SET number = number+1 WHERE `cartID`=?;";
        String sql1 = "UPDATE `javaproject`.`productinfo` SET amount = amount-1 WHERE `proName`=?;";
        String sql2 = "select * from `javaproject`.`cart`where cartID=? ";
        int flag = 0;
		// 下面是针对数据库的具体操作
        try{
        	
        	// 连接数据库
			dbc = new DBConnect();
			pstmt =dbc.getConnection().prepareStatement(sql2);
			pstmt.setInt(1,cart.getCartID());		
			pstmt.execute();
			// 进行数据库查询操作
			ResultSet rs = (ResultSet) pstmt.executeQuery();
			String proName = null;
			if(rs.next()){
				proName = rs.getString("proName");
			}
									
			rs.close();
			pstmt.close();
			
			// 进行数据库更改操作
			pstmt =dbc.getConnection().prepareStatement(sql);
			pstmt.setInt(1,cart.getCartID() );
			pstmt.execute();
			pstmt.close();
			
			// 进行数据库更改操作
			pstmt = dbc.getConnection().prepareStatement(sql1);
			pstmt.setString(1, proName);
			pstmt.execute();
			pstmt.close();
								
			flag = 1;		
			}catch ( SQLException e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}finally {
				// 关闭数据库连接
				dbc.close();
				
			}
		return flag;
	}
	
	@Override
	public int buyProduct1(Product product,User user) throws Exception {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
        String sql = "UPDATE `javaproject`.`cart` SET `status`= 1, `useraddress`=?, `userphone`=?, `time`=? WHERE `cartID`=?;";
        int flag=0;
		// 下面是针对数据库的具体操作
        try{
        	
        	// 连接数据库
			dbc = new DBConnect();
			pstmt =dbc.getConnection().prepareStatement(sql);
			pstmt.setInt(4,product.getCartID());
			pstmt.setString(1, user.getAddress());
			pstmt.setString(2, user.getPhone());
			pstmt.setString(3, user.getDate());
			pstmt.execute();
			
			pstmt.close();
			
			
			flag = 1;		
			}catch ( SQLException e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}finally {
				// 关闭数据库连接
				dbc.close();
				
			}
		return flag;
	}
	@Override
	public int deleteProduct(Cart cart) throws Exception {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
        String sql = "UPDATE `javaproject`.`cart` SET number = number-1 WHERE `cartID`=?;";
        String sql1 = "UPDATE `javaproject`.`productinfo` SET amount = amount+1 WHERE `proName`=?;";
        String sql2 = "select * from `javaproject`.`cart`where cartID=? ";
        int flag = 0;
		// 下面是针对数据库的具体操作
        try{
        	
        	// 连接数据库
        	dbc = new DBConnect();
        	pstmt = dbc.getConnection().prepareStatement(sql2);
        	pstmt.setInt(1,cart.getCartID());		   				
        	pstmt.execute();
        	// 进行数据库查询操作
        	ResultSet rs = (ResultSet) pstmt.executeQuery();		
        	String proName = null;
			if(rs.next()){
				proName = rs.getString("proName");
			}						
        	rs.close();
        	pstmt.close();
        				
        	// 进行数据库更改操作
        	pstmt = dbc.getConnection().prepareStatement(sql);
        	pstmt.setInt(1,cart.getCartID() );
        	pstmt.execute();
        	pstmt.close();
        				
        	// 进行数据库更改操作
        	pstmt = dbc.getConnection().prepareStatement(sql1);
        	pstmt.setString(1, proName);
        	pstmt.execute();
        	pstmt.close();
        									
        	flag = 1;		
			}catch ( SQLException e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}finally {
				// 关闭数据库连接
				dbc.close();
				
			}
		return flag;
	}
	@Override
	public int dropProduct(Cart cart) throws Exception {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
        String sql = "DELETE FROM `javaproject`.`cart` WHERE `cartID`=?;";
        String sql1 = "UPDATE `javaproject`.`productinfo` SET amount = amount+? WHERE `proName`=?;";
        String sql2 = "select * from `javaproject`.`cart`where cartID=? ";
        int flag = 0;
		// 下面是针对数据库的具体操作
        try{
        	
        	// 连接数据库
        	dbc = new DBConnect();
        	pstmt = dbc.getConnection().prepareStatement(sql2);
        	pstmt.setInt(1,cart.getCartID());		   				
        	pstmt.execute();
        	// 进行数据库查询操作
        	ResultSet rs = (ResultSet) pstmt.executeQuery();		
        	
        	int amount=0 ;
        	String proName = null;
			if(rs.next()){
				proName = rs.getString("proName");
				amount = rs.getInt("number");
			}
        	rs.close();
        	pstmt.close();
        				
        	// 进行数据库更改操作
        	pstmt =  dbc.getConnection().prepareStatement(sql);
        	pstmt.setInt(1,cart.getCartID() );
        	pstmt.execute();
        	pstmt.close();
        				
        	// 进行数据库更改操作
        	pstmt =  dbc.getConnection().prepareStatement(sql1);
        	pstmt.setInt(1, amount);
        	pstmt.setString(2, proName);
        	pstmt.execute();
        	pstmt.close();
        									
        	flag = 1;		
			}catch ( SQLException e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}finally {
				// 关闭数据库连接
				dbc.close();
				
			}
		return flag;
	}

	@Override
	public int buyProduct(Product product,User user) throws Exception {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
        
       
        int flag = 0;
		// 下面是针对数据库的具体操作
        try{
        	
        	// 连接数据库
			dbc = new DBConnect();
			System.out.println(product.getPrice());	
			String sql = "INSERT INTO `javaproject`.`cart` ( `price`, `username`, `proName`, `status`,`number`,`useraddress`, `userphone`,`time`,`picture`) VALUES (?,?,?,?,?,?,?,?,?);";
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setInt(1, product.getPrice());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, product.getName());
			pstmt.setInt(4, 1);
			pstmt.setInt(5, product.getAmount());
			pstmt.setString(6,user.getAddress());
			pstmt.setString(7, user.getPhone());
			pstmt.setString(8, user.getDate());
			pstmt.setString(9, product.getPicture());
			pstmt.execute();
			pstmt.close();
			
			String sql1 = "UPDATE `javaproject`.`productinfo` SET amount = amount-? WHERE `proName`=?;";
			pstmt = dbc.getConnection().prepareStatement(sql1);
			pstmt.setInt(1, product.getAmount());
			pstmt.setString(2, product.getName());
			pstmt.execute();
			pstmt.close();
			
			flag = 1;		
			}catch ( SQLException e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}finally {
				// 关闭数据库连接
				dbc.close();
				
			}
		return flag;
	}
	
	
	@Override
	public ArrayList<Cart> displayCart(User user) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Cart> cartList = new ArrayList<>();
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
        String sql = "select * from `javaproject`.`cart` where username=? and status = 2";

		// 下面是针对数据库的具体操作
        try{
        	
        	// 连接数据库
			dbc = new DBConnect();
			pstmt =  dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUsername());		
			// 进行数据库查询操作
			ResultSet rs = (ResultSet) pstmt.executeQuery();
			
			while(rs.next()){
				Cart cart = new Cart();
				int cartID = rs.getInt("cartID");
				int status = rs.getInt("status");
				String proName = rs.getString("proName");
				
				String username = rs.getString("username");
				cart.setCartID(cartID);
				cart.setNumber(rs.getInt("number"));
				cart.setPrice(rs.getInt("price"));
				cart.setProName(proName);
				cart.setUsername(username);
				cart.setStatus(status);
				cart.setPicture(rs.getString("picture"));
				
				cartList.add(cart);
			}
			
			rs.close();
			pstmt.close();
					
			}catch ( SQLException e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}finally {
				// 关闭数据库连接
				dbc.close();
				
			}
		return cartList;
	}
	
	@Override
	public ArrayList<Cart> displayOrder(User user) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Cart> cartList = new ArrayList<>();
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
        String sql = "select * from `javaproject`.`cart` where username=? and status = 1";

		// 下面是针对数据库的具体操作
        try{
        	
        	// 连接数据库
			dbc = new DBConnect();
			pstmt =  dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUsername());		
			// 进行数据库查询操作
			ResultSet rs = (ResultSet) pstmt.executeQuery();
			
			while(rs.next()){
				Cart cart = new Cart();
				int cartID = rs.getInt("cartID");
				int status = rs.getInt("status");
				String proName = rs.getString("proName");
				
				String username = rs.getString("username");
				cart.setCartID(cartID);
				cart.setNumber(rs.getInt("number"));
				cart.setPrice(rs.getInt("price"));
				cart.setProName(proName);
				cart.setUsername(username);
				cart.setStatus(status);
				cart.setAddress(rs.getString("useraddress"));
				cart.setPhone(rs.getString("userphone"));
				cart.setDate(rs.getString("time"));
				cart.setPicture(rs.getString("picture"));
				cartList.add(cart);
			}
			
			rs.close();
			pstmt.close();
					
			}catch ( SQLException e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}finally {
				// 关闭数据库连接
				dbc.close();
				
			}
		return cartList;
	}
}
