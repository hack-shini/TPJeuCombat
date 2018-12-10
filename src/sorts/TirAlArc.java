package sorts;

import joueurs.Personnage;

public class TirAlArc implements AttaqueBasique {
    public void utiliserArmeDeBase(Personnage joueur, Personnage adversaire) {
        System.out.println(joueur.getNom() + " utilise Tir à l'Arc et inflige " + joueur.getAgilite() + " dommages");
        adversaire.perdVitalite(joueur.getAgilite());
    }
}
