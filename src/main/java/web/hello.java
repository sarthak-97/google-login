package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrain.userdet;

/**
 * Servlet implementation class hello
 */
public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());


		// TODO Auto-generated method stub
		
		String a,b,c,d;
		
		a=request.getParameter("user_id");
		b=request.getParameter("user_email");
		c=request.getParameter("user_img");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();        		
	     
	      Session session =	sessionFactory.openSession();
	      session.beginTransaction();	
	      Query queryResult = session.createQuery("from userdet");
	       java.util.List allUsers;
	       String pa,na;
	       
	       allUsers = queryResult.list();
	       int f;
	       f=0;
	       for (int i = 0; i < allUsers.size(); i++) {
	        userdet user = (userdet) allUsers.get(i);
	        pa=user.getEmailid();
	        na=user.getName();
	        if(b.equals(pa)){
	         f=1;
	         break; 
	         }
	        }
	         
	           if(f!=1){
	        	   
	        	   
	        userdet user= new userdet();  
	      user.setName(a);
	      user.setEmailid(b);
	      user.setAvatar(c);
	      session.save(user);
	      session.getTransaction().commit();
	      session.close();
	      user=null;
	       System.out.println(a);
	}
	           else
	           {   System.out.println("duplicate");
	                response.sendRedirect("dash.jsp");
	         
	           }
	}

}
