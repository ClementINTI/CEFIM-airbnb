package wasselet.airbnb.outils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utile {

	private static final String PATTERN = "dd/MM/yyyy";
	private static final SimpleDateFormat FORMAT = new SimpleDateFormat(PATTERN);

	public static Date creerDate(int jour, int mois, int annee) {

		return new Date(annee - 1900, mois - 1, jour);
	}

	public static String formatDate(Date date) {
		return FORMAT.format(date);
	}

}
