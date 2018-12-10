package joueurs;

import sorts.AttaqueBasique;
import sorts.AttaqueSpeciale;
import sorts.Concentration;
import sorts.TirAlArc;

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
