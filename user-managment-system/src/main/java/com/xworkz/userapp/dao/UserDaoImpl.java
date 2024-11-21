package com.xworkz.userapp.dao;

import com.xworkz.userapp.dto.UserDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserDaoImpl implements UserDao{
    @Override
    public boolean add(UserDto userDto) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(UserDto.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(userDto);
        session.getTransaction().commit();
        session.close();
        factory.close();

        return true;
    }
}
