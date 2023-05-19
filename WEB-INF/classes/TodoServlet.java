import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.*;

import models.Todos;

public class TodoServlet extends HttpServlet {
    final static Todos todos = new Todos();

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            String todo = req.getParameter("todo");
            System.out.println("adding todo: " + todo);
            todos.add(todo);
            res.sendRedirect("/demo/todos.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            todos.clear();
            res.sendRedirect("/demo/todos.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
