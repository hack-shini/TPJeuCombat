package joueurs;

import sorts.Concentration;
import sorts.TirAlArc;

/**
 * Classe Rodeur
 * Elle spécialise la classe abstraite Personnage
 * en définissant l'interface attaqueBasique avec TirAlArc
 * et l'interface attaqueSpeciale avec Concentration
 */
public class Rodeur extends Personnage {

    public Rodeur() {
        this.nom = "Rôdeur";
        this.attaqueBasique = new TirAlArc();
        this.attaqueSpeciale = new Concentration();
    }

    public Rodeur(String nom, int niveau, int force, int agilite, int intelligence) {
        super(nom, niveau, force, agilite, intelligence, new TirAlArc(), new Concentration());
    }

}
