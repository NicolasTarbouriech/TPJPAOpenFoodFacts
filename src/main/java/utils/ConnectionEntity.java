package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionEntity {

	public static EntityManager getConnexionEntity() {
		
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("connexion");
	
	EntityManager em = factory.createEntityManager();
	
	return em;
	
	}
}
