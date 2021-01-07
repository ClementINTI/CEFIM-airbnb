package wasselet.airbnb.reservations;

import java.util.Date;

import wasselet.airbnb.logements.Logement;

public class SejourCourt extends Sejour implements ConditionsTarifairesInterface {
	private int tarif;

	public SejourCourt(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
		super(dateArrivee, nbNuits, logement, nbVoyageurs);
		this.tarif = logement.getTarifJournalier() * nbNuits * nbVoyageurs;
	}

	@Override
	public boolean beneficiePromotion() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getTarif() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		super.afficher();
		System.out.println();
	}
}
