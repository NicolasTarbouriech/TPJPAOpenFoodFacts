package utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Allergene;

public class DaoAllergenes {

	public void insertAllergene(EntityManager em, List<Allergene> listeAllergene) {

		if (em != null) {

			for (Allergene allergenes : listeAllergene) {

				em.getTransaction().begin();
				em.persist(allergenes);
				em.getTransaction().commit();
			}
// fermeture de la transaction
			em.close();

		}

	}
}
