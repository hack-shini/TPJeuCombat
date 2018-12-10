package sorts;

import joueurs.Personnage;

public class BouleDeFeu implements AttaqueBasique {

    public void utiliserArmeDeBase(Personnage joueur, Personnage adversaire) {
        System.out.println(joueur.getNom() + " utilise Boule de feu et inflige " + joueur.getIntelligence() + " dommages");
        adversaire.perdVitalite(joueur.getIntelligence());
    }
}
