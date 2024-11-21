package com.xworkz.registerapp.servlet;

import com.xworkz.registerapp.dto.LaptopDto;
import com.xworkz.registerapp.service.LaptopService;
import com.xworkz.registerapp.service.LaptopServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/name")
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String value= req.getParameter("name");
       PrintWriter printWriter =resp.getWriter();
        LaptopDto laptopDto = new LaptopDto(1,value);
        LaptopService service = new LaptopServiceImpl();
        service.add(laptopDto);
       printWriter.write("thank you "+value+" for registering");
    }
}
