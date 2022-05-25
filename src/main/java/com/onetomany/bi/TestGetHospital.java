package com.onetomany.bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetHospital {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		
		Hospital hospital = entityManager.find(Hospital.class, 1) ;
		
		if( hospital != null ) {
			List<Branch> branchs = hospital.getBranchs() ;
			
			System.out.println("Hospital Id: "+ hospital.getId());
			System.out.println("Hospital name: "+ hospital.getName());
			System.out.println("Hospital web: "+ hospital.getWeb());
			for(Branch branch : branchs) {
				System.out.println("Branch Id: "+ branch.getId());
				System.out.println("Branch name: "+ branch.getName());
				System.out.println("Branch state: "+ branch.getState());
				System.out.println("Branch country: "+ branch.getCountry());
				System.out.println("Branch phone: "+ branch.getPhone());
			}
			
		}
		else {
			System.out.println("No Hospital found for given Id");
		}
	}

}
