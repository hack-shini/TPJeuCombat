package joueurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    // On vérifie que l'attaque basique effectue des dommages égaux à l'intelligence du joueur sur l'adversaire
    @Test
    void Given_Intelligence10_When_attaquer_Then_AutreJoueurPerd10() {
        Mage mage = new Mage ("Joueur 1", 10,0,0,10);
        Personnage autreJoueur = new Mage("Joueur 2", 20, 0, 0, 20);
        mage.attaquer(autreJoueur);
        assertEquals(autreJoueur.getVitalite(),90);
    }

    @Test
    void Given_Intelligence0_When_attaquer_Then_AutreJoueurPerd0() {
        Mage mage = new Mage ("Joueur 1", 10,10,0,0);
        Personnage autreJoueur = new Mage("Joueur 2", 20, 0, 0, 20);
        mage.attaquer(autreJoueur);
        assertEquals(autreJoueur.getVitalite(),100);
    }

    // on vérifie que l'attaque spéciale fait gagner le double de l'intelligence en points de vie au Mage
    @Test
    void Given_Intelligence10_When_combattreDeFaconSpeciale_Then_Gagne20EnVitalite() {
        Mage mage = new Mage ("Joueur 1", 10,0,0,10);
        Personnage autreJoueur = new Mage("Joueur 2",30,0,0,30);
        autreJoueur.attaquer(mage);
        mage.combattreDeFaconSpeciale(null);
        assertEquals(mage.getVitalite(),40);
    }

    // On vérifie que le mage ne peut pas avoir, suite à une attaque spéciale, plus de vie qu'il n'en avait au départ
    @Test
    void Given_VitaliteIntitiale50Intelligence10_When_combattreDeFaconSpeciale_Then_Gagne0EnVitalite() {
        Mage mage = new Mage ("Joueur 1", 10,0,0,10);
        mage.combattreDeFaconSpeciale(null);
        assertEquals(mage.getVitalite(),50);
    }
}