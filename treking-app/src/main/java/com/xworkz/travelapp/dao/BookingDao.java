package com.xworkz.travelapp.dao;

import com.xworkz.travelapp.dto.BookingDto;

public interface BookingDao {
    boolean save(BookingDto dto);
}
