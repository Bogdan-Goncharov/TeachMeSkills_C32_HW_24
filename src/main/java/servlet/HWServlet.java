package servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet({"/info" , "/tasks"})
public class HWServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        Logger.log("HWServlet init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        resp.setContentType("text/html");

        if (path.equals("/info")) {
            Logger.log("Accessed /info");
            resp.getWriter().println("<html><body>");
            resp.getWriter().println("<h2>Hello everyone and it is info about me</h2>");
            resp.getWriter().println("<h1>My name is Bogdan and I study at school</h1>");
            resp.getWriter().println("<h1>I 15 years old</h1>");
            resp.getWriter().println("<h1>My birthday is March 5th</h1>");
            resp.getWriter().println("<body><html>");


        } else if (path.equals("/tasks")) {
            Logger.log("Accessed /tasks");
            resp.getWriter().println("<html><body>");
            resp.getWriter().println("<h2>Here are all my plans for 2025:</h2>");
            resp.getWriter().println("<h1>Exercise regularly</h1>");
            resp.getWriter().println("<h1>Maintain a healthy diet</h1>");
            resp.getWriter().println("<h1>Learn a new hobby</h1>");
            resp.getWriter().println("<h1>Set career goals</h1>");
            resp.getWriter().println("<h1>Enhance skills through courses</h1>");
            resp.getWriter().println("<body><html>");

        }
    }

    @Override
    public void destroy() {
        Logger.log("HWServlet destroy");
    }
}
