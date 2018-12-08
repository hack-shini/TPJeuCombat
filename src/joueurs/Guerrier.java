package joueurs;

import sorts.CoupDeRage;
import sorts.CoupdEpee;

public class Guerrier extends Personnage {

    // CoupdEpee coupdEpee = new CoupdEpee();


    public Guerrier() {
        this.nom = "Guerrier";
        this.attaqueBasique = new CoupdEpee();
        this.attaqueSpeciale = new CoupDeRage();
    }

    public Guerrier(String nom, int niveau, int force, int agilite, int intelligence) {
        super(nom, niveau, force, agilite, intelligence, new CoupdEpee(), new CoupDeRage());

    }

    @Override
    public void attaquer(Personnage autreJoueur) {
        attaqueBasique.utiliserArmeDeBase(nom, force, autreJoueur);

    }

    @Override
    public void combattreDeFaconSpeciale(Personnage autreJoueur) {
        attaqueSpeciale.utiliserArmeSpeciale(nom,force*2, autreJoueur);
        this.perdVitalite(force / 2);
        System.out.println(nom + " perd " + (force/2) + " points de vie");
    }

}
