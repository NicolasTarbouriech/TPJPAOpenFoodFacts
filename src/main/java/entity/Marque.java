package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Marque")

public class Marque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "NOM", length = 2500, nullable = false, unique = true)
	private String nomMarque;

	public Marque() {

	}

	public Marque(String nomMarque) {
		this.nomMarque = nomMarque;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nomMarque;
	}

	public void setNom(String nom) {
		this.nomMarque = nom;
	}

	@Override
	public String toString() {
		return "Marques [id=" + id + ", nom=" + nomMarque + "]";
	}

}
