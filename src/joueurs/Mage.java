package joueurs;

import sorts.BouleDeFeu;
import sorts.Soin;

/**
 * Classe Mage
 * Elle spécialise la classe abstraite Personnage
 * en définissant l'interface attaqueBasique avec BouleDeFeu
 * et l'interface attaqueSpeciale avec Soin
 */
public class Mage extends Personnage{

    public Mage() {
        this.nom = "Mage";
        this.attaqueBasique = new BouleDeFeu();
        this.attaqueSpeciale = new Soin();
    }

    public Mage(String nom, int niveau, int force, int agilite, int intelligence) {
        super(nom, niveau, force, agilite, intelligence, new BouleDeFeu(), new Soin());
    }

}
