package sorts;

import joueurs.Personnage;

/**
 * Classe TirAlArc. Elle implémente l'interface AttaqueBasique.
 * TirAlArc est affectée comme attaque basique de Rodeur dans le constructeur de ce dernier.
 *
 * La méthode utiliserArmeDeBase utilise donc un tir à l'arc qui inflige des dommages égaux à l'agilité du joueur sur l'adversaire.
 */
public class TirAlArc implements AttaqueBasique {
    public void utiliserArmeDeBase(Personnage joueur, Personnage adversaire) {
        System.out.println(joueur.getNom() + " utilise Tir à l'Arc et inflige " + joueur.getAgilite() + " dommages");
        adversaire.perdVitalite(joueur.getAgilite());
    }
}
