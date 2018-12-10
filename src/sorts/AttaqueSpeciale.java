package sorts;

import joueurs.Personnage;

public interface AttaqueSpeciale {
    // public void utiliserArmeSpeciale(String nom, int dommages, Personnage autreJoueur);
    public void utiliserArmeSpeciale(Personnage joueur, Personnage adversaire);
}
