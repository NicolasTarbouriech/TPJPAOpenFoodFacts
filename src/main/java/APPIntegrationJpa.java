import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.apache.commons.io.FileUtils;

import entity.Additif;
import entity.Allergene;
import entity.Categorie;
import entity.Ingredient;
import entity.Marque;
import entity.Produit;
import utils.ConnectionEntity;
import utils.Convertisseur;
import utils.DaoAdditifs;
import utils.DaoAllergenes;
import utils.DaoCategories;
import utils.DaoIngredients;
import utils.DaoMarques;
import utils.DaoProduits;

public class APPIntegrationJpa {

	public static void main(String[] args) {

		/*
		 * DaoAllergenes daoAll = new DaoAllergenes(); DaoAdditifs daoAdd = new
		 * DaoAdditifs(); DaoIngredients daoIng = new DaoIngredients(); DaoCategories
		 * daoCategorie = new DaoCategories(); DaoMarques daoMarque = new DaoMarques();
		 * DaoProduits daoProduits = new DaoProduits();
		 */

		List<String> listeAllergene = new ArrayList<String>();
		List<String> listeAdditif = new ArrayList<String>();
		List<String> listeIngredient = new ArrayList<String>();
		List<String> listeCategorie = new ArrayList<String>();
		List<String> listeMarques = new ArrayList<String>();
		List<Produit> listeProduit = new ArrayList<Produit>();

		try {
			File file = new File("C:/Users/tarbo/Documents/Diginamic/TP Diginamic/openFoodFacts.csv");

			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			EntityManager em = ConnectionEntity.getConnexionEntity();

			lignes.remove(0);

			for (String ligne : lignes) {

				Produit produit = new Produit();
				Marque marque = new Marque();
				Categorie categorie = new Categorie();

				String[] morceaux = ligne.split("\\|", -1);

				String categories = morceaux[0];
				String marques = morceaux[1];

				categorie.setNomCategorie(categories);
				marque.setNom(marques);

				em.getTransaction().begin();
				TypedQuery<Marque> q = em.createQuery("SELECT m FROM Marque m WHERE m.nomMarque = : nom", Marque.class);
				q.setParameter("nom", marques);
				if (q.getResultList().isEmpty() == true)
					em.merge(marque);

				TypedQuery<Categorie> q1 = em.createQuery("SELECT c FROM Categorie c WHERE c.nomCategorie = : nom",
						Categorie.class);
				q1.setParameter("nom", categories);
				if (q1.getResultList().isEmpty() == true)
					em.merge(categorie);

				em.getTransaction().commit();

				String nomProduit = morceaux[2];
				produit.setNomProduit(nomProduit);

				String nutritionGradeFr = morceaux[3];
				String ingredientsStr = morceaux[4];
				produit.setGrade(nutritionGradeFr);

				/*
				 * Double energie100g = Convertisseur.toDouble(morceaux[5]); Double graisse100g
				 * = Convertisseur.toDouble(morceaux[6]); Double sucres100g =
				 * Convertisseur.toDouble(morceaux[7]); Double fibres100g =
				 * Convertisseur.toDouble(morceaux[8]); Double proteines100g =
				 * Convertisseur.toDouble(morceaux[9]); Double sel100g =
				 * Convertisseur.toDouble(morceaux[10]); Double vitA100g =
				 * Convertisseur.toDouble(morceaux[11]); Double vitD100g =
				 * Convertisseur.toDouble(morceaux[12]); Double vitE100g =
				 * Convertisseur.toDouble(morceaux[13]); Double vitK100g =
				 * Convertisseur.toDouble(morceaux[14]); Double vitC100g =
				 * Convertisseur.toDouble(morceaux[15]); Double vitB1100g =
				 * Convertisseur.toDouble(morceaux[16]); Double vitB2100g =
				 * Convertisseur.toDouble(morceaux[17]); Double vitPP100g =
				 * Convertisseur.toDouble(morceaux[18]); Double vitB6100g =
				 * Convertisseur.toDouble(morceaux[19]); Double vitB9100g =
				 * Convertisseur.toDouble(morceaux[20]); Double vitB12100g =
				 * Convertisseur.toDouble(morceaux[21]);
				 * 
				 * Double magnesium100g = Convertisseur.toDouble(morceaux[23]); Double iron100g
				 * = Convertisseur.toDouble(morceaux[24]); Double fer100g =
				 * Convertisseur.toDouble(morceaux[25]);
				 * 
				 * String presenceHuilePalme = morceaux[27];
				 */
				String additifStr = morceaux[28];
				String allergenesStr = morceaux[29];

				produit.setBetaCarotene100g(Convertisseur.toDouble(morceaux[26]));
				produit.setCalcium100g(Convertisseur.toDouble(morceaux[22]));
				produit.setEnergie100g(Convertisseur.toDouble(morceaux[5]));
				produit.setFer100g(Convertisseur.toDouble(morceaux[25]));
				produit.setFibres100g(Convertisseur.toDouble(morceaux[8]));
				produit.setGraisse100g(Convertisseur.toDouble(morceaux[6]));
				produit.setIron100g(Convertisseur.toDouble(morceaux[24]));
				produit.setMagnesium100g(Convertisseur.toDouble(morceaux[23]));
				produit.setPresenceHuilePalme(morceaux[27]);
				produit.setProteines100g(Convertisseur.toDouble(morceaux[9]));
				produit.setSel100g(Convertisseur.toDouble(morceaux[10]));
				produit.setSucres100g(Convertisseur.toDouble(morceaux[7]));
				produit.setVitA100g(Convertisseur.toDouble(morceaux[11]));
				produit.setVitB1100g(Convertisseur.toDouble(morceaux[16]));
				produit.setVitB12100g(Convertisseur.toDouble(morceaux[21]));
				produit.setVitB6100g(Convertisseur.toDouble(morceaux[19]));
				produit.setVitB2100g(Convertisseur.toDouble(morceaux[17]));
				produit.setVitB9100g(Convertisseur.toDouble(morceaux[20]));
				produit.setVitC100g(Convertisseur.toDouble(morceaux[15]));
				produit.setVitD100g(Convertisseur.toDouble(morceaux[12]));
				produit.setVitE100g(Convertisseur.toDouble(morceaux[13]));
				produit.setVitK100g(Convertisseur.toDouble(morceaux[14]));
				produit.setVitPP100g(Convertisseur.toDouble(morceaux[18]));

				listeAdditif.add(additifStr);
				List<Additif> listeAdditifSansDoublon = Convertisseur.suppressionDoublonAdditif(listeAdditif);
				for (Additif add : listeAdditifSansDoublon) {
					produit.getListeAdditif().add(add);
				}

				listeAllergene.add(allergenesStr);
				List<Allergene> listeAllergeneSansDoublon = Convertisseur.suppressionDoublonAllergene(listeAllergene);
				for (Allergene all : listeAllergeneSansDoublon) {
					produit.getListeAllergene().add(all);
				}

				listeIngredient.add(ingredientsStr);
				List<Ingredient> listeIngredientSansDoublon = Convertisseur
						.suppressionDoublonIngredient(listeIngredient);
				for (Ingredient ing : listeIngredientSansDoublon) {
					produit.getListeIngredient().add(ing);
				}

				// listeCategorie.add(categories);
				// listeMarques.add(marque);

				//listeProduit.add(produit);
				

				em.getTransaction().begin();
				em.persist(produit);
				em.getTransaction().commit();
				listeIngredient.clear();
				listeAllergene.clear();
				listeAdditif.clear();
				
				System.out.println(produit.getNomProduit());

			}

			// List<Allergene> listAllergeneSansDoublon =
			// Convertisseur.suppressionDoublonAllergene(listeAllergene);
			// daoAll.insertAllergene(listAllergeneSansDoublon);

			// List<Ingredient> listeIngredientSansDoublon =
			// Convertisseur.suppressionDoublonIngredient(listeIngredient);
			// daoIng.insertIngredient(listeIngredientSansDoublon);

			// List<Additif> listeAdditifSansDoublon =
			// Convertisseur.suppressionDoublonAdditif(listeAdditif);
			// daoAdd.insertAdditif(listeAdditifSansDoublon);

			// List<Categorie> listeCategorieSansDoublon =
			// Convertisseur.suppressionDoublonCategorie(listeCategorie);
			// daoCategorie.insertCategories(listeCategorieSansDoublon);

			// List<Marque> listeMarqueSansDoublon =
			// Convertisseur.suppressionDoublonMarque(listeMarques);
			// daoMarque.insertMarques(listeMarqueSansDoublon);

			
		} catch (IOException e) {

			System.err.println(e.getMessage());

		}
	}
}
