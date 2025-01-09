package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/")
public class MainPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h1>All pages:</h1>");
        resp.getWriter().println("<p><a href='/info'>Click to see my info</a></p>");
        resp.getWriter().println("<p><a href='/tasks'>Click to see my plans for 2025</a></p>");
        resp.getWriter().println("<p><a href='/count'>Click to see number of visits</a></p>");
        resp.getWriter().println("<p><a href='/reset'>Click to reset visit count</a></p>");
        resp.getWriter().println("<p><a href='/settings'>Click to see application info</a></p>");
        resp.getWriter().println("<body><html>");


    }
}
