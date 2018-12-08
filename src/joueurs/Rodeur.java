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

    @Override
    public void attaquer(Personnage autreJoueur) {
        this.attaqueBasique.utiliserArmeDeBase(nom, agilite, autreJoueur);
    }

    @Override
    public void combattreDeFaconSpeciale(Personnage joueur) {
        this.attaqueSpeciale.utiliserArmeSpeciale(nom, niveau/2, this);
    }
}
