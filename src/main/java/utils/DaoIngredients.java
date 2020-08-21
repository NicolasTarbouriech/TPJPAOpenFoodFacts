package utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Ingredient;

public class DaoIngredients {
	public void insertIngredient(EntityManager em, List<Ingredient> listeIngredient) {

		if (em != null) {

			for (Ingredient ingredient : listeIngredient) {

				em.getTransaction().begin();
				em.persist(ingredient);
				em.getTransaction().commit();
			}

			em.close();
		}
	}
}
