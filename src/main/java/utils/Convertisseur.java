package utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.math.NumberUtils;

import entity.Additif;
import entity.Allergene;
import entity.Categorie;
import entity.Ingredient;
import entity.Marque;
import entity.Produit;

public class Convertisseur {

	public static Double toDouble(String value) {
		if (NumberUtils.isCreatable(value)) {
			return Double.parseDouble(value);
		}
		return null;
	}

	public static Integer toInt(String value) {
		if (NumberUtils.isDigits(value)) {
			return Integer.parseInt(value);
		}
		return null;
	}

	public static List<Allergene> suppressionDoublonAllergene(List<String> listeAvecDoublon) {

		Set<String> mySet = new HashSet<String>();
		List<Allergene> listeAllergene = new ArrayList<Allergene>();

		for (String ligneAllergeneParProduit : listeAvecDoublon) {

			String[] tableauDesMorceaux = ligneAllergeneParProduit.split(",", -1);

			for (int i = 0; i < tableauDesMorceaux.length; i++) {

				String allergene = tableauDesMorceaux[i];

				mySet.add(allergene);

			}
		}

		for (String nomAllergene : mySet) {

			if (!nomAllergene.isEmpty() || !nomAllergene.isBlank()) {

				Allergene allergene = new Allergene(nomAllergene);

				listeAllergene.add(allergene);
			}
		}

		System.out.println(listeAllergene.size());

		return listeAllergene;
	}

	public static List<Ingredient> suppressionDoublonIngredient(List<String> listeAvecDoublon) {

		Set<String> mySet = new HashSet<String>();
		List<Ingredient> listeIngredient = new ArrayList<Ingredient>();

		for (String ligneIngredientParProduit : listeAvecDoublon) {

			String[] tableauDesMorceaux = ligneIngredientParProduit.split(",", -1);

			for (int i = 0; i < tableauDesMorceaux.length; i++) {

				String ing = tableauDesMorceaux[i];

				mySet.add(ing);

			}
		}

		for (String nomIngredient : mySet) {

			if (!nomIngredient.isEmpty() || !nomIngredient.isBlank()) {

				Ingredient ingredient = new Ingredient(nomIngredient);

				listeIngredient.add(ingredient);
			}
		}

		System.out.println(listeIngredient.size());

		return listeIngredient;
	}

	public static List<Additif> suppressionDoublonAdditif(List<String> listeAvecDoublon) {

		Set<String> mySet = new HashSet<String>();
		List<Additif> listeAdditif = new ArrayList<Additif>();

		for (String ligneAdditifParProduit : listeAvecDoublon) {

			String[] tableauDesMorceaux = ligneAdditifParProduit.split(",", -1);

			for (int i = 0; i < tableauDesMorceaux.length; i++) {

				String add = tableauDesMorceaux[i];

				mySet.add(add);

			}
		}

		for (String nomAdditif : mySet) {

			if (!nomAdditif.isEmpty() || !nomAdditif.isBlank()) {

				Additif additif = new Additif(nomAdditif);

				listeAdditif.add(additif);
			}
		}

		System.out.println(listeAdditif.size());

		return listeAdditif;
	}

	public static List<Categorie> suppressionDoublonCategorie(List<String> listeAvecDoublon) {

		Set<String> mySet = new HashSet<String>();
		List<Categorie> listeCategorie = new ArrayList<Categorie>();

		for (String ligneCategorieParProduit : listeAvecDoublon) {

			String[] tableauDesMorceaux = ligneCategorieParProduit.split(",", -1);

			for (int i = 0; i < tableauDesMorceaux.length; i++) {

				String cat = tableauDesMorceaux[i];

				mySet.add(cat);
			}
		}

		for (String nomCategorie : mySet) {

			if (!nomCategorie.isEmpty() || !nomCategorie.isBlank()) {

				Categorie categorie = new Categorie(nomCategorie);

				listeCategorie.add(categorie);
			}
		}

		System.out.println(listeCategorie.size());

		return listeCategorie;
	}

	public static List<Marque> suppressionDoublonMarque(List<String> listeAvecDoublon) {

		Set<String> mySet = new HashSet<String>();
		List<Marque> listeMarque = new ArrayList<Marque>();

		for (String ligneMarqueParProduit : listeAvecDoublon) {

			String[] tableauDesMorceaux = ligneMarqueParProduit.split(",", -1);

			for (int i = 0; i < tableauDesMorceaux.length; i++) {

				String cat = tableauDesMorceaux[i];

				mySet.add(cat);
			}
		}

		for (String nomMarque : mySet) {

			if (!nomMarque.isEmpty() || !nomMarque.isBlank()) {

				Marque marque = new Marque(nomMarque);

				listeMarque.add(marque);
			}
		}

		System.out.println(listeMarque.size());

		return listeMarque;
	}
	
	
	public static List<Produit> suppressionDoublonProduit(List<String> listeAvecDoublon) {

		Set<String> mySet = new HashSet<String>();
		List<Produit> listeProduit = new ArrayList<Produit>();

		for (String ligneProduitParProduit : listeAvecDoublon) {

			String[] tableauDesMorceaux = ligneProduitParProduit.split(",", -1);

			for (int i = 0; i < tableauDesMorceaux.length; i++) {

				String cat = tableauDesMorceaux[i];

				mySet.add(cat);
			}
		}

		for (String nomProduit : mySet) {

			if (!nomProduit.isEmpty() || !nomProduit.isBlank()) {

				Produit produit = new Produit(nomProduit);

				listeProduit.add(produit);
			}
		}

		System.out.println(listeProduit.size());

		return listeProduit;
	}
}
