package com.rdvmedical.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Medecin extends Patient{
    private String matricule;
    private String specialite;
    private List<Creneau> creneaux;

    // Constructors
    public Medecin() {
        // Default constructor
    }

	/**
	 * Construit un nouvel objet Medecin avec les détails spécifiés.
	 *
	 * @param matricule        l'identifiant unique pour le medecin
	 * @param nom              le nom de famille du medecin
	 * @param prenom           le prénom du medecin
	 * @param sexe             le sexe du medecin
	 * @param dateNaissance    la date de naissance du medecin
	 * @param taille           la taille du medecin
	 * @param poids            le poids du medecin
	 * @param email            l'adresse email du medecin
	 * @param password         le mot de passe pour le compte du medecin
	 * @param tel              le numéro de téléphone du medecin
	 * @param numeroAssurance  le numéro d'assurance du medecin
	 * @param specialite       la spécialité du medecin
	 */
    public Medecin(String matricule, String nom, String prenom, String sexe, Date dateNaissance, Double taille, Double poids, String email, String password, String tel, String numeroAssurance, String specialite) {
        super(nom, prenom, sexe, dateNaissance, taille, poids, email, password, tel, numeroAssurance);
        this.matricule = matricule;
        this.specialite = specialite;
    }

    // Getters and setters
	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	public List<Creneau> getCreneaux() {
		return creneaux;
	}

	public void setCreneaux(List<Creneau> creneaux) {
		this.creneaux = creneaux;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(matricule, specialite);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medecin other = (Medecin) obj;
		return Objects.equals(matricule, other.matricule) && Objects.equals(specialite, other.specialite);
	}

	@Override
    public String toString() {
        return "Medecin {\n" + 
            "matricule => " + matricule + "\n" +
            "nom " + getNom() + "\n" +
            "prenom => " + getPrenom() + "\n" +
            "sexe => " + getSexe() + "\n" +
            "dateNaissance => " + getDateNaissance() + "\n" +
            "taille => " + getTaille() + "\n" +
			"poids => " + getPoids() + "\n" +
            "email => " + getEmail() + "\n" +
            "password => " + getPassword() + "\n" +
            "tel => " + getTel() + "\n" +
			"specialite => " + specialite + "\n" +
			"numeroAssurance => " + getNumeroAssurance() + "\n" +
            "}";
    }
	
}
