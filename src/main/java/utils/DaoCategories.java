package utils;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Categorie;

public class DaoCategories {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connexion");

	public void insertCategories(Categorie categorie, String morceaux) {
		EntityManager em = factory.createEntityManager();

		if (em != null) {
			categorie.setNom(morceaux);

		}

		em.getTransaction();

		em.persist(categorie);

		em.getTransaction().commit();

		// em.close();
		// factory.close();
	}

}
