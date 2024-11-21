package com.xworkz.registerapp.service;

import com.xworkz.registerapp.dao.RegisterDaoImpl;
import com.xworkz.registerapp.dto.RegisterDto;

public class RegisterServiceImpl implements RegisterService{
    @Override
    public boolean add(RegisterDto dto) {
        boolean isAdded=false;
        if(dto.getId()>0&&!dto.getEmail().isEmpty())
         isAdded =   new RegisterDaoImpl().add(dto);



        return isAdded;
    }
}
