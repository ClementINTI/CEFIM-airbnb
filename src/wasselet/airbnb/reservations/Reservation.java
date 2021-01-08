package wasselet.airbnb.reservations;

import java.util.Date;

import wasselet.airbnb.utilisateurs.Voyageur;

public class Reservation {
	private int identifiant;
	private Sejour sejour;
	private Voyageur voyageur;
	private boolean estValidee;
	private Date dateDeReservation;

	public Reservation(int identifiant, Sejour sejour, Voyageur voyageur) throws Exception {
		if (!sejour.verificationDateArrivee()) {
			throw new Exception("Date d'arrivée non valide");
		}

		if (!sejour.verificationNombreDeNuits()) {
			throw new Exception("Nombre de nuit non valide");
		}

		if (!sejour.verificationNombreDeVoyageurs()) {
			throw new Exception("Nombre de voyageur non valide");
		}

		this.identifiant = identifiant;
		this.sejour = sejour;
		this.voyageur = voyageur;
		this.estValidee = false;
		this.dateDeReservation = new Date();

	}

	public void afficher() {
		boolean sejourLong = sejour.getClass() == SejourLong.class;
		if (sejourLong) {
			System.out.println("Bienvenue chez airbnb");
			System.out.println("Réservation n°1");
		}
		voyageur.afficher();
		System.out.print(" a fait une réservation chez ");
		sejour.afficher();
	}
}
