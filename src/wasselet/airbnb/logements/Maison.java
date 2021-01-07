package wasselet.airbnb.logements;

import wasselet.airbnb.utilisateurs.Hote;

public class Maison extends Logement {

	private int superficieJardin;
	private boolean possedePiscine;

	public Maison(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursmax, int superficieJardin,
			boolean possedePiscine) {
		super(hote, tarifParNuit, adresse, superficie, nbVoyageursmax);
		this.superficieJardin = superficieJardin;
		this.possedePiscine = possedePiscine;
	}

	@Override
	public int getSuperficieTotal() {
		// TODO Auto-generated method stub
		return getSuperficie() + superficieJardin;
	}

	public void afficher() {
		getHote().afficher();
		System.out.println();
		System.out.println("Le logement est une maison située " + getAdresse());
		System.out.println("Superficie : " + getSuperficieTotal() + "m2");
		if (superficieJardin == 0) {
			System.out.println("Jardin : Non");
		} else {
			System.out.println("Jardin : Oui (" + getSuperficieTotal() + "m2)");
		}
		if (possedePiscine) {
			System.out.println("Piscine : Oui");
		} else {
			System.out.println("Piscine : Non");
		}
	}
}
