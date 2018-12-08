package sorts;

import joueurs.Personnage;

public class Concentration implements AttaqueSpeciale {
    public void utiliserArmeSpeciale(String nomJoueur, int gain, Personnage joueur) {
        joueur.gagneAgilite(gain);

        System.out.println(nomJoueur + " utilise Concentration et gagne " + gain + " en agilité");
    }
}
