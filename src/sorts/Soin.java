package sorts;

import joueurs.Personnage;

public class Soin implements AttaqueSpeciale {
    public void utiliserArmeSpeciale(String nomJoueur, int gain, Personnage joueur) {
        int gainReel = joueur.gagneVitalite(gain);

        System.out.println(nomJoueur + " utilise Soin et gagne " + gainReel + " points de vie");
    }
}
