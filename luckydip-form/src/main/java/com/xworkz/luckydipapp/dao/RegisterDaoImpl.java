package com.xworkz.luckydipapp.dao;

import com.xworkz.luckydipapp.dto.RegisterDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RegisterDaoImpl implements RegisterDao{
    @Override
    public boolean save(RegisterDto dto) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(RegisterDto.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(dto);
        session.getTransaction().commit();
        session.close();
        factory.close();
        return true;
    }
}
