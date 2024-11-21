package com.xworkz.travelapp.servlet;

import com.xworkz.travelapp.dto.BookingDto;
import com.xworkz.travelapp.service.BookingService;
import com.xworkz.travelapp.service.BookingServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/booking")
public class BookingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = req.getParameter("email");

        BookingDto dto = new BookingDto(1,value);
        BookingService service = new BookingServiceImpl();
        service.save(dto);

        PrintWriter printWriter =resp.getWriter();

        printWriter.write("Thank you  " +value +" for registering");
    }
}
