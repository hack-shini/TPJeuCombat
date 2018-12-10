package sorts;

import joueurs.Personnage;

public class Soin implements AttaqueSpeciale {
    public void utiliserArmeSpeciale(Personnage joueur, Personnage adversaire) {
        int gainReel = joueur.gagneVitalite(joueur.getIntelligence()*2);

        System.out.println(joueur.getNom() + " utilise Soin et gagne " + gainReel + " points de vie");
    }
}
