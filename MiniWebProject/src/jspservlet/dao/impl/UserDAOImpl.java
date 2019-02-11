package jspservlet.dao.impl;

import java.io.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import jspservlet.dao.UserDA0;
import jspservlet.db.DBConnect;
import jspservlet.vo.User;

public class UserDAOImpl implements UserDA0 {

	@Override
	public int insertByUsername(User user) throws Exception {
		int flag = 0;
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
        String sql = "INSERT INTO `javaproject`.`userinfo` (`username`, `password`, `address`, `phone`,`email`) VALUES (?, ?, ?, ?,?);";

		// ������������ݿ�ľ������
		try{
				// �������ݿ�
				dbc = new DBConnect();		
				
				pstmt = dbc.getConnection().prepareStatement(sql);
				pstmt.setString(1, user.getUsername());
				pstmt.setString(2, user.getPassword());					
				pstmt.setString(3, user.getAddress());
				pstmt.setString(4, user.getPhone());
				pstmt.setString(5, user.getEmail());
				pstmt.executeUpdate();
					
				flag = 1;
			
				
				pstmt.close();
				
		}catch ( SQLException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}finally {
			// �ر����ݿ�����
			dbc.close();
			
		}
		/*// ����û�������û�����Tom��������123����ô�ñ�־flagΪ1.
		if( user.getUsername().equals("Tom") && user.getPassword().equals("123"))
		{
			flag = 1;
		}*/
		return flag;
	}
	
	@Override
	public int queryByUsername(User user) throws Exception {
		// TODO Auto-generated method stub
		int flag = 0;
		String sql = "select * from `javaproject`.`userinfo` where username=?";
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		
		// ������������ݿ�ľ������
		try{
				// �������ݿ�
				dbc = new DBConnect();
				pstmt = dbc.getConnection().prepareStatement(sql);
				pstmt.setString(1, user.getUsername());
				
				
				// �������ݿ��ѯ����
				ResultSet rs = (ResultSet) pstmt.executeQuery();
				if( rs.next() ){
					// ��ѯ�����ݣ�֮�󽫲�ѯ�������ݸ�ֵ��person����
					if( rs.getString("password").equals(user.getPassword())){
						flag = 1;
					}
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
		/*// ����û�������û�����Tom��������123����ô�ñ�־flagΪ1.
		if( user.getUsername().equals("Tom") && user.getPassword().equals("123"))
		{
			flag = 1;
		}*/
		return flag;
	}
	@Override
	public String queryUsername(String s) throws Exception {
		// TODO Auto-generated method stub
		int flag = 0;
		String m = null;
		String sql = "select * from `javaproject`.`userinfo` where username=?";
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		
		// ������������ݿ�ľ������
		try{
				// �������ݿ�
				dbc = new DBConnect();
				pstmt = dbc.getConnection().prepareStatement(sql);
				pstmt.setString(1, s);
				
				
				// �������ݿ��ѯ����
				ResultSet rs = (ResultSet) pstmt.executeQuery();
				if( rs.next() ){
					// ��ѯ�����ݣ�֮�󽫲�ѯ�������ݸ�ֵ��person����
					m = rs.getString("password");
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
		/*// ����û�������û�����Tom��������123����ô�ñ�־flagΪ1.
		if( user.getUsername().equals("Tom") && user.getPassword().equals("123"))
		{
			flag = 1;
		}*/
		return m;
	}
	@Override
	public int existByUsername(String username) throws Exception {
		// TODO Auto-generated method stub
		int flag = 0;
		String sql = "select * from `javaproject`.`userinfo` where username=?";
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
				
		// ������������ݿ�ľ������
		try{
				// �������ݿ�
				dbc = new DBConnect();
				pstmt = dbc.getConnection().prepareStatement(sql);
				pstmt.setString(1, username);
						
						
				// �������ݿ��ѯ����
				ResultSet rs = (ResultSet) pstmt.executeQuery();
				// ���Ϊfalse�����û�������
				if( rs.next() == false ){
					flag = 1;
					
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
			
				return flag;
	}
	
	@Override
	public User getByUsername(String username) throws Exception {
		// TODO Auto-generated method stub
		int flag = 0;
		User user = new User();
		user.setUsername(username);
		String sql = "select * from `javaproject`.`userinfo` where username=?";
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		// ��ͼƬ�������ݿ�
		String path = "D:/JAVA/MiniWebProject/WebRoot/image/p1.png";
		String sql1 = "UPDATE `javaproject`.`productinfo` SET `picture`=? WHERE `proID`='1';";
		FileInputStream in = null;
		in = ImageUtil.readImage(path);
		
		
		// ������������ݿ�ľ������
		try{
				// �������ݿ�
				dbc = new DBConnect();
				pstmt = dbc.getConnection().prepareStatement(sql);
				pstmt.setString(1, username);
						
						
				// �������ݿ��ѯ����
				ResultSet rs = (ResultSet) pstmt.executeQuery();
				// ���Ϊfalse�����û�������
				if( rs.next() ){
					user.setAddress(rs.getString("address"));
					user.setEmail(rs.getString("email"));
					user.setPhone(rs.getString("phone"));					
								
				}
				
				pstmt = dbc.getConnection().prepareStatement(sql1);
				pstmt.setBinaryStream(1, in, in.available());
				pstmt.executeUpdate();
				
				rs.close();
				pstmt.close();
						
				}catch ( SQLException e) {
					System.out.println(e.getMessage());
					// TODO: handle exception
				}finally {
					// �ر����ݿ�����
					dbc.close();
					
				}
				/*// ����û�������û�����Tom��������123����ô�ñ�־flagΪ1.
				if( user.getUsername().equals("Tom") && user.getPassword().equals("123"))
				{
					flag = 1;
				}*/
				return user;
	}

}
