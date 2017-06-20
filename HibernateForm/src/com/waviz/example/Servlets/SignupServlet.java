package com.waviz.example.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.waviz.example.Hibernate.SIgnupMain;





@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession();
		
		String userid=request.getParameter("uname");
		String email=request.getParameter("mail");
		String mobile=request.getParameter("mob");
		String password=request.getParameter("pass");
		String cpassword=request.getParameter("cpass");
		String address=request.getParameter("add");
		String hobbies=request.getParameter("hob");
		String gender=request.getParameter("gender");
		
		SIgnupMain signupMain=new SIgnupMain();
		
		
	int signupExecuteReturn=	signupMain.SignupExecute(userid, email, password, cpassword, address, hobbies, gender);
		
	if(signupExecuteReturn==1){
		 System.out.println("Send to Welcome Page");
			session.setAttribute("UserID", userid);
		   response.sendRedirect("welcome.jsp");
		}
		else{
			
			System.out.println("Send to Error Page");
			response.sendRedirect("Signup.jsp");
			
		}
		
	}
		
	}


