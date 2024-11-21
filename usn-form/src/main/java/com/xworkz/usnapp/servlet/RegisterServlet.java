package com.xworkz.usnapp.servlet;

import com.xworkz.usnapp.dto.RegistrationDto;
import com.xworkz.usnapp.service.RegistrationService;
import com.xworkz.usnapp.service.RegistrationServiceImpl;

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
      String value =  req.getParameter("usn");
      PrintWriter printWriter =resp.getWriter();
        RegistrationDto dto=new RegistrationDto();
        dto.setUsnId(1);
        dto.setUsn(value);
        RegistrationService service = new RegistrationServiceImpl();
        service.save(dto);

      printWriter.write("thank you "+value+" for registering");
    }
}
