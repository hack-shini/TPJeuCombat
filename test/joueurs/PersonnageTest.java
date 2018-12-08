package joueurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

    @Test
    void Given_Dommages20Vitalite500_When_perdVitalite_Then_Vitalite480AndReturnTrue() {
        Personnage personnage = new Guerrier ("Joueur 1", 100, 100, 0, 0 );
        assertEquals(personnage.perdVitalite(20),true);
        assertEquals(personnage.getVie(),480);
    }

    @Test
    void Given_Dommages40Vitalite40_When_perdVitalite_Then_JoueurMortAndReturnFalse() {
        Personnage personnage = new Guerrier ("Joueur 1", 8, 8, 0, 0 );
        assertEquals(personnage.perdVitalite(40),false);
        assertEquals(personnage.getVie(),0);
    }

    @Test
    void Given_Gain10Vitalite50_When_gagneVitalite_Then_Vitalite60AndReturn10() {
        Personnage personnage = new Guerrier ("Joueur 1", 10, 10, 0, 0 );
        assertEquals(personnage.gagneVitalite(10),10);
        assertEquals(personnage.getVie(),60);
    }

    @Test
    void Given_Gain10Vitalite95_When_gagneVitalite_Then_Vitalite100AndReturn5() {
        Personnage personnage = new Guerrier ("Joueur 1", 10, 10, 0, 0 );
        assertEquals(personnage.gagneVitalite(10),5);
        assertEquals(personnage.getVie(),100);
    }
}