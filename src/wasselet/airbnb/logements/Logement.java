package wasselet.airbnb.logements;

import wasselet.airbnb.utilisateurs.Hote;

public abstract class Logement {

	private Hote hote;
	private int tarifJournalier;
	private String adresse;
	private int superficie;
	private int nbVoyageursmax;

	public Logement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursmax) {
		super();
		this.hote = hote;
		this.tarifJournalier = tarifParNuit;
		this.adresse = adresse;
		this.superficie = superficie;
		this.nbVoyageursmax = nbVoyageursmax;
	}

	public Hote getHote() {
		return hote;
	}

	public String getAdresse() {
		return adresse;
	}

	public int getTarifJournalier() {
		return tarifJournalier;
	}

	public int getSuperficie() {
		return superficie;
	}

	public int getNbVoyageursmax() {
		return nbVoyageursmax;
	}

	public abstract int getSuperficieTotal();

	public abstract void afficher();
}
