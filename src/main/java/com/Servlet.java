package com;

/**
 * Created by alexandr on 13.05.15.
 */
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)    throws ServletException, IOException {
        int value1;
        int value2;
        int total = 0;
        String name = (String) req.getParameter("name");
        String warning = "";

        try {
            value1 = Integer.parseInt((String) req.getParameter("value1"));
            value2 = Integer.parseInt((String) req.getParameter("value2"));
        } catch (NumberFormatException e) {
            value1 = 0;
            value2 = 0;
            warning = "We got some bad value(blank or non numerics values, we set 0 instead";
        }

        req.setAttribute("name", name);
        req.setAttribute("warning", warning);

        total = value1 + value2;

        req.setAttribute("total", total);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/show.jsp");

        requestDispatcher.forward(req, res);
    }
}
