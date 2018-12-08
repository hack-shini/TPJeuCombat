package sorts;

import joueurs.Personnage;

public class CoupDeRage implements AttaqueSpeciale {
    public void utiliserArmeSpeciale(String nomJoueur, int dommages, Personnage autreJoueur) {
        System.out.println(nomJoueur + " utilise Coup de rage et inflige " + dommages + " dommages");
        autreJoueur.perdVitalite(dommages);
    }
}
