package wasselet.airbnb.reservations;

import java.util.Date;

import wasselet.airbnb.logements.Logement;

public class SejourLong extends Sejour implements ConditionsTarifairesInterface {

	private static final int PROMOTION_EN_POURCENTAGE = 20;
	private int promotion;

	public SejourLong(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
		super(dateArrivee, nbNuits, logement, nbVoyageurs);
		this.promotion = (super.getTarif() * PROMOTION_EN_POURCENTAGE) / 100;
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

		System.out.println(" (" + promotion + " euros de promotion).");
	}

	@Override
	public boolean verificationNombreDeNuits() {
		int nbNuits = getNbNuits();
		return nbNuits > 0 && nbNuits < 32;
	}

	@Override
	public void miseAJourDuTarif() {
		// TODO Auto-generated method stub

	}
}
