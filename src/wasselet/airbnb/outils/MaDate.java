package wasselet.airbnb.outils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MaDate extends Date {

	private static final String PATTERN = "dd/MM/yyyy";
	private static final SimpleDateFormat FORMAT = new SimpleDateFormat(PATTERN);

	public MaDate(int jour, int mois, int annee) {
		super(annee - 1900, mois - 1, jour);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return FORMAT.format(this);
	}
}
