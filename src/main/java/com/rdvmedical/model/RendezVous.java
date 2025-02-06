package com.rdvmedical.model;

import java.sql.Time;
import java.util.Date;

public class RendezVous {
	private Date date;
	private Time heureDebut;
	private Time heureFin;
	private String status;
	private Medecin medecin;
	private Patient patient;

	// Constructors
	public RendezVous() {
		// Default constructor
	}

	/**
	 * Construit un nouveau RendezVous avec les détails spécifiés.
	 *
	 * @param date la date du rendez-vous
	 * @param heureDebut l'heure de début du rendez-vous
	 * @param heureFin l'heure de fin du rendez-vous
	 * @param status le statut du rendez-vous
	 * @param medecin le médecin associé au rendez-vous
	 * @param patient le patient associé au rendez-vous
	 */
	public RendezVous(Date date, Time heureDebut, Time heureFin, String status, Medecin medecin, Patient patient) {
		this.date = date;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.status = status;
		this.medecin = medecin;
		this.patient = patient;
	}

	// Getters and Setters
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

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
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
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
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
		RendezVous other = (RendezVous) obj;
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
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
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
			   "patient => " + patient + "\n" +
			"}";
	}

}
