package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


@WebServlet(name = "Translate" , urlPatterns = "/translate")
public class Translate extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

        String search = req.getParameter("txtSearch");
        PrintWriter wr = resp.getWriter();
        wr.println("<html>");

        String result = dictionary.get(search);
        if (result != null){
            wr.println("Word: " + search);
            wr.println("Result: " + result);
        }else {
            wr.println("Not found");
        }
        wr.println("</html>");


    }
}
