package sorts;

import joueurs.Personnage;

/**
 * Classe CoupDeRage. Elle implémente l'interface AttaqueSpéciale.
 * CoupdeRage est affectée comme attaque spéciale de Guerrier dans le constructeur de ce dernier.
 *
 * La méthode utiliserArmeSpéciale utilise donc un coup de rage qui inflige des dommages égaux au double de la force du joueur sur l'adversaire.
 * Mais le joueur y perd sa force divisée par deux en vitalité.
 */
public class CoupDeRage implements AttaqueSpeciale {
    public void utiliserArmeSpeciale(Personnage joueur, Personnage adversaire) {
        System.out.println(joueur.getNom() + " utilise Coup de rage et inflige " + joueur.getForce()*2 + " dommages");
        adversaire.perdVitalite(joueur.getForce()*2);
        joueur.perdVitalite(joueur.getForce()/2);
    }
}
