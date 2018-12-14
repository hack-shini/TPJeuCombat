package sorts;

import joueurs.Personnage;

/**
 * Classe Concentration. Elle implémente l'interface AttaqueSpéciale.
 * Concentration est affectée comme attaque spéciale de Rodeur dans le constructeur de ce dernier.
 *
 * La méthode utiliserArmeSpéciale utilise donc la concentration et fait gagner au joueur son niveau divisé par deux en agilité.
 * L'adversaire n'est pas touché.
 */
public class Concentration implements AttaqueSpeciale {
    public void utiliserArmeSpeciale(Personnage joueur, Personnage adversaire) {

        joueur.gagneAgilite(joueur.getNiveau()/2);
        System.out.println(joueur.getNom() + " utilise Concentration et gagne " + joueur.getNiveau()/2 + " en agilité");
    }
}
