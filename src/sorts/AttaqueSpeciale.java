package sorts;

import joueurs.Personnage;

/**
 * Interface AttaqueSpeciale
 * Sa méthode utiliserArmeSpeciale est implémentée dans les classes dérivées correspondant aux différentes attaques spéciales possibles :
 * CoupDeRage, Concentration, Soin définies dans le même package.
 * On pourrait en ajouter d'autres.
 */
public interface AttaqueSpeciale {
    // public void utiliserArmeSpeciale(String nom, int dommages, Personnage autreJoueur);
    public void utiliserArmeSpeciale(Personnage joueur, Personnage adversaire);
}
