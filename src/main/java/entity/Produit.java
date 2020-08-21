package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produit")

public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @Column(name ="id")
	private Integer id;

	@Column(name = "GRADE", length = 255, nullable = false, unique = true)
	private String grade;

	@Column(name = "NOM", length = 2000, nullable = false, unique = true)
	private String nomProduit;

	@ManyToOne
	@JoinColumn(name = "ID_CAT", nullable = false, unique = true)
	private Categorie id_cat;

	@ManyToOne
	@JoinColumn(name = "ID_MRQ", nullable = false, unique = true)
	private Marque id_mrq;

	@ManyToMany
	@JoinTable(name = "composition_ing", joinColumns = @JoinColumn(name = "ID_PRD"), inverseJoinColumns = @JoinColumn(name = "ID_ING"))
	private List<Ingredient> listeIngredient = new ArrayList<Ingredient>();

	@ManyToMany
	@JoinTable(name = "composition_all", joinColumns = @JoinColumn(name = "ID_PRD"), inverseJoinColumns = @JoinColumn(name = "ID_ALL"))
	private List<Allergene> listeAllergene = new ArrayList<Allergene>();

	@ManyToMany
	@JoinTable(name = "composition_add", joinColumns = @JoinColumn(name = "ID_PRD"), inverseJoinColumns = @JoinColumn(name = "ID_ADD"))
	private List<Additif> listeAdditif = new ArrayList<Additif>();

	@Column(name = "BETACAROTENE100G", length = 250, nullable = false, unique = true)
	private double betaCarotene100g;

	@Column(name = "CALCIUM100G", length = 250, nullable = false, unique = true)
	private double calcium100g;

	@Column(name = "ENERGIE100G", length = 250, nullable = false, unique = true)
	private double energie100g;

	@Column(name = "FER100G", length = 250, nullable = false, unique = true)
	private double fer100g;

	@Column(name = "FIBRES100G", length = 250, nullable = false, unique = true)
	private double fibres100g;

	@Column(name = "GRAISSE100G", length = 250, nullable = false, unique = true)
	private double graisse100g;

	@Column(name = "IRON100G", length = 250, nullable = false, unique = true)
	private double iron100g;

	@Column(name = "MAGNESIUM100G", length = 250, nullable = false, unique = true)
	private double magnesium100g;

	@Column(name = "PRESENCEHUILEPALME", length = 250, nullable = false, unique = true)
	private String presenceHuilePalme;

	@Column(name = "PROTEINES100G", length = 250, nullable = false, unique = true)
	private double proteines100g;

	@Column(name = "SEL100G", length = 250, nullable = false, unique = true)
	private double sel100g;

	@Column(name = "SUCRES100G", length = 250, nullable = false, unique = true)
	private double sucres100g;

	@Column(name = "VITA100G", length = 250, nullable = false, unique = true)
	private double vitA100g;

	@Column(name = "VITB1100g", length = 250, nullable = false, unique = true)
	private double vitB1100g;

	@Column(name = "VITB12100g", length = 250, nullable = false, unique = true)
	private double vitB12100g;

	@Column(name = "VITB2100g", length = 250, nullable = false, unique = true)
	private double vitB2100g;

	@Column(name = "VITB6100g", length = 250, nullable = false, unique = true)
	private double vitB6100g;

	@Column(name = "VITB9100g", length = 250, nullable = false, unique = true)
	private double vitB9100g;

	@Column(name = "VITC100g", length = 250, nullable = false, unique = true)
	private double vitC100g;

	@Column(name = "VITD100g", length = 250, nullable = false, unique = true)
	private double vitD100g;

	@Column(name = "VITE100g", length = 250, nullable = false, unique = true)
	private double vitE100g;

	@Column(name = "VITK100g", length = 250, nullable = false, unique = true)
	private double vitK100g;

	@Column(name = "VITPP100g", length = 250, nullable = false, unique = true)
	private double vitPP100g;

	public Produit() {

	}

	public Produit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", grade=" + grade + ", nomProduit=" + nomProduit + ", betaCarotene100g="
				+ betaCarotene100g + ", calcium100g=" + calcium100g + ", energie100g=" + energie100g + ", fer100g="
				+ fer100g + ", fibres100g=" + fibres100g + ", graisse100g=" + graisse100g + ", iron100g=" + iron100g
				+ ", magnesium100g=" + magnesium100g + ", presenceHuilePalme=" + presenceHuilePalme + ", proteines100g="
				+ proteines100g + ", sel100g=" + sel100g + ", sucres100g=" + sucres100g + ", vitA100g=" + vitA100g
				+ ", vitB1100g=" + vitB1100g + ", vitB12100g=" + vitB12100g + ", vitB2100g=" + vitB2100g
				+ ", vitB6100g=" + vitB6100g + ", vitB9100g=" + vitB9100g + ", vitC100g=" + vitC100g + ", vitD100g="
				+ vitD100g + ", vitE100g=" + vitE100g + ", vitK100g=" + vitK100g + ", vitPP100g=" + vitPP100g + "]";
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

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public Categorie getId_cat() {
		return id_cat;
	}

	public void setId_cat(Categorie id_cat) {
		this.id_cat = id_cat;
	}

	public Marque getId_mrq() {
		return id_mrq;
	}

	public void setId_mrq(Marque id_mrq) {
		this.id_mrq = id_mrq;
	}

	public List<Ingredient> getListeIngredient() {
		return listeIngredient;
	}

	public void setListeIngredient(List<Ingredient> listeIngredient) {
		this.listeIngredient = listeIngredient;
	}

	public List<Allergene> getListeAllergene() {
		return listeAllergene;
	}

	public void setListeAllergene(List<Allergene> listeAllergene) {
		this.listeAllergene = listeAllergene;
	}

	public List<Additif> getListeAdditif() {
		return listeAdditif;
	}

	public void setListeAdditif(List<Additif> listeAdditif) {
		this.listeAdditif = listeAdditif;
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
