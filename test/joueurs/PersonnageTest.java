package joueurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

    @Test
    void Given_Dommages20Vitalite500_When_perdVitalite_Then_Vitalite480AndReturnTrue() {
        Personnage personnage = new Guerrier ("Joueur 1", 100, 100, 0, 0 );
        assertEquals(personnage.perdVitalite(20),true);
        assertEquals(personnage.getVitalite(),480);
    }

    @Test
    void Given_Dommages40Vitalite40_When_perdVitalite_Then_JoueurMortAndReturnFalse() {
        Personnage personnage = new Guerrier ("Joueur 1", 8, 8, 0, 0 );
        assertEquals(personnage.perdVitalite(40),false);
        assertEquals(personnage.getVitalite(),0);
    }

    @Test
    void Given_VitaliteInitiale50Perte20Gain10_When_gagneVitalite_Then_Vitalite40AndReturn10() {
        Personnage personnage = new Guerrier ("Joueur 1", 10, 10, 0, 0 );
        personnage.perdVitalite(20);
        assertEquals(personnage.gagneVitalite(10),10);
        assertEquals(personnage.getVitalite(),40);
    }

    @Test
    void Given_VitaliteInitiale50Perte10Gain20_When_gagneVitalite_Then_Vitalite50AndReturn10() {
        Personnage personnage = new Guerrier ("Joueur 1", 10, 10, 0, 0 );
        personnage.perdVitalite(10);
        assertEquals(personnage.gagneVitalite(20),10);
        assertEquals(personnage.getVitalite(),50);
    }
}