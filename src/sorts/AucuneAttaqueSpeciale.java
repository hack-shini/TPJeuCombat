package sorts;

import joueurs.Personnage;

public class AucuneAttaqueSpeciale implements AttaqueSpeciale {

    @Override
    public void utiliserArmeSpeciale(Personnage joueur, Personnage adversaire) {
        System.out.print("Je n'utilise aucune arme spéciale");
    }
}
