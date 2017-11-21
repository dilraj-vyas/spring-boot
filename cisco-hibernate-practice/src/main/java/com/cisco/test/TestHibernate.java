package com.cisco.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cisco.dao.CurrentStudent;
import com.cisco.dao.Student;
import com.cisco.hibernate.AHibernateUtil;

public class TestHibernate {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = AHibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Student stu = new Student("Ankit", "Bangalore", "active", 20000);
			session.save(stu);

			CurrentStudent cStu = new CurrentStudent(20000, "6.30PM", "IT");
			session.save(cStu);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
