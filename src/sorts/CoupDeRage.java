package sorts;

import joueurs.Personnage;

public class CoupDeRage implements AttaqueSpeciale {
    public void utiliserArmeSpeciale(String nomJoueur, int dommages, Personnage autreJoueur) {
        System.out.print(nomJoueur + " utilise coup de rage et inflige " + dommages + " dommages");
        autreJoueur.subirAttaque(dommages);
    }
}
