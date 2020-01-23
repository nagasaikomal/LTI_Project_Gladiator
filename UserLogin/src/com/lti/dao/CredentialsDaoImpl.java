package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.lti.model.Credentials;
import com.lti.utils.JpaUtils;

public class CredentialsDaoImpl implements CredentialsDao {

	private EntityManager entityManager;
	
	public CredentialsDaoImpl() {
		entityManager=JpaUtils.getEntityManager();
	}



	@Override
	public int readPassenger(String username, String password) {
		
	 TypedQuery query=entityManager.createQuery("select c From Credentials c where c.username=:username", Credentials.class);
	 query.setParameter("username", username);

	 entityManager.getTransaction().begin();
	 Credentials cred= (Credentials)query.getSingleResult();
	 //List<Credentials> list=query.getResultList();
	 entityManager.getTransaction().commit();
	 String pass=cred.getPassword();
	 String user=cred.getUsername();
	  
	 if(user==username && pass==password){
		 return 1;
	 }
	 else{
		 return 0;
	}
 }
}
