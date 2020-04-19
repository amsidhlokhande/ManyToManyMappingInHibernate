/**
 * 
 */
package com.amsidh.main.MainApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.amsidh.mvc.dtos.Address;
import com.amsidh.mvc.dtos.UserDetails;
import com.amsidh.mvc.dtos.Vechile;

/**
 * @author VIRU
 *
 */
public class HibernateApplication {
	public static final Logger logger = Logger.getLogger("HibernateApplication");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
      logger.info("SessionFactory created successfully");
     
      UserDetails userDetails1 = new UserDetails();
                  userDetails1.setUserName("amsidh.lokhande");
                  userDetails1.setDateOfBirth(new Date());
                  userDetails1.setAddress(new Address("Katepuram", "Pune", "Maharashtra", 411061L));
                  
      UserDetails userDetails2=new UserDetails();
			      userDetails2.setUserName("sanjay.lokhande");
			      userDetails2.setDateOfBirth(new Date());
			      userDetails2.setAddress(new Address("shiranal", "Bijapur", "Karnataka", 586119L));
	  List<UserDetails> userList=new ArrayList<UserDetails>();
	  userList.add(userDetails1);
	  userList.add(userDetails2);
	  
      Vechile vechile1=new Vechile();
      			vechile1.setUserDetails(userList);
      			vechile1.setVechileNumber("2018");
      			vechile1.setVechileType("Two Wheeler");
      			
      Vechile vechile2=new Vechile();
		        vechile2.setUserDetails(userList);
				vechile2.setVechileNumber("6546");
				vechile2.setVechileType("Two Wheeler");
	List<Vechile> vechileList=new ArrayList<Vechile>();
				  vechileList.add(vechile1);
				  vechileList.add(vechile2);
      
				  userDetails1.setVechiles(vechileList);
				  userDetails2.setVechiles(vechileList);
				  
      
      Session session=sessionFactory.openSession();
      session.beginTransaction();
      session.save(userDetails1);
      session.save(userDetails2);
      session.save(vechile1);
      session.save(vechile2);
      
      session.getTransaction().commit();
      session.close();
	}
	
}
