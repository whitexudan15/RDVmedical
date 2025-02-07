// Fourmulaire d'inscription
document.getElementById("role").addEventListener("change", function () {
	const role = this.value; // Récupérer la valeur sélectionnée
	const matricule = document.getElementById("matricule");
	const specialite = document.getElementById("specialite");

	// Si c'est PATIENT (valeur 1) ou aucun rôle sélectionné, tout reste désactivé
	if (role === "1" || role === "") {
		matricule.disabled = true;
		specialite.disabled = true;
	} else if (role === "2") {
		// MEDECIN : Activer le matricule et la spécialité
		matricule.disabled = false;
		specialite.disabled = false;
	} else if (role === "3") {
		// SECRETAIRE : Activer uniquement matricule
		matricule.disabled = false;
		specialite.disabled = true;
	}
});

document.getElementById("inscription").addEventListener("click", function () {
	document.getElementById("login-form").style.display = "none";
	document.getElementById("signup-form").style.display = "block";
});

document.getElementById("connexion").addEventListener("click", function () {
	document.getElementById("signup-form").style.display = "none";
	document.getElementById("login-form").style.display = "block";
});
