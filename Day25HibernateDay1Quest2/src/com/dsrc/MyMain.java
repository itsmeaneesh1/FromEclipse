package com.dsrc;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dsrc.bean.Employee;

public class MyMain {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setEmpno(100);
		e1.setName("Arka");
		e1.setCity("Chennai");
		new MyMain().saveEmployee(e1);
	}
	
	public void saveEmployee(Employee e1) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(e1);
		t.commit();
		s.close();
		sf.close();
		
	}

}
