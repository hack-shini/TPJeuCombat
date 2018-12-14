package joueurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe RodeurTest
 *
 * Contient les tests unitaires de la classe Rodeur
 */
class RodeurTest {

    /**
     * Test que l'attaque de base du rodeur (méthode attaquer) fait perdre l'agilité du joueur en vitalité à l'autre joueur
     */
    @Test
    void GivenAgilite20_When_attaquer_Then_AutreJoueurPerd20() {
        Rodeur rodeur = new Rodeur("Joueur 1", 20,0,20,0);
        Personnage autreJoueur = new Rodeur("Joueur 2",30,0,30,0);
        rodeur.attaquer(autreJoueur);
        assertEquals(autreJoueur.getVitalite(),130);
    }

    /**
     * Vérifie que l'attaque basique (méthode attaquer) d'un rodeur d'agilité 0 n'a aucun impact sur l'autre joueur
     */
    @Test
    void GivenAgilite0_When_attaquer_Then_AutreJoueurPerd0() {
        Rodeur rodeur = new Rodeur("Joueur 1", 20,10,0,10);
        Personnage autreJoueur = new Rodeur("Joueur 2",30,0,30,0);
        rodeur.attaquer(autreJoueur);
        assertEquals(autreJoueur.getVitalite(),150);
    }

    /**
     * Test que l'attaque spéciale du rodeur (méthode combattreDeFaconSpeciale) fait  gagner le niveau du joueur divisé par deux en agilité
     */
    @Test
    void GivenAgilite50Niveau50_When_combattreDeFaconSpeciale_Then_GagneAgilite25() {
        Rodeur rodeur = new Rodeur("Joueur 1", 50,0,50,0);
        rodeur.combattreDeFaconSpeciale(null);
        assertEquals(rodeur.getAgilite(),75);
    }

    /**
     * Test que l'attaque spéciale du rodeur (méthode combattreDeFaconSpeciale) n'a aucun effet sur l'adversaire
     */
    @Test
    void GivenAgilite50Niveau50_When_combattreDeFaconSpeciale_Then_AutreJoueurInchange() {
        Rodeur rodeur = new Rodeur("Joueur 1", 50,0,50,0);
        Personnage autreJoueur = new Rodeur("Joueur 2",30,0,30,0);
        rodeur.combattreDeFaconSpeciale(autreJoueur);
        assertEquals(autreJoueur.getVitalite(),150);
    }


}