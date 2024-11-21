package com.xworkz.mailapp.dao;

import com.xworkz.mailapp.dto.EmailDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmailDaoImpl implements EmailDao{
    @Override
    public boolean add(EmailDto emailDto) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(EmailDto.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(emailDto);
        session.getTransaction().commit();
        session.close();
        factory.close();
        return true;
    }
}
