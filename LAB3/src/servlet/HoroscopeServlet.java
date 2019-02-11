package servlet;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;





public class HoroscopeServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		
		String name = req.getParameter("name");
		String sex = req.getParameter("sex");
		int Zodiac = Integer.parseInt( req.getParameter("Zodiac") );
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		/*if( name != null )
		{
			out.println( "<html><body>Hello " + name +"<br>");
			if( sex.equals("male"))
			{
				if( Zodiac <= 6 )
					out.println("You will have a long life.");
				else
					out.println("You will have a rich life.");
			}
			else if( sex.equals("female"))
			{
				if( Zodiac <= 6 )
					out.println("You will find a tall handsome stranger.");
				else
					out.println("You will have six children.");
			}
		}
		else{
			out.println("Please identify yourself (by indicating your name), "
					+ "so that your horoscope can be given!");
		}*/
		out.println("<html><head><script type=\"text/javascript\">");
		out.println("function displayHoroscope(gender, sign){ "
					+ "if( gender == \"male\"){ "
						+ "if(sign <= 6){ "
							+"document.getElementById(\"content\").innerHTML = \"You will have a long life.\"; }"
						+"else{ "
							+ "document.getElementById(\"content\").innerHTML = \"You will have a rich life.\"; }"    	
					+" }else{ "
						+ "if(sign <= 6){ "
							+ "document.getElementById(\"content\").innerHTML = \"You will find a tall handsome stranger.\";} "
						+"else{ "
							+ "document.getElementById(\"content\").innerHTML = \"You will have six children.\";} "
					+ " }"
					+" }");
	
    	out.println("</script></head><body>Hello " + name +"<br>");
    	
		out.println("<div id=\"content\">1</div>");
		out.println("<script type=\"text/javascript\">  displayHoroscope( \"" + sex + "\"," + Zodiac +" ); </script>");
		out.println("</body></html>");
		out.close();
	}
}