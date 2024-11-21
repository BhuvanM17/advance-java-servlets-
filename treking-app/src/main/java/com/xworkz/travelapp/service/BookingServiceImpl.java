package com.xworkz.travelapp.service;

import com.xworkz.travelapp.dao.BookingDao;
import com.xworkz.travelapp.dao.BookingDaoImpl;
import com.xworkz.travelapp.dto.BookingDto;

public class BookingServiceImpl implements BookingService{
    BookingDao dao = new BookingDaoImpl();
    @Override
    public boolean save(BookingDto dto) {
        boolean isSaved=false;
        if(dto.getBookingId()>0&&!dto.getEmail().isEmpty()){
           isSaved= dao.save(dto);
        }

        return isSaved;
    }
}
