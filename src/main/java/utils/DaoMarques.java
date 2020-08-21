package utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Marque;

public class DaoMarques {

	public void insertMarques(EntityManager em, List<Marque> listeMarque) {

		if (em != null) {

			for (Marque marque : listeMarque) {

				em.getTransaction().begin();

				em.persist(marque);

				em.getTransaction().commit();
			}

			em.close();

		}

	}
}