package com.example.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Welcome extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2> Welcome to the second page </h2>");
        String name = req.getParameter("name");
        out.println("<h1>");
        out.println(name);
        out.println("</h1>");
        out.println("<h1> <a href='CookiePage'> Go to next Page </a></h1>");
        Cookie c = new Cookie("name",req.getParameter("name"));
       resp.addCookie(c);
    }
}
