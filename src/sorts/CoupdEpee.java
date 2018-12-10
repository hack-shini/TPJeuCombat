package sorts;

import joueurs.Personnage;

public class CoupdEpee implements AttaqueBasique {

    public void utiliserArmeDeBase(Personnage joueur, Personnage adversaire) {
        System.out.println(joueur.getNom() + " utilise Coup d'Epée et inflige " + joueur.getForce() + " dommages");
        adversaire.perdVitalite(joueur.getForce());
    }
}
