package com.xworkz.mailapp.dao;

import com.xworkz.mailapp.dto.EmailDto;

public interface EmailDao {
    boolean add(EmailDto emailDto);
}
