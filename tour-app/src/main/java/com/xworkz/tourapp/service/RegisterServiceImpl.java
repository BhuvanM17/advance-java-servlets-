package com.xworkz.tourapp.service;

import com.xworkz.tourapp.dao.RegisterDao;
import com.xworkz.tourapp.dao.RegisterDaoImpl;
import com.xworkz.tourapp.dto.RegisterDto;

public class RegisterServiceImpl implements RegisterService{
    RegisterDao dao = new RegisterDaoImpl();
    @Override
    public boolean add(RegisterDto dto) {
        boolean isAdded=false;
        if(dto.getRegisterID()>0&&dto.getNumber()>0)
            isAdded=dao.add(dto);


    return isAdded;
    }
}
