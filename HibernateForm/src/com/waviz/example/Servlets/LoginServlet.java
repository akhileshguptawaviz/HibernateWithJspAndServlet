package com.waviz.example.Servlets;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.waviz.example.Hibernate.Main;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String userid = request.getParameter("uname");
	    String email= request.getParameter("mail");
	    String password=request.getParameter("pass");
	    
	    
	    Main main= new Main();
	    int   StoreExexute=main.execute(userid, password, email);
	    
	    
	    
	    if(StoreExexute==1){
	 	   System.out.println("Send to Welcome Page");
	 		
	 	   response.sendRedirect("welcome.jsp");
	 	}
	 	else{
	 		System.out.println("Wrong PassWord or UserId Or Email Enter");
	 		  
	 		
	 		response.sendRedirect("Login.jsp");
	 		
	 	}
	 	
	 		

	}

}
