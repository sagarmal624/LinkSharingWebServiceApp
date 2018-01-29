package com.yakkaytech.linkSharing.repository.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class BaseRepositoryImpl implements BaseRepository {

    @Autowired
    SessionFactory sessionFactory;


    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    private Class clazz;



    @Override
    public Object get(Integer id) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        transaction.begin();
        Object Object=getSession().get(this.clazz,id);
        transaction.commit();
        return Object;
    }



    @Override
    public Object save(Object object) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        transaction.begin();
        Serializable serializable = session.save(object);
        transaction.commit();
        return serializable;
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
