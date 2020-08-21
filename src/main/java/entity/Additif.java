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
@Table(name = "Additif")

public class Additif {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NOM", length = 2500, nullable = false, unique = true)
	private String nomAdditif;

	@OneToMany(mappedBy = "listeAdditif")
	private List<Produit> listeProduit = new ArrayList<Produit>();
	
	
	public Additif() {
	}


	public Additif (String nomAdditif) {
		this.nomAdditif = nomAdditif;
	}
	
	public String getNomAdditif() {
		return nomAdditif;
	}


	public void setNomAdditif(String nomAdditif) {
		this.nomAdditif = nomAdditif;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nomAdditif;
	}

	public void setNom(String nom) {
		this.nomAdditif = nom;
	}

	@Override
	public String toString() {
		return "Additifs [id=" + id + ", nom=" + nomAdditif + "]";
	}

	
}
