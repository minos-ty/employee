package com.minos.employee;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/create")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("utf-8");
        String empNo = req.getParameter("empNo");
        String eName = req.getParameter("eName");
        String department = req.getParameter("department");
        String job = req.getParameter("job");
        String salary = req.getParameter("salary");
        System.out.println(empNo);

        Employee emp = new Employee(Integer.parseInt(empNo), eName, department, job, Float.parseFloat(salary));
        ServletContext context = req.getServletContext();
        List employees =(List) context.getAttribute("employees");
        employees.add(emp);
        
        context.setAttribute("employees",employees);
        req.getRequestDispatcher("/employee.jsp").forward(req,resp);

    }
}
