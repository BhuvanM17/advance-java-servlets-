package com.xworkz.registerapp.dao;

import com.xworkz.registerapp.dto.LaptopDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LaptopDaoImpl implements LaptopDao{
    @Override
    public boolean add(LaptopDto dto) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(LaptopDto.class);
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
