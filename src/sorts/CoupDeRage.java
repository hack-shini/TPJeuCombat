package sorts;

import joueurs.Personnage;

public class CoupDeRage implements AttaqueSpeciale {
    public void utiliserArmeSpeciale(Personnage joueur, Personnage adversaire) {
        System.out.println(joueur.getNom() + " utilise Coup de rage et inflige " + joueur.getForce()*2 + " dommages");
        adversaire.perdVitalite(joueur.getForce()*2);
        System.out.println(joueur.getNom() + " perd " + (joueur.getForce()/2) + " points de vie");
        joueur.perdVitalite(joueur.getForce()/2);
    }
}
