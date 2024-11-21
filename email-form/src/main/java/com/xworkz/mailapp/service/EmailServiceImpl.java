package com.xworkz.mailapp.service;

import com.xworkz.mailapp.dao.EmailDao;
import com.xworkz.mailapp.dao.EmailDaoImpl;
import com.xworkz.mailapp.dto.EmailDto;

public class EmailServiceImpl implements EmailService{
    EmailDao emailDao = new EmailDaoImpl();
    @Override
    public boolean add(EmailDto emailDto) {
       boolean isAdded = false;
       if(!emailDto.getEmail().isEmpty())
            isAdded= emailDao.add(emailDto);

    return isAdded;
    }
}
