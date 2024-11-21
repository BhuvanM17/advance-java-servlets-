package com.xworkz.mailapp.servlet;

import com.xworkz.mailapp.dto.EmailDto;
import com.xworkz.mailapp.service.EmailService;
import com.xworkz.mailapp.service.EmailServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String value =  req.getParameter("email");
        PrintWriter printWriter = resp.getWriter();
        EmailDto emailDto = new EmailDto();
        emailDto.setEmail(value);
        EmailService emailService = new EmailServiceImpl();
        emailService.add(emailDto);
        printWriter.write("Thank you "+ value+" for registering!!");

    }
}
