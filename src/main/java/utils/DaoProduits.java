package utils;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Produit;

public class DaoProduits {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connexion");

	public void insertAdditif(Produit produit, String morceaux) {

		EntityManager em = factory.createEntityManager();

		if (em != null) {
			List<String> produits = Arrays.asList(morceaux.split(",", -1));

			for (String nomProduits : produits) {

				produit.setNom(nomProduits);

			}

			em.getTransaction().begin();

			em.persist(produit);

			em.getTransaction().commit();
		}

	}
}
