package servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/reset")
public class ResetServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        Logger.log("ResetServlet init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("visitCount", 0);

        resp.setContentType("text/html");
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h1>Visit Count Reset</h1>");
        resp.getWriter().println("<p>Visit count has been reset.</p>");
        resp.getWriter().println("<p><a href='/count'>Go to count page</a></p>");
        resp.getWriter().println("<body><html>");
    }

    @Override
    public void destroy() {
        Logger.log("ResetServlet destroy");
    }
}

