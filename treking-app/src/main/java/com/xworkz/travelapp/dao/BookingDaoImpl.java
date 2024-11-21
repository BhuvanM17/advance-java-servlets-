package com.xworkz.travelapp.dao;

import com.xworkz.travelapp.dto.BookingDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookingDaoImpl implements BookingDao{
    @Override
    public boolean save(BookingDto dto) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(BookingDto.class);
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
