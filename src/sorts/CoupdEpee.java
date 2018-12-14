package sorts;

import joueurs.Personnage;

/**
 * Classe CoupdEpee. Elle implémente l'interface AttaqueBasique.
 * CoupdEpee est affectée comme attaque basique de Guerrier dans le constructeur de ce dernier.
 *
 * La méthode utiliserArmeDeBase utilise donc un coup d'épée qui inflige des dommages égaux à la force du joueur sur l'adversaire.
 */

public class CoupdEpee implements AttaqueBasique {

    public void utiliserArmeDeBase(Personnage joueur, Personnage adversaire) {
        System.out.println(joueur.getNom() + " utilise Coup d'Epée et inflige " + joueur.getForce() + " dommages");
        adversaire.perdVitalite(joueur.getForce());
    }
}
