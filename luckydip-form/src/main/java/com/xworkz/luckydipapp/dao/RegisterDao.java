package com.xworkz.luckydipapp.dao;

import com.xworkz.luckydipapp.dto.RegisterDto;

public interface RegisterDao {
    boolean save(RegisterDto dto);
}
