

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String userName = req.getParameter("name");
		String password = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		if(password.equals("mahesh")) {
			RequestDispatcher rd = req.getRequestDispatcher("WelCome");
			rd.forward(req, res);
		}else {
			out.println("Sorry UserName or Password is Wrong....");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		String userName = req.getParameter("name");
//		String password = req.getParameter("password");
//		
//		PrintWriter out = res.getWriter();
//		res.setContentType("text/html");
//		
//		if(password.equals("mahesh")) {
//			RequestDispatcher rd = req.getRequestDispatcher("WelCome");
//			rd.forward(req, res);
//		}else {
//			out.println("Sorry UserName or Password is Wrong....");
//			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
//			rd.include(req, res);
//		}
	}
	

}
