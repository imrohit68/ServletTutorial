package com.tutorial.servlet.servlet;

import com.example.registration.Student;
import com.example.registration.StudentDB;
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
        out.println("<h1>Your form with : </h1>");

        Student s1 = new Student(req.getParameter("user_name"),req.getParameter("phone_number"),req.getParameter("user_city"));
        StudentDB.insertData(s1);
        out.println("<h1> Name : "+s1.getStudentName());
        out.println("Phone : "+s1.getStudentPhone());
        out.println("City: "+s1.getGetStudentCity());
        out.println("has been registred</h1>");
    }
}
