import java.io.*;
 
import jakarta.servlet.http.*;
import jakarta.servlet.*;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("hello there!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
