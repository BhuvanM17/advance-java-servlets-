package com.xworkz.userapp.servlet;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.service.UserService;
import com.xworkz.userapp.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstname");
        String lastName = req.getParameter("lastname");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String gender = req.getParameter("gender");
        String age = req.getParameter("age");
        String country = req.getParameter("country");

        UserDto userDto = new UserDto();
        userDto.setUserId(2);
        userDto.setFirstName(firstName);
        userDto.setLastName(lastName);
        userDto.setPhone(Long.parseLong(phone));
        userDto.setEmail(email);
        userDto.setAddress(address);
        userDto.setGender(gender);
        userDto.setAge(Integer.parseInt(age));
        userDto.setCountry(country);
        UserService userService = new UserServiceImpl();
        userService.add(userDto);


        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<html>" +
                "<head>" +
                "<style>" +
                "body {" +
                "font-family: Arial, sans-serif;" +
                "background-color: #f0f8ff;" +
                "text-align: center;" +
                "margin: 0;" +
                "padding: 0;" +
                "}" +
                "h1 {" +
                "color: #4CAF50;" +
                "font-size: 36px;" +
                "margin-top: 100px;" +
                "}" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<h1>macha nind registration aythu  &#128511 </h1>" +
                "</body>" +
                "</html>");



    }
}
