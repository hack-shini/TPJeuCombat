package sorts;

import joueurs.Personnage;

public class Concentration implements AttaqueSpeciale {
    public void utiliserArmeSpeciale(Personnage joueur, Personnage adversaire) {

        joueur.gagneAgilite(joueur.getNiveau()/2);
        System.out.println(joueur.getNom() + " utilise Concentration et gagne " + joueur.getNiveau()/2 + " en agilité");
    }
}
