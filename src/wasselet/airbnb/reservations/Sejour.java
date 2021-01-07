package wasselet.airbnb.reservations;

import java.util.Date;

import wasselet.airbnb.logements.Logement;

public class Sejour implements SejourInterface {

	private Date dateArrivee;
	private int nbNuits;
	private Logement logement;
	private int nbVoyageurs;

	public Sejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
		super();
		this.dateArrivee = dateArrivee;
		this.nbNuits = nbNuits;
		this.logement = logement;
		this.nbVoyageurs = nbVoyageurs;
	}

	public void afficher() {
		logement.afficher();
		// System.out.println("La date d'arrivée est le " + dateArrivee + " pour " +
		// nbNuits + " nuits.");
		System.out.println("La date d'arrivée est le " + dateArrivee.toString() + " pour " + nbNuits + " nuits.");
		System.out.println(
				"Le prix de ce séjour est de " + logement.getTarifJournalier() * nbNuits * nbVoyageurs + " euros");
	}

	@Override
	public boolean VerificationDateArrivee() {

		return dateArrivee.after(new Date());
	}

	@Override
	public boolean verificationNombreDeNuits() {

		return nbNuits > 0 && nbNuits < 32;
	}

	@Override
	public boolean verificationNombreDeVoyageurs() {

		return nbVoyageurs > 0 && nbVoyageurs <= logement.getNbVoyageursmax();
	}
}
