import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/App1")
public class App1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String pId = request.getParameter("p_Id");
		String pName = request.getParameter("p_name");
		String pPrice = request.getParameter("p_price");
		
		HttpSession theSession = request.getSession();
		
		theSession.setAttribute("p_id", pId);
		theSession.setAttribute("p_name", pName);
		theSession.setAttribute("p_price", pPrice);
		
		response.sendRedirect("display.jsp");
		
		
	}

}

