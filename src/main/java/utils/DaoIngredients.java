package utils;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Ingredient;

public class DaoIngredients {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connexion");

	public void insertIngredient(Ingredient ingredient, String morceaux) {

		EntityManager em = factory.createEntityManager();

		if (em != null) {
			List<String> ingredients = Arrays.asList(morceaux.split(",", -1));

			for (String nomIngredients : ingredients) {
				ingredient.setNom(nomIngredients);
			}

			em.getTransaction().begin();

			em.persist(ingredient);

			em.getTransaction().commit();
		}
	}
}
