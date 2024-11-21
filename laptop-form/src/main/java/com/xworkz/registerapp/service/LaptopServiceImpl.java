package com.xworkz.registerapp.service;

import com.xworkz.registerapp.dao.LaptopDao;
import com.xworkz.registerapp.dao.LaptopDaoImpl;
import com.xworkz.registerapp.dto.LaptopDto;

public class LaptopServiceImpl implements LaptopService{
   LaptopDao laptopDao = new LaptopDaoImpl();
    @Override
    public boolean add(LaptopDto dto) {
        boolean isAdded=false;
        if(dto.getLaptopId()>0&&!dto.getLaptop().isEmpty())
            isAdded=    laptopDao.add(dto);


        return isAdded;
    }
}
