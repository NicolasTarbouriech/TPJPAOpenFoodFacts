package utils;


import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Allergene;

public class DaoAllergenes {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connexion");

	public void insertAllergene(Allergene allergene, String morceaux) {

		EntityManager em = factory.createEntityManager();

		if (em != null) {
			List<String> allergenes = Arrays.asList(morceaux.split(",", -1));

			for (String nomAllergenes : allergenes) {

				allergene.setNom(nomAllergenes);
				
			}

			em.getTransaction().begin();

			em.persist(allergene);

			em.getTransaction().commit();

		}
		//em.close();
	//	factory.close();
	}
}
