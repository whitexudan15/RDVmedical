package com.rdvmedical.model;

import java.util.Date;
import java.util.Objects;

public class Patient {
	protected String nom;
	protected String prenom;
	protected String sexe;
	protected Date dateNaissance;
	protected Double taille;
	protected Double poids;
	protected String email;
	protected String password;
	protected String tel;
	protected String numeroAssurance;

	// Constructors
	public Patient() {
		// Default constructor
	}

	
	/**
	 * Construit un nouveau Patient avec les détails spécifiés.
	 *
	 * @param nom le nom de famille du patient
	 * @param prenom le prénom du patient
	 * @param sexe le sexe du patient
	 * @param dateNaissance la date de naissance du patient
	 * @param taille la taille du patient en mètres
	 * @param poids le poids du patient en kilogrammes
	 * @param email l'adresse email du patient
	 * @param password le mot de passe pour le compte du patient
	 * @param tel le numéro de téléphone du patient
	 * @param numeroAssurance le numéro d'assurance du patient
	 */
	public Patient(String nom, String prenom, String sexe, Date dateNaissance, Double taille, Double poids,
			String email, String password, String tel, String numeroAssurance) {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.taille = taille;
		this.poids = poids;
		this.email = email;
		this.password = password;
		this.tel = tel;
		this.numeroAssurance = numeroAssurance;
	}

	// Getters and Setters
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Double getTaille() {
		return taille;
	}

	public void setTaille(Double taille) {
		this.taille = taille;
	}

	public Double getPoids() {
		return poids;
	}

	public void setPoids(Double poids) {
		this.poids = poids;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getNumeroAssurance() {
		return numeroAssurance;
	}

	public void setNumeroAssurance(String numeroAssurance) {
		this.numeroAssurance = numeroAssurance;
	}


	/**
	 * Génère un code de hachage pour l'objet Patient basé sur ses attributs.
	 * Cette méthode est remplacée pour garantir que le code de hachage est cohérent avec
	 * la méthode equals, ce qui est important pour le bon fonctionnement des collections basées sur le hachage.
	 *
	 * @return une valeur de code de hachage pour cet objet Patient.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dateNaissance, email, nom, numeroAssurance, poids, prenom, sexe, taille, tel);
	}

	/**
	 * Indique si un autre objet est "égal à" celui-ci.
	 * 
	 * @param obj l'objet de référence avec lequel comparer.
	 * @return {@code true} si cet objet est le même que l'argument obj;
	 *         {@code false} sinon.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(dateNaissance, other.dateNaissance) && Objects.equals(email, other.email)
				&& Objects.equals(nom, other.nom) && Objects.equals(numeroAssurance, other.numeroAssurance)
				&& Objects.equals(poids, other.poids) && Objects.equals(prenom, other.prenom)
				&& Objects.equals(sexe, other.sexe) && Objects.equals(taille, other.taille)
				&& Objects.equals(tel, other.tel);
	}

	/**
	 * Retourne une représentation sous forme de chaîne de l'objet Patient.
	 * La chaîne inclut le nom, le prénom, le sexe, la date de naissance,
	 * la taille, le poids, l'email, le mot de passe, le numéro de téléphone,
	 * et le numéro d'assurance du patient.
	 *
	 * @return une représentation sous forme de chaîne de l'objet Patient
	 */
	@Override
	public String toString() {
		return "Patient {\n" + "nom => " + nom + "\n" +
			   "prenom => " + prenom + "\n" +
			   "sexe => " + sexe + "\n" + 
			   "dateNaissance => " + dateNaissance + "\n" +
			   "taille => " + taille + "\n" +
			   "poids => " + poids + "\n" +
			   "email => " + email + "\n" + 
			   "password => " + password + "\n" +
			   "tel => " + tel + "\n" +
			   "numeroAssurance => " + numeroAssurance + "\n" +
			"}";
	}

}
