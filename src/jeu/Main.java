package jeu;

import joueurs.Personnage;

/**
 * Classe Main avec le programme principal.
 * Pour jouer, on crée une instance de Jeu puis on lance la partie. Elle se termin quand l'un des deux joueurs a perdu.
 */
public class Main {
    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        jeu.jouer();
    }
}
