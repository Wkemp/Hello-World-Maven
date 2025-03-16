package com.example;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


         
public class HelloWorldExample extends HttpServlet {
         private static final long serialVersionUID = 1L;

         @Override
         protected void doGet(HttpServletRequest request, HttpServletResponse response)
                           throws ServletException, IOException {
                  response.setContentType("text/html");
                  response.setCharacterEncoding("UTF-8");
                  response.getWriter().println("<h1>Hello World!!!!</h1>");
                           }
}
