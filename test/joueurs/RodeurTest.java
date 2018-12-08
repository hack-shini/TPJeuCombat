package joueurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RodeurTest {

    @Test
    void GivenAgilite20_When_attaquer_Then_AutreJoueurPerd20() {
        Rodeur rodeur = new Rodeur("Joueur 1", 20,0,20,0);
        Personnage autreJoueur = new Rodeur("Joueur 2",30,0,30,0);
        rodeur.attaquer(autreJoueur);
        assertEquals(autreJoueur.getVitalite(),130);
    }

    @Test
    void GivenAgilite0_When_attaquer_Then_AutreJoueurPerd0() {
        Rodeur rodeur = new Rodeur("Joueur 1", 20,10,0,10);
        Personnage autreJoueur = new Rodeur("Joueur 2",30,0,30,0);
        rodeur.attaquer(autreJoueur);
        assertEquals(autreJoueur.getVitalite(),150);
    }

    @Test
    void GivenAgilite50Niveau50_When_combattreDeFaconSpeciale_Then_GagneAgilite25() {
        Rodeur rodeur = new Rodeur("Joueur 1", 50,0,50,0);
        // Personnage autreJoueur = new Rodeur("Joueur 2",30,0,30,0);
        rodeur.combattreDeFaconSpeciale(null);
        assertEquals(rodeur.getAgilite(),75);
    }

}