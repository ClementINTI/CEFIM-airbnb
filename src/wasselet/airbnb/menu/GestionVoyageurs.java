package wasselet.airbnb.menu;

import wasselet.airbnb.utilisateurs.Voyageur;

public class GestionVoyageurs {
	static void listerVoyageurs() {
		System.out.println("-------------------------------------");
		listeDesVoyageurs();
		System.out.println("Saisir une option : ");
		System.out.println("1 : Ajouter un voyageur");
		System.out.println("2 : Supprimer un voyageur");
		System.out.println("3 : Retour");
		switch (Menu.choix(3)) {
		case 1:
			try {
				ajouterVoyageur();
			} catch (Exception e) {
				Menu.scanner.next();
				System.out.println("erreur de création du voyageur");
				listerVoyageurs();
			}
			break;
		case 2:
			try {
				supprimerVoyageur();
			} catch (Exception e) {
				Menu.scanner.next();
				System.out.println("Erreur de suppression du voyageur, numéro non valide");
				listerVoyageurs();
			}
			break;
		case 3:
			Menu.listerMenu();
			break;
		}
	}

	public static void ajouterVoyageur() throws Exception {
		System.out.println("Entrer le prenom");
		String prenom = Menu.scanner.next();
		System.out.println("Entrer le nom");
		String nom = Menu.scanner.next();
		System.out.println("Entrer l'age");
		int age = Menu.scanner.nextInt();
		Voyageur voyageur = new Voyageur(prenom, nom, age);
		Menu.listeVoyageur.add(voyageur);
		voyageur.afficher();
		System.out.println();
		listerVoyageurs();
	}

	public static void supprimerVoyageur() throws Exception {
		System.out.println("Entrer le numéro du voyageur à supprimer");
		int index = Menu.scanner.nextInt();
		Menu.listeVoyageur.remove(index - 1);
		listerVoyageurs();
	}

	public static void listeDesVoyageurs() {
		System.out.println("Liste des voyageurs ");
		int nbrVoyageur = Menu.listeVoyageur.size();
		for (int i = 0; i < nbrVoyageur; i++) {
			System.out.println("voyageur n°" + (i + 1));
			Menu.listeVoyageur.get(i).afficher();
			System.out.println();
		}
	}
}
