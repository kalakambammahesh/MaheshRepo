

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextDemo
 */
@WebServlet("/ServletContextDemo")
public class ServletContextDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletContextDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		//ServletContext object;
		ServletContext application = getServletContext();
//		
//		String s = application.getInitParameter("driver");
//		
//		out.println(s);
		
	//multiple context-param
		Enumeration<String> e = application.getInitParameterNames();
		String str = "";
		while(e.hasMoreElements()) {
			str = e.nextElement();
			out.println("Name: " + str);
			out.print(" Value: " + application.getInitParameter(str));
			out.println("</br>");
		}
	}

	
	

}
