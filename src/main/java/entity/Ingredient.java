package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Ingredient")

public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NOM", length = 2500, nullable = false, unique = true)
	private String nomIngredient;

	@OneToMany(mappedBy = "listeIngredient")
	private List<Produit> listeProduit = new ArrayList<Produit>();
	
	
	public Ingredient() {
		
	}
	
	
	public Ingredient(String nomIngredient) {
		this.nomIngredient = nomIngredient;
	}


	public String getNomIngredient() {
		return nomIngredient;
	}


	public void setNomIngredient(String nomIngredient) {
		this.nomIngredient = nomIngredient;
	}


	public List<Produit> getListeProduit() {
		return listeProduit;
	}


	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nomIngredient;
	}

	public void setNom(String nom) {
		this.nomIngredient = nom;
	}

	@Override
	public String toString() {
		return "Ingredients [id=" + id + ", nom=" + nomIngredient + "]";
	}
	
	
}
