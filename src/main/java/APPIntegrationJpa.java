import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import entity.Additif;
import entity.Allergene;
import entity.Ingredient;
import utils.Convertisseur;
import utils.DaoAdditifs;
import utils.DaoAllergenes;
import utils.DaoIngredients;



public class APPIntegrationJpa {

	public static void main(String[] args) {

		DaoAllergenes daoAll = new DaoAllergenes();
		DaoAdditifs daoAdd = new DaoAdditifs();
		DaoIngredients daoIng = new DaoIngredients();
		
		try {
			File file = new File("C:/Users/tarbo/Documents/Diginamic/TP Diginamic/openFoodFacts.csv");
					
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			lignes.remove(0);
			
			for (String ligne: lignes) {
				
				String[] morceaux = ligne.split("\\|", -1);
				
				String categories = morceaux[0];
				String nomMarque = morceaux[1];
				String nomProduit = morceaux[2];
				String nutritionGradeFr = morceaux[3];
				String ingredientsStr = morceaux[4];

				Double energie100g = Convertisseur.toDouble(morceaux[5]);
				Double graisse100g = Convertisseur.toDouble(morceaux[6]);
				Double sucres100g = Convertisseur.toDouble(morceaux[7]);
				Double fibres100g = Convertisseur.toDouble(morceaux[8]);
				Double proteines100g = Convertisseur.toDouble(morceaux[9]);
				Double sel100g = Convertisseur.toDouble(morceaux[10]);
				Double vitA100g = Convertisseur.toDouble(morceaux[11]);
				Double vitD100g = Convertisseur.toDouble(morceaux[12]);
				Double vitE100g = Convertisseur.toDouble(morceaux[13]);
				Double vitK100g = Convertisseur.toDouble(morceaux[14]);
				Double vitC100g = Convertisseur.toDouble(morceaux[15]);
				Double vitB1100g = Convertisseur.toDouble(morceaux[16]);
				Double vitB2100g = Convertisseur.toDouble(morceaux[17]);
				Double vitPP100g = Convertisseur.toDouble(morceaux[18]);
				Double vitB6100g = Convertisseur.toDouble(morceaux[19]);
				Double vitB9100g = Convertisseur.toDouble(morceaux[20]);
				Double vitB12100g = Convertisseur.toDouble(morceaux[21]);
				Double calcium100g = Convertisseur.toDouble(morceaux[22]);
				Double magnesium100g = Convertisseur.toDouble(morceaux[23]);
				Double iron100g = Convertisseur.toDouble(morceaux[24]);
				Double fer100g = Convertisseur.toDouble(morceaux[25]);
				Double betaCarotene100g = Convertisseur.toDouble(morceaux[26]);
				
				String presenceHuilePalme = morceaux[27];
				String additifStr = morceaux[28];
				String allergenesStr = morceaux[29];
				
				
				
		//	Allergene allergene = new Allergene();
			//daoAll.insertAllergene(allergene, allergenesStr);
				
		//	Additif additif = new Additif();
		//	daoAdd.insertAdditif(additif, additifStr);
				
			Ingredient ingredient = new Ingredient();
			daoIng.insertIngredient(ingredient, ingredientsStr);
			
			
			
			}
			
			System.out.println(lignes.size());
			
		} catch (IOException e) {
			
			System.err.println(e.getMessage());
			
		}
	}
}

