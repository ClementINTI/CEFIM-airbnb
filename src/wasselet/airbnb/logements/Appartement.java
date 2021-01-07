package wasselet.airbnb.logements;

import wasselet.airbnb.utilisateurs.Hote;

public class Appartement extends Logement {

	private int numeroEtage;
	private int superficieBalcon;

	public Appartement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursmax, int numeroEtage,
			int superficieBalcon) {
		super(hote, tarifParNuit, adresse, superficie, nbVoyageursmax);
		this.numeroEtage = numeroEtage;
		this.superficieBalcon = superficieBalcon;
	}

	@Override
	public int getSuperficieTotal() {
		// TODO Auto-generated method stub
		return getSuperficie() + superficieBalcon;
	}

	public void afficher() {
		getHote().afficher();
		System.out.println();
		System.out
				.println("Le logement est un appartement situé " + getAdresse() + " au " + numeroEtage + "ème étage.");
		System.out.println("Superficie : " + getSuperficieTotal() + "m2");
		if (superficieBalcon == 0) {
			System.out.println("Balcon : Non");
		} else {
			System.out.println("Balcon : Oui (" + getSuperficieTotal() + "m2)");

		}

	}
}
