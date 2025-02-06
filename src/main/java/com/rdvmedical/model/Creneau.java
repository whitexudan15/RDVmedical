package com.rdvmedical.model;

import java.sql.Time;
import java.util.Date;

public class Creneau {
	private Date date;
	private Time heureDebut;
	private Time heureFin;
	private String status;
	private Medecin medecin;

	// Constructors
	public Creneau() {
		// Default constructor
	}

	/**
	 * Construit un nouveau Creneau avec les détails spécifiés.
	 *
	 * @param date la date du créneau
	 * @param heureDebut l'heure de début du créneau
	 * @param heureFin l'heure de fin du créneau
	 * @param status le statut du créneau
	 * @param medecin le médecin associé au créneau
	 */
	public Creneau(Date date, Time heureDebut, Time heureFin, String status, Medecin medecin) {
		this.date = date;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.status = status;
		this.medecin = medecin;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Time heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Time getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Time heureFin) {
		this.heureFin = heureFin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((heureDebut == null) ? 0 : heureDebut.hashCode());
		result = prime * result + ((heureFin == null) ? 0 : heureFin.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((medecin == null) ? 0 : medecin.hashCode());
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
		Creneau other = (Creneau) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (heureDebut == null) {
			if (other.heureDebut != null)
				return false;
		} else if (!heureDebut.equals(other.heureDebut))
			return false;
		if (heureFin == null) {
			if (other.heureFin != null)
				return false;
		} else if (!heureFin.equals(other.heureFin))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (medecin == null) {
			if (other.medecin != null)
				return false;
		} else if (!medecin.equals(other.medecin))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RendezVous {\n" + "date => " + date + "\n" +
			   "heureDebut => " + heureDebut + "\n" +
			   "heureFin => " + heureFin + "\n" + 
			   "status => " + status + "\n" +
			   "medecin => " + medecin + "\n" +
			"}";
	}
}
