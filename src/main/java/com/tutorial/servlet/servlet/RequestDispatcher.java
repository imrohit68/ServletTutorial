package com.tutorial.servlet.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class RequestDispatcher extends HelloServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/Html");
        PrintWriter out = response.getWriter();
        jakarta.servlet.RequestDispatcher dispatch = request.getRequestDispatcher("index.jsp");

        try {
            dispatch.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
}
