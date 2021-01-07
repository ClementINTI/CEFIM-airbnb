package wasselet.airbnb.reservations;

import java.util.Date;

import wasselet.airbnb.logements.Logement;

public abstract class Sejour implements SejourInterface {

	private Date dateArrivee;
	private int nbNuits;
	private Logement logement;
	private int nbVoyageurs;
	protected int tarif;

	public int getNbNuits() {
		return nbNuits;
	}

	public Sejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
		super();
		this.dateArrivee = dateArrivee;
		this.nbNuits = nbNuits;
		this.logement = logement;
		this.nbVoyageurs = nbVoyageurs;
		miseAJourDuTarif();
		// this.tarif = logement.getTarifJournalier() * nbNuits;
	}

	public int getTarif() {
		return tarif;
	}

	public void afficher() {
		logement.afficher();
		// System.out.println("La date d'arrivée est le " + dateArrivee + " pour " +
		// nbNuits + " nuits.");
		System.out.println("La date d'arrivée est le " + dateArrivee.toString() + " pour " + nbNuits + " nuits.");
		System.out.print("Le prix de ce séjour est de " + tarif + " euros");

	}

	@Override
	public boolean VerificationDateArrivee() {

		return dateArrivee.after(new Date());
	}

	@Override
	public boolean verificationNombreDeVoyageurs() {

		return nbVoyageurs > 0 && nbVoyageurs <= logement.getNbVoyageursmax();
	}

	public abstract void miseAJourDuTarif();

	public Logement getLogement() {
		return logement;
	}

}
