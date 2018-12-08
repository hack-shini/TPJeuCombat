package joueurs;

import sorts.AttaqueBasique;
import sorts.AttaqueSpeciale;
import sorts.BouleDeFeu;
import sorts.Soin;

public class Mage extends Personnage{

    public Mage() {
        this.nom = "Mage";
        this.attaqueBasique = new BouleDeFeu();
        this.attaqueSpeciale = new Soin();
    }

    public Mage(String nom, int niveau, int force, int agilite, int intelligence) {
        super(nom, niveau, force, agilite, intelligence, new BouleDeFeu(), new Soin());
    }


    @Override
    public void attaquer(Personnage autreJoueur) {
        this.attaqueBasique.utiliserArmeDeBase(nom, intelligence, autreJoueur);
    }

    @Override
    public void combattreDeFaconSpeciale(Personnage joueur) {

        this.attaqueSpeciale.utiliserArmeSpeciale(nom, intelligence*2, this);
    }
}
