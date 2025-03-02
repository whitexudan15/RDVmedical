<!DOCTYPE html>
<html lang="fr">
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/index.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/bootstrap/bootstrap.min.css" />
		<title>Accueil</title>
	</head>
	<body>
		<div class="pack"></div>
		<!--Background video-->
		<video autoplay muted loop id="background-video">
			<source src="${pageContext.request.contextPath}/assets/bgvid.mp4" type="video/mp4" />
		</video>
		<!--Signup-->
		<div
			id="signup-form"
			class="signup-form text-center p-4 rounded-2"
			style="display: none"
		>
			<h3 class="mb-3">INSCRIPTION</h3>
			<div class="mb-3">
				<b class="text-danger">Inscription echoue</b>
			</div>
			<form action="">
				<div class="row">
					<div class="col-md-6">
						<div class="mb-3">
							<input
								class="form-control"
								type="text"
								id="nom"
								name="nom"
								placeholder="Nom"
								required
							/>
						</div>

						<div class="mb-3">
							<input
								class="form-control"
								type="text"
								id="prenom"
								name="prenom"
								placeholder="Prenom"
								required
							/>
						</div>

						<div class="mb-3">
							<input
								class="form-control"
								type="text"
								id="age"
								name="age"
								placeholder="Age"
							/>
						</div>
					</div>

					<div class="col-md-6">
						<div class="mb-3">
							<select
								class="form-select"
								disabled
								id="role"
								name="role"
								required
							>
								<option selected value="1">PATIENT</option>
							</select>
						</div>

						<div class="mb-3">
							<input
								class="form-control"
								type="email"
								id="email"
								name="email"
								placeholder="Email"
								required
							/>
						</div>

						<div class="mb-3">
							<input
								class="form-control"
								type="password"
								id="password"
								name="password"
								placeholder="Mot de passe"
								required
							/>
						</div>
					</div>
				</div>

				<div class="row"></div>

				<div class="mb-3">
					<button
						style="background-color: #3c91e6"
						class="btn w-100"
						type="submit"
					>
						S'inscrire
					</button>
				</div>

				<p class="text-muted">
					Vous avez deja un compte ?
					<span id="connexion">Connexion</span>
				</p>
				<p class="text-muted" style="font-size: 0.8rem">
					En vous inscrivant, vous acceptez nos
					<a href="#" target="_blank">Conditions d'utilisation</a>
					et notre
					<a href="#" target="_blank">Politique de confidentialite</a
					>. Si vous avez des questions, veuillez consulter notre
					<a href="#" target="_blank">Centre d'aide</a>.
				</p>
			</form>
		</div>
		<!--Login-->
		<div class="login-form text-center p-4 rounded-2" id="login-form">
			<h3 class="mb-3">CONNEXION</h3>
			<div class="mb-3">
				<b class="text-danger">Connexion echoue</b>
			</div>

			<form action="">
				<div class="mb-3">
					<input
						class="form-control"
						type="email"
						id="login-email"
						name="login-email"
						placeholder="Email"
						required
					/>
				</div>

				<div class="mb-3">
					<input
						class="form-control"
						type="password"
						id="login-password"
						name="login-password"
						placeholder="Mot de passe"
						required
					/>
				</div>

				<div class="mb-3">
					<button
						style="background-color: #3c91e6"
						class="btn w-100"
						type="submit"
					>
						Se connecter
					</button>
				</div>

				<p class="text-muted">
					Vous n'avez pas de compte ?
					<span id="inscription">Inscription</span>
				</p>

				<p class="text-muted" style="font-size: 0.8rem">
					En vous connectant, vous acceptez nos
					<a href="#" target="_blank">Conditions d'utilisation</a>
					et notre
					<a href="#" target="_blank">Politique de confidentialit�</a
					>. Si vous avez des questions, veuillez consulter notre
					<a href="#" target="_blank">Centre d'aide</a>.
				</p>
			</form>
		</div>
		<script src="${pageContext.request.contextPath}/assets/bootstrap/bootstrap.bundle.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/index.js"></script>
	</body>
</html>
<!--<div
				id="signup-form"
				class="signup-form text-center p-4 rounded-2"
				style="display: none"
			>
				<div id="close-signup" class="close text-danger">&times;</div>
				<h3 class="mb-3">INSCRIPTION</h3>
				<div class="mb-3">
					<b class="text-danger">Inscription échoué</b>
				</div>
				<form method="" action="">
					<div class="row">
						<div class="col-md-6">
							<div class="mb-3">
								<input
									class="form-control"
									type="text"
									id="nom"
									name="nom"
									placeholder="Nom"
									required
								/>
							</div>

							<div class="mb-3">
								<input
									class="form-control"
									type="text"
									id="prenom"
									name="prenom"
									placeholder="Prenom"
									required
								/>
							</div>

							<div class="mb-3">
								<input
									class="form-control"
									type="text"
									id="age"
									name="age"
									placeholder="Age"
								/>
							</div>
						</div>

						<div class="col-md-6">
							<div class="mb-3">
								<select
									class="form-select"
									aria-label="Default select example"
									id="role"
									name="role"
									required
								>
									>
									<option selected value="">Role</option>
									<option value="1">PATIENT</option>
									<option value="2">MEDECIN</option>
									<option value="3">SECRETAIRE</option>
								</select>
							</div>

							<div class="mb-3">
								<input
									class="form-control"
									type="text"
									id="matricule"
									name="matricule"
									placeholder="Matricule"
									disabled
								/>
							</div>

							<div class="mb-3">
								<select
									class="form-select"
									id="specialite"
									name="specialite"
									disabled
								>
									<option selected value="">
										Spécialité
									</option>
									<option value="1">Cardiologie</option>
									<option value="2">Dermatologie</option>
									<option value="3">Gynécologie</option>
									<option value="4">Neurologie</option>
								</select>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="mb-3">
							<input
								class="form-control"
								type="email"
								id="email"
								name="email"
								placeholder="Email"
								required
							/>
						</div>

						<div class="mb-3">
							<input
								class="form-control"
								type="password"
								id="password"
								name="password"
								placeholder="Mot de passe"
								required
							/>
						</div>
					</div>

					<div class="mb-3">
						<button
							style="display: block"
							class="btn btn-info w-100"
							type="submit"
						>
							S'inscrire
						</button>
					</div>

					<p class="text-muted">
						Vous avez déjà un compte ?
						<span id="connexion">Connexion</span>
					</p>
					<p class="text-muted" style="font-size: 0.8rem">
						En vous inscrivant, vous acceptez nos
						<a href="/terms-of-service" target="_blank"
							>Conditions d'utilisation</a
						>
						et notre
						<a href="/privacy-policy" target="_blank"
							>Politique de confidentialité</a
						>. Si vous avez des questions, veuillez consulter notre
						<a href="/help" target="_blank">Centre d'aide</a>.
					</p>
				</form>
			</div>-->