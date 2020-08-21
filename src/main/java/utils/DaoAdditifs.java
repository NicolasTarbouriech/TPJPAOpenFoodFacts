package utils;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Additif;
import entity.Produit;

public class DaoAdditifs {

	public void insertAdditif(EntityManager em, List<Additif> listeAdditif) {

		// si le canal de comm est différent de nul on peut rentrer les additifs

		if (em != null) {

			for (Additif additif : listeAdditif) {

				em.getTransaction().begin();

				em.persist(additif);

				em.getTransaction().commit();
			}

			em.close();

		}

	}
}
