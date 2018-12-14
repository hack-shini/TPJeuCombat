package sorts;

import joueurs.Personnage;

/**
 * Classe BouleDeFeu. Elle implémente l'interface AttaqueBasique.
 * BouleDeFeu est affectée comme attaque basique de Mage dans le constructeur de ce dernier.
 *
 * La méthode utiliserArmeDeBase utilise donc une boule de feu qui inflige des dommages égaux à l'intelligence du joueur sur l'adversaire.
 */

public class BouleDeFeu implements AttaqueBasique {

    public void utiliserArmeDeBase(Personnage joueur, Personnage adversaire) {
        System.out.println(joueur.getNom() + " utilise Boule de feu et inflige " + joueur.getIntelligence() + " dommages");
        adversaire.perdVitalite(joueur.getIntelligence());
    }
}
