

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigDemo
 */
@WebServlet("/ServletConfigDemo")
public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletConfigDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("driver");
		System.out.println(name);
		PrintWriter out = response.getWriter();
		//out.print(name);
		out.println();
		
		Enumeration<String> e = config.getInitParameterNames();
		String str = "";
		while(e.hasMoreElements()) {
			str = e.nextElement();
			out.print(str + " ");
			out.println(config.getInitParameter(str));
			out.println("</br>");
		}
	}

}
