package com.deshanpc.hibanate;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alson al=new Alson();
        Alion_name alion_name=new Alion_name();
        alion_name.setFname("Deshan");
        alion_name.setLname("Nawarathna");
        alion_name.setMname("Harshana");
        
        al.setAid(1);
        al.setColor("Blue");
        al.setAname(alion_name);
        Configuration con=new Configuration().configure().addAnnotatedClass(Alson.class);
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf=con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(al);
        tx.commit();
        System.out.print(al);
    }
}
