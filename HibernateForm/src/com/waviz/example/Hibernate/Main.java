package com.waviz.example.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.waviz.example.Hibernate.Login;




public class Main {

	public int execute(String userId, String password, String email) {
		
		Login login=new Login();
	//	login.setUserId(userId);
	//	login.setEmail(email);
	//	login.setPassword(password);
		Signup signup = new Signup();
		
		
		
		
		
		SessionFactory sessionfactorey=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactorey.openSession();
		session.beginTransaction();
		
		signup=session.get(Signup.class,userId);
		
		//session.save(login);
		//session.getTransaction().commit();
		
		
		try {
			System.out.println(signup.getEmail()+""+signup.getPassword()+""+signup.getPassword());
			
			if((signup.getUserId().equals(userId))&&(signup.getPassword().equals(password))&&(login.getEmail().equals(email))){
				
				return 1;
			}
			
		} finally {
			session.getTransaction().commit();
			session.close();
			sessionfactorey.close();
			
			// TODO: handle finally clause
		}
		
		
		
		
		return 1;
		
		
	}

}
