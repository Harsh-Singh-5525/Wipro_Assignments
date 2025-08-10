import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public FirstServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // Display the form
        out.println("<html><body>");
        out.println("<h2>Enter Name and Password</h2>");
        out.println("<form method='post' action='FirstServlet'>");
        out.println("Name: <input type='text' name='name' required><br><br>");
        out.println("Password: <input type='password' name='password' required><br><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("<input type='reset' value='Reset'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the parameters
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        // Store them in session
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("password", password);

        // Show confirmation and link to SecondServlet
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>Name and Password stored in SecondServlet!</h3>");
        out.println("<a href='SecondServlet'>Go to SecondServlet</a>");
        out.println("</body></html>");
    }

}
