package com.tutorial.servlet.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> this is registration from</h1>");

        String name = req.getParameter("user_name");
        String phone = req.getParameter("phone_number");
        String city = req.getParameter("user_city");

       out.println(name);
       out.println(phone);
       out.println(city);
    }
}
