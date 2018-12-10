package jeu;

import joueurs.Personnage;
import joueurs.Rodeur;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class JeuTest {
/*
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }
*/
    @Test
    void Given_ChoixCorrect_When_demander_Then_ReturnChoix() {
        System.setIn(new ByteArrayInputStream("1\n".getBytes()));
        int reponse = Jeu.demander("Faites votre choix : Tapez 1, 2 ou 3",1,3);
        assertEquals(reponse, 1);
    }
    @Test
    void Given_Choix2_When_creerPersonnage_Then_RodeurCree() {
        System.setIn(new ByteArrayInputStream("2\n30\n0\n20\n10\n".getBytes()));
        Personnage personnage = Jeu.creerPersonnage(1);
        assertEquals(personnage.getClass(), Rodeur.class);
        assertEquals(personnage.getNiveau(),30);
        assertEquals(personnage.getForce(),0);
        assertEquals(personnage.getAgilite(),20);
        assertEquals(personnage.getIntelligence(),10);
    }
}