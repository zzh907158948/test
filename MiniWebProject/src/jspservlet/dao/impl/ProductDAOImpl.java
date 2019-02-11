package jspservlet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import jspservlet.dao.ProductDAO;
import jspservlet.db.DBConnect;
import jspservlet.vo.Product;

public class ProductDAOImpl implements ProductDAO {
	
	ArrayList<Product> productList = new ArrayList<>();
	
	@Override
	public ArrayList<Product> displayProduct() throws Exception {
		// TODO Auto-generated method stub
		
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
        String sql = "select * from `javaproject`.`productinfo` ";

		// ������������ݿ�ľ������
        try{
        	
        	// �������ݿ�
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
					
			// �������ݿ��ѯ����
			ResultSet rs = (ResultSet) pstmt.executeQuery();
			
			while(rs.next()){
				Product product = new Product();
				String name = rs.getString("proName");
				product.setPicture(rs.getString("picture"));
				product.setName(name);
				product.setAmount(rs.getInt("amount"));
				product.setPrice(rs.getInt("price"));
				product.setProID(rs.getInt("proID"));
				productList.add(product);
			}
			
			rs.close();
			pstmt.close();
					
			}catch ( SQLException e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}finally {
				// �ر����ݿ�����
				dbc.close();
				
			}
		return productList;
	}
	public Product detailProduct(String ID) throws Exception{
		
		Product product = new Product();
		int id = Integer.parseInt(ID);
		product.setProID(id);
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
        String sql = "select * from `javaproject`.`productinfo` where proID=? ";
        // ������������ݿ�ľ������
        try{
        	
        	// �������ݿ�
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setInt(1, id);		
			// �������ݿ��ѯ����
			ResultSet rs = (ResultSet) pstmt.executeQuery();
			
			while(rs.next()){
				
				product.setPicture(rs.getString("picture"));
				product.setName(rs.getString("proName"));
				product.setAmount(rs.getInt("amount"));
				product.setPrice(rs.getInt("price"));
				product.setFuntion(rs.getString("function"));
				
			}
			
			rs.close();
			pstmt.close();
					
			}catch ( SQLException e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}finally {
				// �ر����ݿ�����
				dbc.close();
				
			}
		return product;
	}
		
	
}
