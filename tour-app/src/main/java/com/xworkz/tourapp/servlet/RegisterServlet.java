package com.xworkz.tourapp.servlet;

import com.xworkz.tourapp.dto.RegisterDto;
import com.xworkz.tourapp.service.RegisterService;
import com.xworkz.tourapp.service.RegisterServiceImpl;

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
               String value= req.getParameter("number");
        RegisterDto dto = new RegisterDto(1,Long.parseLong(value));
        RegisterService service = new RegisterServiceImpl();
        service.add(dto);
               PrintWriter printWriter =resp.getWriter();
               printWriter.write("thank you "+value+" for registering");

    }
}
