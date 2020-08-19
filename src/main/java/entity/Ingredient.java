package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ingredient")

public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NOM", length = 2500, nullable = false, unique = true)
	private String nomIngredient;

	public Ingredient() {
		
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
