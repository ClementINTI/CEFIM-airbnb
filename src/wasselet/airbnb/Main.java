package wasselet.airbnb;

import wasselet.airbnb.logements.Appartement;
import wasselet.airbnb.logements.Maison;
import wasselet.airbnb.outils.MaDate;
import wasselet.airbnb.reservations.Reservation;
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
		Personne personne4 = new Personne("clement", "Wasselet", 4);
		Personne personne5 = new Personne("clement", "Wasselet", 5);
		Personne personne6 = new Personne("clement", "Wasselet", 6);
		Personne personne7 = new Personne("clement", "Wasselet", 7);
		Personne personne8 = new Personne("clement", "Wasselet", 8);
		Personne personne9 = new Personne("clement", "Wasselet", 9);
		Personne personne10 = new Personne("clement", "Wasselet", 10);

		Hote hote1 = new Hote("clement", "Wasselet", 1, 4);
		Hote hote2 = new Hote("maxime", "Daguet", 2, 7);
		Hote hote3 = new Hote("clement", "Wasselet", 3, 14);
		Hote hote4 = new Hote("clement", "Wasselet", 4, 9);
		Hote hote5 = new Hote("clement", "Wasselet", 5, 1);
		Hote hote6 = new Hote("clement", "Wasselet", 6, 0);
		Hote hote7 = new Hote("clement", "Wasselet", 7, 10);
		Hote hote8 = new Hote("clement", "Wasselet", 8, 8);
		Hote hote9 = new Hote("clement", "Wasselet", 9, 5);
		Hote hote10 = new Hote("clement", "Wasselet", 10, 47);

		Voyageur voyageur = new Voyageur("Maxime", "Daguet", 7);

		Maison logement1 = new Maison(hote1, 10, "rue des jolies près", 140, 6, 20, true);
		Maison logement2 = new Maison(hote1, 10, "coloc des petits chats", 140, 6, 15, true);
		Maison logement3 = new Maison(hote1, 10, "Le 112 ne mourra jamais", 140, 6, 0, false);

		Appartement logement4 = new Appartement(hote1, 10, "pouetpouet", 140, 6, 2, 3);
		Appartement logement5 = new Appartement(hote1, 10, "rue des jolies près", 140, 6, 4, 4);

		MaDate date1 = new MaDate(2, 12, 2021);

		Sejour sejour = new Sejour(date1, 5, logement1, 3);
		SejourLong sejourLong = new SejourLong(date1, 5, logement1, 3, 100);
		SejourCourt sejourCourt = new SejourCourt(date1, 5, logement1, 3, 150);

		Reservation reservation = new Reservation(1, sejourCourt, voyageur);
		Reservation reservation1 = new Reservation(1, sejourLong, voyageur);

		reservation.afficher();

	}

}
