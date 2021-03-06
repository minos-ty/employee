package com.minos.employee;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();
        if (context.getAttribute("employee") == null) {
            List list = new ArrayList();

            list.add(new Employee(7731, "刘志明", "市场部", "客户代表", 10000f));
            list.add(new Employee(8871, "张倩", "研发部", "运维工程师", 8000f));
            context.setAttribute("employees", list);
        }

        req.getRequestDispatcher("/employee.jsp").forward(req,resp);
    }
}
