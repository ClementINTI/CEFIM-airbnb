package wasselet.airbnb.reservations;

import java.util.Date;

import wasselet.airbnb.logements.Logement;

public class SejourLong extends Sejour implements ConditionsTarifairesInterface {

	private static final int PROMOTION_EN_POURCENTAGE = 20;
	private int promotion;
	private int tarif;

	public SejourLong(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs, int tarif) {
		super(dateArrivee, nbNuits, logement, nbVoyageurs);
		this.tarif = tarif;
		this.promotion = (tarif * PROMOTION_EN_POURCENTAGE) / 100;
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
