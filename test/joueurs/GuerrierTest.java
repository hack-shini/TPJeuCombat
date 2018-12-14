package joueurs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Classe GuerrierTest
 *
 * Contient les tests unitaires de la classe Guerrier
 */
public class GuerrierTest {

    /**
     * Test que l'attaque de base (méthode attaquer) fait perdre la valeur de la force en vitalité
     */
    @Test
    void Given_Force10_When_attaquer_Then_AutreJoueurPerd10() {
        Guerrier guerrier = new Guerrier("Joueur 1", 10, 10, 0, 0);
        Personnage autreJoueur = new Guerrier("Joueur 2", 10, 10, 0, 0);
        guerrier.attaquer(autreJoueur);
        assertEquals(autreJoueur.getVitalite(),40);
    }

    /**
     * Test que l'attaque spéciale (méthode combattreDeFaconSpeciale) fait perdre la force fois deux en vitalité à l'autre joueur
     */
    @Test
    void Given_Force10_When_combattreDeFaconSpeciale_Then_AutreJoueurPerd20() {
        Guerrier guerrier = new Guerrier("Joueur 1", 10, 10, 0, 0);
        Personnage autreJoueur = new Guerrier("Joueur 2", 10, 10, 0, 0);
        guerrier.combattreDeFaconSpeciale(autreJoueur);
        assertEquals(autreJoueur.getVitalite(),30);
    }

    /**
     * Test que l'attaque spéciale (méthode CombattreDeFaconSpeciale) fait perdre la force divisée par deux en vitalité au joueur
     * qui lance l'attaque.
     */
    @Test
    void Given_Force10_When_combattreDeFaconSpeciale_Then_Perd5() {
        Guerrier guerrier = new Guerrier("Joueur 1", 10, 10, 0, 0);
        Personnage autreJoueur = new Guerrier("Joueur 2", 10, 10, 0, 0);
        guerrier.combattreDeFaconSpeciale(autreJoueur);
        assertEquals(guerrier.getVitalite(),45);
    }
}