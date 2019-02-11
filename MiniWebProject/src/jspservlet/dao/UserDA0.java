package jspservlet.dao;

import jspservlet.vo.User;

public interface UserDA0 {
	public int queryByUsername( User user ) throws Exception;
	public int insertByUsername( User user ) throws Exception;
	public int existByUsername( String s ) throws Exception;
	public User getByUsername(String s)throws Exception;
	public String queryUsername( String s ) throws Exception;
}
