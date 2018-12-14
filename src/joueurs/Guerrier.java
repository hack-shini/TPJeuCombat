package joueurs;

import sorts.CoupDeRage;
import sorts.CoupdEpee;

/**
 * Classe Guerrier
 * Elle spécialise la classe abstraite Personnage
 * en définissant l'interface attaqueBasique avec CoupdEpee
 * et l'interface attaqueSpeciale avec CoupDeRage
 * CoupdEpee et CoupDeRage sont définies dans un package séparé : le package sort.
 */
public class Guerrier extends Personnage {


    public Guerrier() {
        this.nom = "Guerrier";
        this.attaqueBasique = new CoupdEpee();
        this.attaqueSpeciale = new CoupDeRage();
    }

    public Guerrier(String nom, int niveau, int force, int agilite, int intelligence) {
        super(nom, niveau, force, agilite, intelligence, new CoupdEpee(), new CoupDeRage());

    }

}
