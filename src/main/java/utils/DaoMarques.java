package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Marque;

public class DaoMarques {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connexion");
	
	public void insertMarques(Marque marques, String morceaux) {
		EntityManager em = factory.createEntityManager();
		
		if(em!= null) {
			marques.setNom(morceaux);
			
		}
		em.getTransaction();
		
		em.persist(marques);
		
		em.getTransaction().commit();
		
		// em.close();
		// factory.close();
	}
	
}
