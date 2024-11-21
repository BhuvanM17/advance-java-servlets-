package com.xworkz.adharapp.service;

import com.xworkz.adharapp.dao.AdharDao;
import com.xworkz.adharapp.dao.AdharDaoImpl;
import com.xworkz.adharapp.dto.AdharDto;

public class AdharServiceImpl implements AdharService{
   AdharDao adharDao = new AdharDaoImpl();
    @Override
    public boolean save(AdharDto adharDto) {
        boolean isSaved=false;
        if(adharDto.getAdharId()>0&&adharDto.getAdharNumber()>0)
            isSaved=adharDao.save(adharDto);

    return isSaved;
    }
}
