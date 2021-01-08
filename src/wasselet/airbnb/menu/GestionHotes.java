package wasselet.airbnb.menu;

import wasselet.airbnb.utilisateurs.Hote;

public class GestionHotes {
	static void listerHotes() {
		System.out.println("-------------------------------------");
		listeDesHotes();
		System.out.println("Saisir une option : ");
		System.out.println("1 : Ajouter un hôte");
		System.out.println("2 : Supprimer un hôte");
		System.out.println("3 : Retour");
		switch (Menu.choix(3)) {
		case 1:
			try {
				ajouterHote();
			} catch (Exception e) {
				Menu.scanner.next();
				System.out.println("erreur de création de l'hote");
				listerHotes();
			}
			break;
		case 2:
			try {
				supprimerHote();
			} catch (Exception e) {
				Menu.scanner.next();
				System.out.println("Erreur de suppression de l'hote, numéro non valide");
				listerHotes();
			}
			break;
		case 3:
			Menu.listerMenu();
			break;
		}
	}

	public static void ajouterHote() throws Exception {
		System.out.println("Entrer le prenom");
		String prenom = Menu.scanner.next();
		System.out.println("Entrer le nom");
		String nom = Menu.scanner.next();
		System.out.println("Entrer l'age");
		int age = Menu.scanner.nextInt();
		System.out.println("Entrer le temps de réponse en jours");
		int delaiDeReponse = Menu.scanner.nextInt();
		Hote hote = new Hote(prenom, nom, age, delaiDeReponse);
		Menu.listehote.add(hote);
		hote.afficher();
		System.out.println();
		listerHotes();
	}

	public static void supprimerHote() throws Exception {
		System.out.println("Entrer le numéro de l'hote à supprimer");
		int index = Menu.scanner.nextInt();
		Menu.listehote.remove(index - 1);
		listerHotes();
	}

	public static void listeDesHotes() {
		System.out.println("Liste des hôtes ");
		int nbrHote = Menu.listehote.size();
		for (int i = 0; i < nbrHote; i++) {
			System.out.println("hote n°" + (i + 1));
			Menu.listehote.get(i).afficher();
			System.out.println();
		}
	}

}
