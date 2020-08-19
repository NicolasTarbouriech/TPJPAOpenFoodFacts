package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Allergene")

public class Allergene {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NOM", length = 2500, nullable = false, unique = true)
	private String nomAllergene;

	public Allergene() {
		
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
