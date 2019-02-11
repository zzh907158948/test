package jspservlet.dao;

import jspservlet.vo.Feedback;
import jspservlet.vo.User;

public interface FeedbackDAO {
	public int insertfeedback(Feedback feedback) throws Exception;
}
