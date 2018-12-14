package sorts;

import joueurs.Personnage;

/**
 * Classe Soin. Elle implémente l'interface AttaqueSpéciale.
 * Soin est affectée comme attaque spéciale de Mage dans le constructeur de ce dernier.
 *
 * La méthode utiliserArmeSpéciale utilise donc le soin et fait gagner au joueur son intelligence fois deux en vitalité.
 * Celle-ci ne peut toutefois pas dépasser sa valeur intitiale.
 * L'adversaire n'est pas touché.
 */
public class Soin implements AttaqueSpeciale {
    public void utiliserArmeSpeciale(Personnage joueur, Personnage adversaire) {
        int gainReel = joueur.gagneVitalite(joueur.getIntelligence()*2);

        System.out.println(joueur.getNom() + " utilise Soin et gagne " + gainReel + " en vitalité");
    }
}
