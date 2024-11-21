package com.xworkz.usnapp.service;

import com.xworkz.usnapp.dao.RegistrationDao;
import com.xworkz.usnapp.dao.RegistrationDaoImpl;
import com.xworkz.usnapp.dto.RegistrationDto;

public class RegistrationServiceImpl implements RegistrationService{
   RegistrationDao dao = new RegistrationDaoImpl();
    @Override
    public boolean save(RegistrationDto registrationDto) {
        boolean isSaved=false;
        if(registrationDto.getUsnId()>0&&!registrationDto.getUsn().isEmpty())
           isSaved= dao.save(registrationDto);




        return isSaved;
    }
}
