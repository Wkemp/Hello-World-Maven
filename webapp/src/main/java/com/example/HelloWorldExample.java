package com.example;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello") // Annotation-based mapping
         
public class HelloWorldExample extends HttpServlet {
         private static final long serialVersionUID = 1L;

         @Override
         protected void doGet(HttpServletRequest request, HttpServletResponse response)
                           throws ServletException, IOException {
                  response.setContentType("text/html");
                  response.setCharacterEncoding("UTF-8");

                  // Get User input from query parameter
                 String name = request.getParameter("name");
                 if (name == null || name.trim().isEmpty()) {
                     name = "Guest"; // Default if no input
                 }

                 response.getWriter().println("<h1>Hello, " + name + ", this is a Java servlet test!</h1>");
         }
}
