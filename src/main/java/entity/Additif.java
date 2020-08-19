package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Additif")

public class Additif {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NOM", length = 2500, nullable = false, unique = true)
	private String nomAdditif;

	public Additif() {
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