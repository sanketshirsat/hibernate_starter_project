package com.bachelors.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Bachelor sanket = new Bachelor();
    	sanket.setBid(102);
    	sanket.setBname("Vanitaa");
    	sanket.setColor("Red");
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Bachelor.class);
    	
    	//ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	
    	SessionFactory sf = con.buildSessionFactory();
    	Session session =sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(sanket);
    	
    	tx.commit();
    	
    }
}
