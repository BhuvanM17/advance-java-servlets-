package com.xworkz.phnapp.dao;

import com.xworkz.phnapp.dto.PhoneDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PhoneDaoImpl implements PhoneDao{

    @Override
    public boolean save(PhoneDto phoneDto) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(PhoneDto.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(phoneDto);
        session.getTransaction().commit();
        session.close();
        factory.close();



        return true;
    }
}
