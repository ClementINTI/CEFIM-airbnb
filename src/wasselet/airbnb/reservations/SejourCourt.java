package wasselet.airbnb.reservations;

import java.util.Date;

import wasselet.airbnb.logements.Logement;

public class SejourCourt extends Sejour implements ConditionsTarifairesInterface {
	private int tarif;

	public SejourCourt(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs, int tarif) {
		super(dateArrivee, nbNuits, logement, nbVoyageurs);
		this.tarif = tarif;
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

}
