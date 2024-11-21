package com.xworkz.luckydipapp.service;

import com.xworkz.luckydipapp.dao.RegisterDao;
import com.xworkz.luckydipapp.dao.RegisterDaoImpl;
import com.xworkz.luckydipapp.dto.RegisterDto;

public class RegisterServiceImpl implements RegisterService {
   RegisterDao dao = new RegisterDaoImpl();
    @Override
    public boolean save(RegisterDto dto) {
        boolean isSaved = false;
        if(dto.getRegisterId()>0&&dto.getPhone()>0){
         isSaved=   dao.save(dto);
        }

        return isSaved;
    }
}
