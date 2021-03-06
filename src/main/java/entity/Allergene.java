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
@Table(name = "Allergene")

public class Allergene {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NOM", length = 2500, nullable = false, unique = true)
	private String nomAllergene;

	@OneToMany(mappedBy = "listeAllergene")
	private List<Produit> listeProduit = new ArrayList<Produit>();
	
	
	public Allergene() {
		
	}
	public Allergene (String nomAllergene) {
		this.nomAllergene = nomAllergene;
	}
	
	public String getNomAllergene() {
		return nomAllergene;
	}
	public void setNomAllergene(String nomAllergene) {
		this.nomAllergene = nomAllergene;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nomAllergene;
	}

	public void setNom(String allergene) {
		this.nomAllergene = allergene;
	}

	@Override
	public String toString() {
		return "Allergenes [id=" + id + ", nom=" + nomAllergene + "]";
	}

	
}
