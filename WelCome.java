

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelCome
 */
@WebServlet("/WelCome")
public class WelCome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelCome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		String name = req.getParameter("name");
		out.println("WelCome ..." + name);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		PrintWriter out = res.getWriter();
//		res.setContentType("text/html");
//		String name = req.getParameter("name");
//		out.println("WelCome ..." + name);
	}

}
