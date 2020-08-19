package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Produit")

public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "grade", length = 255, insertable = false, unique = true)
	private String grade;

	@Column(name = "NOM", length = 2000, insertable = false, unique = true)
	private String nom;

	@Column(name = "id_cat", length = 250, insertable = false, unique = true)
	private int id_cat;

	@Column(name = "id_mrq", length = 250, insertable = false, unique = true)
	private int id_mrq;

	@Column(name = "betaCarotene100g", length = 250, insertable = false, unique = true)
	private double betaCarotene100g;

	@Column(name = "calcium100g", length = 250, insertable = false, unique = true)
	private double calcium100g;

	@Column(name = "energie100g", length = 250, insertable = false, unique = true)
	private double energie100g;

	@Column(name = "fer100g", length = 250, insertable = false, unique = true)
	private double fer100g;

	@Column(name = "fibres100g", length = 250, insertable = false, unique = true)
	private double fibres100g;

	@Column(name = "graisse100g", length = 250, insertable = false, unique = true)
	private double graisse100g;

	@Column(name = "iron100g", length = 250, insertable = false, unique = true)
	private double iron100g;

	@Column(name = "magnesium100g", length = 250, insertable = false, unique = true)
	private double magnesium100g;

	@Column(name = "presenceHuilePalme", length = 250, insertable = false, unique = true)
	private String presenceHuilePalme;

	@Column(name = "proteines100g", length = 250, insertable = false, unique = true)
	private double proteines100g;

	@Column(name = "sel100g", length = 250, insertable = false, unique = true)
	private double sel100g;

	@Column(name = "sucres100g", length = 250, insertable = false, unique = true)
	private double sucres100g;

	@Column(name = "vitA100g", length = 250, insertable = false, unique = true)
	private double vitA100g;

	@Column(name = "vitB1100g", length = 250, insertable = false, unique = true)
	private double vitB1100g;

	@Column(name = "vitB12100g", length = 250, insertable = false, unique = true)
	private double vitB12100g;

	@Column(name = "vitB2100g", length = 250, insertable = false, unique = true)
	private double vitB2100g;

	@Column(name = "vitB6100g", length = 250, insertable = false, unique = true)
	private double vitB6100g;

	@Column(name = "vitB9100g", length = 250, insertable = false, unique = true)
	private double vitB9100g;

	@Column(name = "vitC100g", length = 250, insertable = false, unique = true)
	private double vitC100g;

	@Column(name = "vitD100g", length = 250, insertable = false, unique = true)
	private double vitD100g;

	@Column(name = "vitE100g", length = 250, insertable = false, unique = true)
	private double vitE100g;

	@Column(name = "vitK100g", length = 250, insertable = false, unique = true)
	private double vitK100g;

	@Column(name = "vitPP100g", length = 250, insertable = false, unique = true)
	private double vitPP100g;

	public Produit() {

	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", grade=" + grade + ", nom=" + nom + ", id_cat=" + id_cat + ", id_mrq=" + id_mrq
				+ ", betaCarotene100g=" + betaCarotene100g + ", calcium100g=" + calcium100g + ", energie100g="
				+ energie100g + ", fer100g=" + fer100g + ", fibres100g=" + fibres100g + ", graisse100g=" + graisse100g
				+ ", iron100g=" + iron100g + ", magnesium100g=" + magnesium100g + ", presenceHuilePalme="
				+ presenceHuilePalme + ", proteines100g=" + proteines100g + ", sel100g=" + sel100g + ", sucres100g="
				+ sucres100g + ", vitA100g=" + vitA100g + ", vitB1100g=" + vitB1100g + ", vitB12100g=" + vitB12100g
				+ ", vitB2100g=" + vitB2100g + ", vitB6100g=" + vitB6100g + ", vitB9100g=" + vitB9100g + ", vitC100g="
				+ vitC100g + ", vitD100g=" + vitD100g + ", vitE100g=" + vitE100g + ", vitK100g=" + vitK100g
				+ ", vitPP100g=" + vitPP100g + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId_cat() {
		return id_cat;
	}

	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}

	public int getId_mrq() {
		return id_mrq;
	}

	public void setId_mrq(int id_mrq) {
		this.id_mrq = id_mrq;
	}

	public double getBetaCarotene100g() {
		return betaCarotene100g;
	}

	public void setBetaCarotene100g(double betaCarotene100g) {
		this.betaCarotene100g = betaCarotene100g;
	}

	public double getCalcium100g() {
		return calcium100g;
	}

	public void setCalcium100g(double calcium100g) {
		this.calcium100g = calcium100g;
	}

	public double getEnergie100g() {
		return energie100g;
	}

	public void setEnergie100g(double energie100g) {
		this.energie100g = energie100g;
	}

	public double getFer100g() {
		return fer100g;
	}

	public void setFer100g(double fer100g) {
		this.fer100g = fer100g;
	}

	public double getFibres100g() {
		return fibres100g;
	}

	public void setFibres100g(double fibres100g) {
		this.fibres100g = fibres100g;
	}

	public double getGraisse100g() {
		return graisse100g;
	}

	public void setGraisse100g(double graisse100g) {
		this.graisse100g = graisse100g;
	}

	public double getIron100g() {
		return iron100g;
	}

	public void setIron100g(double iron100g) {
		this.iron100g = iron100g;
	}

	public double getMagnesium100g() {
		return magnesium100g;
	}

	public void setMagnesium100g(double magnesium100g) {
		this.magnesium100g = magnesium100g;
	}

	public String getPresenceHuilePalme() {
		return presenceHuilePalme;
	}

	public void setPresenceHuilePalme(String presenceHuilePalme) {
		this.presenceHuilePalme = presenceHuilePalme;
	}

	public double getProteines100g() {
		return proteines100g;
	}

	public void setProteines100g(double proteines100g) {
		this.proteines100g = proteines100g;
	}

	public double getSel100g() {
		return sel100g;
	}

	public void setSel100g(double sel100g) {
		this.sel100g = sel100g;
	}

	public double getSucres100g() {
		return sucres100g;
	}

	public void setSucres100g(double sucres100g) {
		this.sucres100g = sucres100g;
	}

	public double getVitA100g() {
		return vitA100g;
	}

	public void setVitA100g(double vitA100g) {
		this.vitA100g = vitA100g;
	}

	public double getVitB1100g() {
		return vitB1100g;
	}

	public void setVitB1100g(double vitB1100g) {
		this.vitB1100g = vitB1100g;
	}

	public double getVitB12100g() {
		return vitB12100g;
	}

	public void setVitB12100g(double vitB12100g) {
		this.vitB12100g = vitB12100g;
	}

	public double getVitB2100g() {
		return vitB2100g;
	}

	public void setVitB2100g(double vitB2100g) {
		this.vitB2100g = vitB2100g;
	}

	public double getVitB6100g() {
		return vitB6100g;
	}

	public void setVitB6100g(double vitB6100g) {
		this.vitB6100g = vitB6100g;
	}

	public double getVitB9100g() {
		return vitB9100g;
	}

	public void setVitB9100g(double vitB9100g) {
		this.vitB9100g = vitB9100g;
	}

	public double getVitC100g() {
		return vitC100g;
	}

	public void setVitC100g(double vitC100g) {
		this.vitC100g = vitC100g;
	}

	public double getVitD100g() {
		return vitD100g;
	}

	public void setVitD100g(double vitD100g) {
		this.vitD100g = vitD100g;
	}

	public double getVitE100g() {
		return vitE100g;
	}

	public void setVitE100g(double vitE100g) {
		this.vitE100g = vitE100g;
	}

	public double getVitK100g() {
		return vitK100g;
	}

	public void setVitK100g(double vitK100g) {
		this.vitK100g = vitK100g;
	}

	public double getVitPP100g() {
		return vitPP100g;
	}

	public void setVitPP100g(double vitPP100g) {
		this.vitPP100g = vitPP100g;
	}

}
