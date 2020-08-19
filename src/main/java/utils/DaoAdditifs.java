package utils;


import java.util.Arrays;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Additif;

public class DaoAdditifs {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connexion");
	
	public void insertAdditif(Additif additif, String morceaux) {
		
		EntityManager em = factory.createEntityManager();
		
		
			
		if (em != null) {
			List<String> additifs = Arrays.asList(morceaux.split(",", -1));

			for (String nomAdditifs : additifs) {

				additif.setNom(nomAdditifs);
				
			}
			
			em.getTransaction().begin();
			
			em.persist(additif);
			
			em.getTransaction().commit();
		}
		
	}
}

