package wasselet.airbnb.menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import wasselet.airbnb.utilisateurs.Hote;

public class Menu {

	static Scanner scanner;

	static void listerMenu() {
		System.out.println("-------------------------------------");
		System.out.println("Saisir une option :");
		System.out.println("1 : Liste des hôtes");
		System.out.println("2 : Liste des logements");
		System.out.println("3 : Liste des voyageurs");
		System.out.println("4 : Liste des réservations");
		System.out.println("5 : Fermer le programme");

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

	static ArrayList<Hote> listehote = new ArrayList<Hote>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenue chez AirBnB");
		scanner = new Scanner(System.in);
		// scanner.useDelimiter("\n");
		listerMenu();
		choix(5);
		GestionHotes.listerHotes();
		System.out.println("Fin");
		scanner.close();
	}

}
