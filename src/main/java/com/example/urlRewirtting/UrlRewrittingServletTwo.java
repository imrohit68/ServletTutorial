package com.example.urlRewirtting;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class UrlRewrittingServletTwo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Your name is: ");
        out.println(req.getParameter("user_name"));
        out.println("<a href='urlSession?user="+req.getParameter("user_name")+"'> Go to next page </a>");
    }
}
