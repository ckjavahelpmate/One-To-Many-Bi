package com.onetomany.bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetSim {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;

		Sim sim = entityManager.find( Sim.class, 3 ) ;
		if(sim != null) {
			Mobile mobile = sim.getMobile() ;

			System.out.println( "Sim ID: "+sim.getId());
			System.out.println( "Sim Provider: "+sim.getProvider());
			System.out.println( "Sim Type: "+sim.getType());
			
			System.out.println("Mobile Name: "+ mobile.getName() );
			System.out.println("Mobile cost: "+ mobile.getCost() );
		}
		else {
			System.out.println("No sim found");
		}






	}

}
