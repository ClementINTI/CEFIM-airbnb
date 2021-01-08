package wasselet.airbnb.menu;

import java.util.Date;

import wasselet.airbnb.outils.MaDate;
import wasselet.airbnb.reservations.Reservation;
import wasselet.airbnb.reservations.Sejour;
import wasselet.airbnb.reservations.SejourCourt;
import wasselet.airbnb.reservations.SejourLong;

public class GestionReservations {
	static void listerReservations() {
		System.out.println("-------------------------------------");
		listeDesReservations();
		System.out.println("Saisir une option : ");
		System.out.println("1 : Ajouter un réservation");
		System.out.println("2 : Supprimer un réservation");
		System.out.println("3 : Retour");
		switch (Menu.choix(3)) {
		case 1:
			try {
				ajouterReservation();
			} catch (Exception e) {
				System.out.println("erreur de création de la reservation : " + e.getMessage());
				Menu.scanner.next();
				listerReservations();
			}
			break;
		case 2:
			try {
				supprimerReservation();
			} catch (Exception e) {
				Menu.scanner.next();
				System.out.println("Erreur de suppression de la reservation, numéro non valide");
				listerReservations();
			}
			break;
		case 3:
			Menu.listerMenu();
			break;
		}
	}

	public static void ajouterReservation() throws Exception {
		System.out.println("Pour combien de nuits souhaiter vous réservez ?");
		int nbNuits = Menu.scanner.nextInt();
		System.out.println("Quelle année souahitez-vous arriver ?");
		int annee = Menu.scanner.nextInt();
		System.out.println("Quelle mois souahitez-vous arriver ?");
		int mois = Menu.scanner.nextInt();
		System.out.println("Quelle jour souahitez-vous arriver ?");
		int jour = Menu.scanner.nextInt();
		Date dateArrivee = new MaDate(jour, mois, annee);
		System.out.println("Pour combien de voyageur souhaitez-vous reserver ?");
		int nbVoyageurs = Menu.scanner.nextInt();
		System.out.println("Pour quelle logement reservez-vous ?");
		GestionLogements.listeDesLogements();
		int logement = Menu.scanner.nextInt();
		if (logement < 1 || logement > Menu.listeLogement.size()) {
			throw new Exception("logement incorrect");
		}
		Sejour sejour;
		if (nbNuits < 6) {
			sejour = new SejourCourt(dateArrivee, nbNuits, Menu.listeLogement.get(logement - 1), nbVoyageurs);
		} else {
			sejour = new SejourLong(dateArrivee, nbNuits, Menu.listeLogement.get(logement - 1), nbVoyageurs);
		}
		System.out.println("Entrer l'identifiant de la réservation");
		int identifiant = Menu.scanner.nextInt();
		GestionVoyageurs.listeDesVoyageurs();
		System.out.println("Quelle voyageurs souhaite reserver ?");
		int voyageur = Menu.scanner.nextInt();
		if (voyageur < 1 || voyageur > Menu.listeVoyageur.size()) {
			throw new Exception("voyageur incorrect");
		}

		Reservation reservation = new Reservation(identifiant, sejour, Menu.listeVoyageur.get(voyageur - 1));
		Menu.listeReservation.add(reservation);
		reservation.afficher();
		System.out.println();
		listerReservations();
	}

	public static void supprimerReservation() throws Exception {
		System.out.println("Entrer le numéro de la réservation à supprimer");
		int index = Menu.scanner.nextInt();
		Menu.listeReservation.remove(index - 1);
		listerReservations();
	}

	public static void listeDesReservations() {
		System.out.println("Liste des reservations ");
		int nbrReservation = Menu.listeReservation.size();
		for (int i = 0; i < nbrReservation; i++) {
			System.out.println("reservation n°" + (i + 1));
			Menu.listeReservation.get(i).afficher();
			System.out.println();
		}
	}
}
