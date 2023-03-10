package com.example.HiddenFormField;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HiddenFormFieldSecond extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("user_name");
        out.println("" +
                "<form action='HiddenFormFieldThird'>" +
                "<input type='hidden' name='user_name' value='"+name+"'>" +
                "<button> Go to last servlet</button>" +
                "</form>" +
                "");
    }
}
