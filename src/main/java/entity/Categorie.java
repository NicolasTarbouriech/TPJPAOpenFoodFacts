package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")

public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Integer id;

	@Column(name = "NOM", length = 250, nullable = false, unique = true)
	private String nomCategorie;

	public Categorie() {
		
	}
	
	public Categorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	
	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nomCategorie;
	}

	public void setNom(String nom) {
		this.nomCategorie = nom;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id + ", nom=" + nomCategorie + "]";
	}
	
	
}
