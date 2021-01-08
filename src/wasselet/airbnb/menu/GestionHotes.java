package wasselet.airbnb.menu;

import wasselet.airbnb.utilisateurs.Hote;

public class GestionHotes {
	static void listerHotes() {
		System.out.println("-------------------------------------");
		listeDesHotes();
		System.out.println("Saisir une option : ");
		System.out.println("1 : Ajouter un h�te");
		System.out.println("2 : Supprimer un h�te");
		System.out.println("3 : Retour");
		switch (Menu.choix(3)) {
		case 1:
			try {
				ajouterHote();
			} catch (Exception e) {
				Menu.scanner.next();
				System.out.println("erreur de cr�ation de l'hote");
				listerHotes();
			}
			break;
		case 2:
			try {
				supprimerHote();
			} catch (Exception e) {
				Menu.scanner.next();
				System.out.println("Erreur de suppression de l'hote, num�ro non valide");
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
		System.out.println("Entrer le temps de r�ponse en jours");
		int delaiDeReponse = Menu.scanner.nextInt();
		Hote hote = new Hote(prenom, nom, age, delaiDeReponse);
		Menu.listehote.add(hote);
		hote.afficher();
		System.out.println();
		listerHotes();
	}

	public static void supprimerHote() throws Exception {
		System.out.println("Entrer le num�ro de l'hote � supprimer");
		int index = Menu.scanner.nextInt();
		Menu.listehote.remove(index - 1);
		listerHotes();
	}

	public static void listeDesHotes() {
		System.out.println("Liste des h�tes ");
		int nbrHote = Menu.listehote.size();
		for (int i = 0; i < nbrHote; i++) {
			System.out.println("hote n�" + (i + 1));
			Menu.listehote.get(i).afficher();
			System.out.println();
		}
	}

}
