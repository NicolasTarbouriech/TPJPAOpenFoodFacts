package utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Categorie;

public class DaoCategories {

	public void insertCategories(EntityManager em, List<Categorie> listeCategorie) {

		if (em != null) {

			for (Categorie categorie : listeCategorie) {

				em.getTransaction().begin();
				;

				em.persist(categorie);

				em.getTransaction().commit();
			}
			em.close();
		}

	}

}
