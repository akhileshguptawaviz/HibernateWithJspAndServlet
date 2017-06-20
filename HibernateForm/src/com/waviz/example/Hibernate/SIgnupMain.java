package com.waviz.example.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SIgnupMain {


public int SignupExecute(String userid, String email, String password, String cpassword, String address, String hobbies,
		String gender) {	
		Signup signup=new Signup();
		signup.setUserId(userid);
		signup.setEmail(email);
		signup.setPassword(password);
		signup.setCpassword(cpassword);
	    signup.setAddress(address);
	    signup.setHobbies(hobbies);

	    signup.setGender(gender);
		
		SessionFactory sessionfactorey=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactorey.openSession();
		session.beginTransaction();
		session.save(signup);
		session.getTransaction().commit();
		
		
		
		
		
		return 1;
		
		
	}
}


