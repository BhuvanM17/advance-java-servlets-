package com.xworkz.registerapp.servlet;

import com.xworkz.registerapp.dto.RegisterDto;
import com.xworkz.registerapp.service.RegisterService;
import com.xworkz.registerapp.service.RegisterServiceImpl;

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
        String email = req.getParameter("email");
        RegisterDto dto = new RegisterDto(1,email);
        RegisterService service = new RegisterServiceImpl();
        service.add(dto);

        resp.setContentType("text/html");
        resp.getWriter().write(
                "<html>" +
                        "<head>" +
                        "<script>" +
                        "alert('Thank you " + email + " for registering!');" +
                        "</script>" +
                        "</head>" +
                        "<body>" +
                        "<h1>Thank you for registering, " + email + "!</h1>" +
                        "</body>" +
                        "</html>"
        );}
}
