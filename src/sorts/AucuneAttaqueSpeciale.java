package sorts;

import joueurs.Personnage;

public class AucuneAttaqueSpeciale implements AttaqueSpeciale {

    @Override
    public void utiliserArmeSpeciale(String nom, int dommages, Personnage joueur) {
        System.out.print("Je n'utilise aucune arme spéciale");
    }
}
