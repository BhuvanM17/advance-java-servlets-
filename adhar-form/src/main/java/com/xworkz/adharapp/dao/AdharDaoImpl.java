package com.xworkz.adharapp.dao;

import com.xworkz.adharapp.dto.AdharDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AdharDaoImpl implements AdharDao{
    @Override
    public boolean save(AdharDto adharDto) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(AdharDto.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(adharDto);
        session.getTransaction().commit();
        session.close();
        factory.close();
        return true;
    }
}
