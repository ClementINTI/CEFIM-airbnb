package wasselet.airbnb.menu;

import wasselet.airbnb.logements.Appartement;
import wasselet.airbnb.logements.Logement;
import wasselet.airbnb.logements.Maison;

public class GestionLogements {
	static void listerLogements() {
		System.out.println("-------------------------------------");
		listeDesLogements();
		System.out.println("Saisir une option : ");
		System.out.println("1 : Ajouter un logement");
		System.out.println("2 : Supprimer un logement");
		System.out.println("3 : Retour");
		switch (Menu.choix(3)) {
		case 1:
			try {
				ajouterLogement();
			} catch (Exception e) {
				Menu.scanner.next();
				System.out.println("erreur de création du logement : " + e.getMessage());
				listerLogements();
			}
			break;
		case 2:
			try {
				supprimerLogement();
			} catch (Exception e) {
				Menu.scanner.next();
				System.out.println("Erreur de suppression du logement, numéro non valide");
				listerLogements();
			}
			break;
		case 3:
			Menu.listerMenu();
			break;
		}
	}

	public static void ajouterLogement() throws Exception {
		GestionHotes.listeDesHotes();
		System.out.println("A quelle hote appartient le logement ?");
		int hote = Menu.scanner.nextInt();
		if (hote < 1 || hote > Menu.listehote.size()) {
			throw new Exception("hote incorrect");
		}
		System.out.println("Souhaitez vous ajouter une maison ou un appartement ?");
		String typeAppartement = Menu.scanner.next();
		boolean maison = typeAppartement.matches("maison");
		if (!maison && typeAppartement.matches("appartement")) {
			throw new Exception("type de logement incorrect");
		}
		System.out.println("Entrer le tarif par nuit");
		int tarifParNuit = Menu.scanner.nextInt();
		System.out.println("Entrer l'adresse");
		String adresse = Menu.scanner.next();
		System.out.println("Entrer la superficie");
		int superficie = Menu.scanner.nextInt();
		System.out.println("Entrer le nombre de voyageurs");
		int nbVoyageursmax = Menu.scanner.nextInt();
		Logement logement;
		if (maison) {
			System.out.println("Entrer la superficie du jardin");
			int superficieJardin = Menu.scanner.nextInt();
			System.out.println("La Maison possède-t-elle une piscine ? true/false");
			boolean possedePiscine = Menu.scanner.nextBoolean();
			logement = new Maison(Menu.listehote.get(hote - 1), tarifParNuit, adresse, superficie, nbVoyageursmax,
					superficieJardin, possedePiscine);
		} else {
			System.out.println("Entrer la superficie du jardin");
			int numeroEtage = Menu.scanner.nextInt();
			System.out.println("La Maison possède-t-elle une piscine ? true/false");
			int superficieBalcon = Menu.scanner.nextInt();
			logement = new Appartement(Menu.listehote.get(hote - 1), tarifParNuit, adresse, superficie, nbVoyageursmax,
					numeroEtage, superficieBalcon);

		}
		Menu.listeLogement.add(logement);
		logement.afficher();
		System.out.println();
		listerLogements();
	}

	public static void supprimerLogement() throws Exception {
		System.out.println("Entrer le numéro du logement à supprimer");
		int index = Menu.scanner.nextInt();
		Menu.listeLogement.remove(index - 1);
		listerLogements();
	}

	public static void listeDesLogements() {
		System.out.println("Liste des logements ");
		int nbrLogement = Menu.listeLogement.size();
		for (int i = 0; i < nbrLogement; i++) {
			System.out.println("logement n°" + (i + 1));
			Menu.listeLogement.get(i).afficher();
			System.out.println();
		}
	}

}
