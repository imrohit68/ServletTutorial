package com.example.cookie;

import com.tutorial.servlet.servlet.HelloServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class CookiePage extends HelloServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Cookie[] cookies  = request.getCookies();
        String name = "";
        if(cookies==null){
            out.println("<h2>You are a new user please visit the home page</h2>");
            return;
        }
        else
        {
            for (Cookie c : cookies) {
                String s = c.getName();
                if (s.equals("name")) {
                    name = c.getValue();
                }
            }
        }
        if(name!=""){
            out.println("<h1> Hello your name retrieved form Cookie is:"+name);
            out.println("</h1>");
        }
        else{
            out.println("<h2> Name Cookie not found. </h2>");
        }
    }
    }
