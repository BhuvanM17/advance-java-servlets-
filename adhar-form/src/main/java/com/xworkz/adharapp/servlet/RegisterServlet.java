package com.xworkz.adharapp.servlet;

import com.xworkz.adharapp.dto.AdharDto;
import com.xworkz.adharapp.service.AdharService;
import com.xworkz.adharapp.service.AdharServiceImpl;

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
       String value = req.getParameter("adhar");
       PrintWriter printWriter =resp.getWriter();
        AdharDto adharDto=new AdharDto();
        adharDto.setAdharId(1);
        adharDto.setAdharNumber(Long.parseLong(value));
        AdharService adharService = new AdharServiceImpl();
        adharService.save(adharDto);



       printWriter.write("thank you "+value+" for registering");
    }
}
