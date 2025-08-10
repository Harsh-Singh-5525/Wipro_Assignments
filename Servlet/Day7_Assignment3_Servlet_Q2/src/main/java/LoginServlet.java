

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Optional: Just redirect to login page or show a message
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the username and password from request
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        if ("admin".equals(user) && "wipro".equals(pass)) {
            // If credentials match, forward to SuccessServlet
            RequestDispatcher rd = request.getRequestDispatcher("SuccessServlet");
            rd.forward(request, response);
        } else {
            // Else, forward to Fail.html
            RequestDispatcher rd = request.getRequestDispatcher("Fail.html");
            rd.forward(request, response);
        }
    }
}
