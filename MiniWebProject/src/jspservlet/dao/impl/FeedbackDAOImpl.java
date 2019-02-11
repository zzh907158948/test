package jspservlet.dao.impl;

import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import jspservlet.dao.FeedbackDAO;
import jspservlet.db.DBConnect;
import jspservlet.vo.Feedback;

public class FeedbackDAOImpl implements FeedbackDAO {
	public int insertfeedback(Feedback feedback) throws Exception{
		int flag=0;
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		String sql="INSERT INTO `javaproject`.`feedback` (`name`, `email`, `title`, `message`) VALUES (?, ?, ?, ?);";
		 // ������������ݿ�ľ������
		  try{
			
			dbc = new DBConnect();
			pstmt = (PreparedStatement) dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, feedback.getName());
			pstmt.setString(2,feedback.getEmail());
			pstmt.setString(3,feedback.getTitle());
			pstmt.setString(4,feedback.getMessage());
			pstmt.execute();
	         
	    	flag=1;
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
}
