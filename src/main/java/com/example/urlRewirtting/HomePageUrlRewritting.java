package com.example.urlRewirtting;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HomePageUrlRewritting extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Form</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container\">\n" +
                "    <h1>Enter Your Details</h1>\n" +
                "    <form id=\"myForm\" action=\"UrlRewrittingServletTwo\" method=\"post\">\n" +
                "        <table>\n" +
                "            <td>Enter your Name: </td>\n" +
                "            <td><input type=\"text\" name=\"user_name\" placeholder=\"Your Name\"></td>\n<td><button type=\"submit\">Submit</button></td>\n" +
                "        </table>\n" +
                "    </form>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
    }
}
