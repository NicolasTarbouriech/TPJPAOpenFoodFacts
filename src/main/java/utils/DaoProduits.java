package utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Produit;

public class DaoProduits {


	public void insertProduits(EntityManager em, List<Produit> listeProduit) {


		if (em != null) {

			for (Produit produit : listeProduit) {

				em.getTransaction().begin();

				
				em.persist(produit);

				em.getTransaction().commit();
			}

			em.close();
		}

	}
}
