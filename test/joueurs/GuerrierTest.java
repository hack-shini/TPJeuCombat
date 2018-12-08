package joueurs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GuerrierTest {

    @Test
    void Given_Force10_When_attaquer_Then_AutreJoueurPerd10() {
        Guerrier guerrier = new Guerrier("Joueur 1", 10, 10, 0, 0);
        Personnage autreJoueur = new Guerrier("Joueur 2", 10, 10, 0, 0);
        guerrier.attaquer(autreJoueur);
        assertEquals(autreJoueur.getVie(),40);
    }

    @Test
    void Given_Force10_When_combattreDeFaconSpeciale_Then_AutreJoueurPerd20() {
        Guerrier guerrier = new Guerrier("Joueur 1", 10, 10, 0, 0);
        Personnage autreJoueur = new Guerrier("Joueur 2", 10, 10, 0, 0);
        guerrier.combattreDeFaconSpeciale(autreJoueur);
        assertEquals(autreJoueur.getVie(),30);
    }

    @Test
    void Given_Force10_When_combattreDeFaconSpeciale_Then_Perd5() {
        Guerrier guerrier = new Guerrier("Joueur 1", 10, 10, 0, 0);
        Personnage autreJoueur = new Guerrier("Joueur 2", 10, 10, 0, 0);
        guerrier.combattreDeFaconSpeciale(autreJoueur);
        assertEquals(guerrier.getVie(),45);
    }
}