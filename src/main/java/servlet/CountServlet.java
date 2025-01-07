package servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/count")
public class CountServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        Logger.log("CountServlet init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    HttpSession session = req.getSession(true);
         Integer visitCount = (Integer) session.getAttribute("visitCount"); if (visitCount == null) {
             visitCount = 0;  }
        visitCount++;
         session.setAttribute("visitCount", visitCount);
         resp.setContentType("text/html");
         resp.getWriter().println("<html><body>");
         resp.getWriter().println("<h2>Visit Count</h2>");
         resp.getWriter().println("<p>This page has been visited " + visitCount + " times in this session.</p>");
        resp.getWriter().println("<p><a href='/reset'>If you want to reset counter go to reset page</a></p>");
         resp.getWriter().println("</body></html>");

    }

    @Override
    public void destroy() {
        Logger.log("CountServlet destroy");
    }
}




