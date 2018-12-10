package sorts;

import joueurs.Personnage;

public class CoupDeRage implements AttaqueSpeciale {
    public void utiliserArmeSpeciale(Personnage joueur, Personnage adversaire) {
        System.out.println(joueur.getNom() + " utilise Coup de rage et inflige " + joueur.getForce()*2 + " dommages");
        adversaire.perdVitalite(joueur.getForce()*2);
        joueur.perdVitalite(joueur.getForce()/2);
    }
}
