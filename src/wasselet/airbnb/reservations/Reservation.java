package wasselet.airbnb.reservations;

import java.util.Date;

import wasselet.airbnb.utilisateurs.Voyageur;

public class Reservation {
	private int identifiant;
	private Sejour sejour;
	private Voyageur voyageur;
	private boolean estValidee;
	private Date dateDeReservation;

	public Reservation(int identifiant, Sejour sejour, Voyageur voyageur) {
		super();
		this.identifiant = identifiant;
		this.sejour = sejour;
		this.voyageur = voyageur;
		this.estValidee = false;
		this.dateDeReservation = new Date();
	}

	public void afficher() {
		if (sejour.getClass() == SejourLong.class) {
			System.out.println("Bienvenue chez airbnb");

		}
		voyageur.afficher();
		System.out.print(" a fait une réservation chez ");
		sejour.afficher();
	}
}
