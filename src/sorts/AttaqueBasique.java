package sorts;

import joueurs.Personnage;

/**
 * Interface AttaqueBasique
 * Sa méthode utiliserArmeDeBase est implémentée dans les classes dérivées correspondant aux différentes attaques basiques possibles :
 * CoupdEpee, TirAlArc, BouleDeFeu définies dans le même package.
 * On pourrait en ajouter d'autres.
 */

public interface AttaqueBasique {
    public void utiliserArmeDeBase(Personnage joueur, Personnage adversaire);
}
