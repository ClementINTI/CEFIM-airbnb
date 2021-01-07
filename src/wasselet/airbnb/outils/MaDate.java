package wasselet.airbnb.outils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * permet de créer et afficher une date au format dd/MM/yyyy
 * 
 * @author cleme
 *
 */
public class MaDate extends Date {

	private static final String PATTERN = "dd/MM/yyyy";
	private static final SimpleDateFormat FORMAT = new SimpleDateFormat(PATTERN);

	/**
	 * Creer une date en utilisant le constructeur de Date.
	 * 
	 * @param jour  entre 1-31
	 * @param mois  entre 1 et 12
	 * @param annee entrer année réel
	 */
	public MaDate(int jour, int mois, int annee) {
		super(annee - 1900, mois - 1, jour);
	}

	/**
	 * retourne la date sous un string au format dd/MM/yyyy
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return FORMAT.format(this);
	}
}
