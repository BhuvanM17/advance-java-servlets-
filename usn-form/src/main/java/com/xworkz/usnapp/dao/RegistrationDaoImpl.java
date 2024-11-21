package com.xworkz.usnapp.dao;

import com.xworkz.usnapp.dto.RegistrationDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RegistrationDaoImpl implements RegistrationDao{
    @Override
    public boolean save(RegistrationDto dto) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(RegistrationDto.class);
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
