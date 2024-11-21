package com.xworkz.userapp.service;

import com.xworkz.userapp.dao.UserDao;
import com.xworkz.userapp.dao.UserDaoImpl;
import com.xworkz.userapp.dto.UserDto;

public class UserServiceImpl implements UserService{
    UserDao userDao =new UserDaoImpl();
    @Override
    public boolean add(UserDto userDto) {
        boolean isAdded=false;
        if(userDto.getUserId()>0&&!userDto.getFirstName().isEmpty()){

        isAdded=    userDao.add(userDto);
        }
        return isAdded;
    }
}
