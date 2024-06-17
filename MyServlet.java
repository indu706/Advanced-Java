import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Retrieve an attribute from the ServletContext
        String myAttribute = (String) getServletContext().getAttribute("myAttribute");
        if (myAttribute!= null) {
            resp.getWriter().write("Attribute found: " + myAttribute);
        } else {
            resp.getWriter().write("Attribute not found.");
        }

        // Set an attribute in the ServletContext
        getServletContext().setAttribute("myAttribute", "Hello, World!");
    }
}
