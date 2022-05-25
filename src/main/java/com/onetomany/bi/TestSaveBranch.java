package com.onetomany.bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveBranch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Hospital hospital = new Hospital() ;
		hospital.setName("APPOLO");
		hospital.setWeb("www.jaasthiduddumaga.com");
		
		Branch branch1 = new Branch() ;
		branch1.setName("BR-APPOLO");
		branch1.setState("Karnataka");
		branch1.setCountry("India");
		branch1.setPhone(223344);
		
		Branch branch2 = new Branch() ;
		branch2.setName("TN-APPOLO");
		branch2.setState("Tamilnadu");
		branch2.setCountry("India");
		branch2.setPhone(100200300);
		
		Branch branch3 = new Branch() ;
		branch3.setName("US-APPOLO");
		branch3.setState("Washinton");
		branch3.setCountry("US");
		branch3.setPhone(885522);
		
//		List<Branch> branchs = new ArrayList<Branch>() ;
//		branchs.add(branch1) ;
//		branchs.add(branch2) ;
//		branchs.add(branch3) ;
		
		
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		branch3.setHospital(hospital);
//		hospital.setBranchs(branchs);
		
		entityTransaction.begin();
		
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityManager.persist(hospital);
		
		entityTransaction.commit();
		

	}

}
