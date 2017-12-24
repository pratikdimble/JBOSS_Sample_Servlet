
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloJBOSS extends HttpServlet {
	
private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
						throws ServletException, IOException {

		response.getWriter().println("<h1>Welcome To Eclipse_JBOSS[Wildfly] Server</h1>");

	}//doGet(-,-) close
}//class close