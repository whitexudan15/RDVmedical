package com.rdvmedical.model;

public class Specialite {
	private String nom;
	private String description;

	// Constructors
	public Specialite() {
		// Default constructor
	}

	/**
	 * Construit une nouvelle spécialité avec le nom et la description spécifiés.
	 *
	 * @param nom le nom de la spécialité
	 * @param description la description de la spécialité
	 */
	public Specialite(String nom, String description) {
		this.nom = nom;
		this.description = description;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Specialite other = (Specialite) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Specialite {\n" + "nom => " + nom + "\n" +
			   "description => " + description + "\n" +
			"}";
	}
}
