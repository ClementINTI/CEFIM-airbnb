package wasselet.airbnb;

import java.util.Date;

import wasselet.airbnb.logements.Appartement;
import wasselet.airbnb.logements.Maison;
import wasselet.airbnb.outils.MaDate;
import wasselet.airbnb.reservations.Sejour;
import wasselet.airbnb.reservations.SejourCourt;
import wasselet.airbnb.reservations.SejourLong;
import wasselet.airbnb.utilisateurs.Hote;
import wasselet.airbnb.utilisateurs.Personne;
import wasselet.airbnb.utilisateurs.Voyageur;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne personne1 = new Personne("clement", "Wasselet", 1);
		Personne personne2 = new Personne("maxime", "Daguet", 2);
		Personne personne3 = new Personne("clement", "Wasselet", 3);

		Hote hote1 = new Hote("clement", "Wasselet", 1, 4);
		Hote hote2 = new Hote("maxime", "Daguet", 2, 7);
		Hote hote3 = new Hote("clement", "Wasselet", 3, 14);

		Voyageur voyageur1 = new Voyageur("Maxime", "Daguet", 7);
		Voyageur voyageur2 = new Voyageur("Maxime", "Daguet", 7);
		Voyageur voyageur3 = new Voyageur("Maxime", "Daguet", 7);

		Maison maison1 = new Maison(hote1, 10, "rue des jolies près", 140, 6, 20, true);
		Maison maison2 = new Maison(hote1, 10, "coloc des petits chats", 140, 6, 15, true);
		Maison maison3 = new Maison(hote1, 10, "Le 112 ne mourra jamais", 140, 6, 0, false);

		Appartement appartement1 = new Appartement(hote1, 10, "pouetpouet", 140, 6, 2, 3);
		Appartement appartement2 = new Appartement(hote1, 10, "rue des jolies près", 140, 6, 4, 4);

		Date date1 = new MaDate(2, 12, 2021);
		Date date2 = new MaDate(2, 12, 2021);
		Date date3 = new MaDate(2, 12, 2021);

		Sejour sejourLong = new SejourLong(date1, 5, maison1, 3);
		Sejour sejourCourt = new SejourCourt(date1, 5, maison1, 3);

		// Reservation reservation1 = new Reservation(1, sejourCourt, voyageur1);
		// Reservation reservation2 = new Reservation(1, sejourLong, voyageur1);

		System.out
				.println("----------------------------  1 / voyageur1 / sejourtCourt  ------------------------------");
		System.out.println();
		// reservation1.afficher();

		System.out.println("----------------------------  2 / voyageur1 / sejourtLong  ------------------------------");
		System.out.println();
		// reservation2.afficher();

	}

}
