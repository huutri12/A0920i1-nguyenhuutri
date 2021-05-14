package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Convert", urlPatterns = "/convert")
public class Convert extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float rate = Float.parseFloat(req.getParameter("rate"));
        float usd = Float.parseFloat(req.getParameter("usd"));

        float vnd = rate * usd;

        PrintWriter pr = resp.getWriter();
        pr.println("<html>");
        pr.println("<h1>Rate: " + rate + "</h1>");
        pr.println("<h1>USD: "+usd + "</h1>");
        pr.println("<h2>VND: "+ vnd + "</h1>");
        pr.println("</html>");
    }
}
