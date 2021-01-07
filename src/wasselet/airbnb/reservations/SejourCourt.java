package wasselet.airbnb.reservations;

import java.util.Date;

import wasselet.airbnb.logements.Logement;

public class SejourCourt extends Sejour implements ConditionsTarifairesInterface {

	public SejourCourt(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
		super(dateArrivee, nbNuits, logement, nbVoyageurs);
	}

	@Override
	public boolean beneficiePromotion() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		super.afficher();
		System.out.println();
	}

	@Override
	public boolean verificationNombreDeNuits() {
		int nbNuits = getNbNuits();
		return nbNuits > 0 && nbNuits < 32;
	}

	@Override
	public void miseAJourDuTarif() {
		// TODO Auto-generated method stub
		tarif = getLogement().getTarifJournalier() * getNbNuits();

	}
}
