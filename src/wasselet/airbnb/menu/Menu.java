package wasselet.airbnb.menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import wasselet.airbnb.logements.Appartement;
import wasselet.airbnb.logements.Logement;
import wasselet.airbnb.logements.Maison;
import wasselet.airbnb.reservations.Reservation;
import wasselet.airbnb.utilisateurs.Hote;
import wasselet.airbnb.utilisateurs.Voyageur;

public class Menu {

	static Scanner scanner;
	static ArrayList<Hote> listehote = new ArrayList<Hote>();
	static ArrayList<Logement> listeLogement = new ArrayList<Logement>();
	static ArrayList<Voyageur> listeVoyageur = new ArrayList<Voyageur>();
	static ArrayList<Reservation> listeReservation = new ArrayList<Reservation>();

	static void listerMenu() {
		System.out.println("-------------------------------------");
		System.out.println("Saisir une option :");
		System.out.println("1 : Liste des hôtes");
		System.out.println("2 : Liste des logements");
		System.out.println("3 : Liste des voyageurs");
		System.out.println("4 : Liste des réservations");
		System.out.println("5 : Fermer le programme");
		switch (Menu.choix(5)) {
		case 1:
			GestionHotes.listerHotes();

			break;
		case 2:
			GestionLogements.listerLogements();
			break;
		case 3:
			GestionVoyageurs.listerVoyageurs();
			break;
		case 4:
			GestionReservations.listerReservations();
			break;
		case 5:
			System.out.println("Fin");
			break;
		}

	}

	static int choix(int maxValue) {
		try {
			int choix = scanner.nextInt();
			if (choix > 0 && choix <= maxValue) {
				return choix;
			} else {
				throw new Exception();
			}
		} catch (InputMismatchException e) {
			traiterScannerException(maxValue);
		} catch (NoSuchElementException e) {
			traiterScannerException(maxValue);

		} catch (IllegalStateException e) {
			traiterScannerException(maxValue);

		} catch (Exception e) {
			System.out.println("Veuillez saisir un entier compris entre 1 et " + maxValue);
		} finally {
		}
		return choix(maxValue);
	}

	private static void traiterScannerException(int maxValue) {
		System.out.println("Veuillez saisir un entier compris entre 1 et " + maxValue);
		scanner.next();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hote hote1 = new Hote("clement", "Wasselet", 1, 4);
		Hote hote2 = new Hote("maxime", "Daguet", 2, 7);
		listehote.add(hote1);
		listehote.add(hote2);
		Voyageur voyageur1 = new Voyageur("Maxime", "Daguet", 7);
		listeVoyageur.add(voyageur1);
		Maison maison1 = new Maison(hote1, 10, "rue des jolies près", 140, 6, 20, true);
		Maison maison2 = new Maison(hote1, 10, "coloc des petits chats", 140, 6, 15, true);
		Maison maison3 = new Maison(hote1, 10, "Le 112 ne mourra jamais", 140, 6, 0, false);
		Appartement appartement1 = new Appartement(hote1, 10, "pouetpouet", 140, 6, 2, 3);
		Appartement appartement2 = new Appartement(hote1, 10, "rue des jolies près", 140, 6, 4, 4);
		listeLogement.add(maison1);
		listeLogement.add(maison2);
		listeLogement.add(maison3);
		listeLogement.add(appartement1);
		listeLogement.add(appartement2);
		System.out.println("Bienvenue chez AirBnB");
		scanner = new Scanner(System.in);
		// scanner.useDelimiter("\n");
		listerMenu();
		scanner.close();
	}

}
