import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public SecondServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false); // Don't create
        out.println("<html><body>");
        if (session != null) {
            String name = (String) session.getAttribute("name");
            String password = (String) session.getAttribute("password");
            if (name != null && password != null) {
                out.println("<h2>Values from First Servlet:</h2>");
                out.println("<p>Name: " + name + "</p>");
                out.println("<p>Password: " + password + "</p>");
            } else {
                out.println("<h2>No Data found in First Servlet.</h2>");
            }
        } else {
            out.println("<h2>No active Servlet!</h2>");
        }
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
