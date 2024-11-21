package com.xworkz.phnapp.service;

import com.xworkz.phnapp.dao.PhoneDao;
import com.xworkz.phnapp.dao.PhoneDaoImpl;
import com.xworkz.phnapp.dto.PhoneDto;

public class PhoneServiceImpl implements PhoneService{
PhoneDao phoneDao=new PhoneDaoImpl();

    @Override
    public boolean save(PhoneDto phoneDto) {
        boolean isSaved= false;
        if(phoneDto.getPhoneId()>0&&phoneDto.getPhone()>0){
          isSaved=  phoneDao.save(phoneDto);
        }

return isSaved;
    }
}
