package com.rdvmedical.model;

import java.util.Date;
import java.util.Objects;

public class Secretaire extends Patient {
    private String matricule;

    // Constructors
    public Secretaire() {
        // Default constructor
    }

	/**
	 * Construit un nouvel objet Secretaire avec les détails spécifiés.
	 *
	 * @param matricule l'identifiant unique pour la secrétaire
	 * @param nom le nom de famille de la secrétaire
	 * @param prenom le prénom de la secrétaire
	 * @param sexe le sexe de la secrétaire
	 * @param dateNaissance la date de naissance de la secrétaire
	 * @param taille la taille de la secrétaire
	 * @param poids le poids de la secrétaire
	 * @param email l'adresse email de la secrétaire
	 * @param password le mot de passe pour le compte de la secrétaire
	 * @param tel le numéro de téléphone de la secrétaire
	 * @param numeroAssurance le numéro d'assurance de la secrétaire
	 */
    public Secretaire(String matricule, String nom, String prenom, String sexe, Date dateNaissance, Double taille, Double poids, String email, String password, String tel, String numeroAssurance) {
        super(nom, prenom, sexe, dateNaissance, taille, poids, email, password, tel, numeroAssurance);
        this.matricule = matricule;
    }

    // Getters and setters
	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(matricule);
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
		Secretaire other = (Secretaire) obj;
		return Objects.equals(matricule, other.matricule);
	}

	@Override
    public String toString() {
        return "Secretaire {\n" + 
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
			"numeroAssurance => " + getNumeroAssurance() + "\n" +
            "}";
    }
}
