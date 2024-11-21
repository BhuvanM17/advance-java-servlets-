package com.xworkz.luckydipapp.servlet;

import com.xworkz.luckydipapp.dto.RegisterDto;
import com.xworkz.luckydipapp.service.RegisterService;
import com.xworkz.luckydipapp.service.RegisterServiceImpl;

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
        String value = req.getParameter("phone");
        PrintWriter printWriter = resp.getWriter();
        RegisterDto dto = new RegisterDto(1,Long.parseLong(value));
        RegisterService service = new RegisterServiceImpl();
        service.save(dto);
        printWriter.write("thank you for participating\n");
        printWriter.write(value+" has been registered \nGood luck!!");

    }
}
