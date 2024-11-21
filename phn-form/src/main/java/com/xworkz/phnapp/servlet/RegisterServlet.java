package com.xworkz.phnapp.servlet;

import com.xworkz.phnapp.dto.PhoneDto;
import com.xworkz.phnapp.service.PhoneService;
import com.xworkz.phnapp.service.PhoneServiceImpl;

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
      String value =  req.getParameter("number");
        PrintWriter printWriter = resp.getWriter();
        PhoneDto phoneDto = new PhoneDto();
        phoneDto.setPhoneId(1);
        phoneDto.setPhone(Long.parseLong(value));
        PhoneService phoneService=new PhoneServiceImpl();
        phoneService.save(phoneDto);

printWriter.write("Thank you, you have been  Registered with this  "+value +" number" );
    }
}
