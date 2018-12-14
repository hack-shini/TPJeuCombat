package joueurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe PersonnageTest
 *
 * Contient les tests unitaires de la classe Personnage
 */

class PersonnageTest {

    /**
     * Test que l'instanciation d'un personnage lui donne une vitalité égale à 5 fois son niveau.
     */
    @Test
    void Given_Niveau10_When_constructeur_Then_Vitalite50() {
        Personnage personnage = new Guerrier ("Joueur 1", 10, 10, 0, 0 );
        assertEquals(personnage.getVitalite(),50);
    }

    /**
     * Test que la méthode perdVitalite fait perdre le personnage en vitalite à hauteur du dommage qui lui est fourni en paramètre
     * et que la méthode renvoie true si le joueur a encore de la vie.
     */
    @Test
    void Given_Dommages20Vitalite500_When_perdVitalite_Then_Vitalite480AndReturnTrue() {
        Personnage personnage = new Guerrier ("Joueur 1", 100, 100, 0, 0 );
        assertEquals(personnage.getVitalite(),500);
        assertEquals(personnage.perdVitalite(20),true);
        assertEquals(personnage.getVitalite(),480);
    }

    /**
     * Test que la méthode perdVitalite retourne la valeur false quand le joueur est mort
     * c'est à dire que sa vitalité est égale à 0.
     */
    @Test
    void Given_Dommages40Vitalite40_When_perdVitalite_Then_JoueurMortAndReturnFalse() {
        Personnage personnage = new Guerrier ("Joueur 1", 8, 8, 0, 0 );
        assertEquals(personnage.perdVitalite(40),false);
        assertEquals(personnage.getVitalite(),0);
    }

    /**
     * Test que la méthode gagneVitalite fait gagner en vitalité le gain passé en paramètre si la vitalité
     * a préalablement baissé autant ou davantage
     */
    @Test
    void Given_VitaliteInitiale50Perte20Gain10_When_gagneVitalite_Then_Vitalite40AndReturn10() {
        Personnage personnage = new Guerrier ("Joueur 1", 10, 10, 0, 0 );
        personnage.perdVitalite(20);
        assertEquals(personnage.getVitalite(),30);
        assertEquals(personnage.gagneVitalite(10),10);
        assertEquals(personnage.getVitalite(),40);
    }

    /**
     * Test que la méthode gagneVitalite fait gagner au personnage sa vitalité intiale quand la vitalité
     * a préalablement baissé moins que le gain passé en paramètre.
     */
    @Test
    void Given_VitaliteInitiale50Perte10Gain20_When_gagneVitalite_Then_Vitalite50AndReturn10() {
        Personnage personnage = new Guerrier ("Joueur 1", 10, 10, 0, 0 );
        assertEquals(personnage.getVitalite(),50);
        personnage.perdVitalite(10);
        assertEquals(personnage.gagneVitalite(20),10);
        assertEquals(personnage.getVitalite(),50);
    }
}