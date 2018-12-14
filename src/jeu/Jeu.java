package jeu;

import joueurs.Guerrier;
import joueurs.Mage;
import joueurs.Personnage;
import joueurs.Rodeur;

import java.util.Scanner;

/**
 * Classe Jeu.
 * Elle permet d'instancier un jeu de combat épique (constructeur) et de le lancer (méthode jouer).
 * Deux attributs :
 * Personnage joueur1;   le premier joueur
 * Personnage joueur2;   le deuxième joueur
 *
 * Son constructeur s'appuie sur la méthode creerPersonnage qui interroge l'utilisateur pour récupérer les caractéristiques d'un personnage puis crée une instance de Personnage avec trois choix possibles :
 * Guerrier, Rodeur ou Mage qui sont définis dans leur classe respective.
 */

public class Jeu {

    private Personnage joueur1;
    private Personnage joueur2;

    public Jeu() {
        joueur1 = creerPersonnage(1);
        joueur2 = creerPersonnage(2);
    }

    private Personnage creerPersonnage(int numJoueur) {

        int niveau, force, agilite, intelligence;
        Personnage personnage;

        System.out.println("Création du personnage Joueur " + numJoueur);
        int numClasseP = demander("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)",1,3);
        boolean saisieCorrecte = false;
        do {
            niveau = demander("Niveau du Personnage ?",1,100);
            force = demander("Force du Personnage ?",0,100);
            agilite = demander("Agilite du Personnage ?",0,100);
            intelligence = demander("Intelligence du Personnage ?",0,100);
            if (force + agilite + intelligence != niveau)
                System.out.println("Attention : le total force + agilité + intelligence doit être égal au niveau du joueur ");
            else
                saisieCorrecte = true;
        } while (!saisieCorrecte);

        String nom = "Joueur " + numJoueur;

        switch (numClasseP) {
            case 1 :
                Guerrier guerrier = new Guerrier(nom, niveau, force, agilite, intelligence);
                afficherPresentation("Woarg je suis le Guerrier ", guerrier);
                personnage = guerrier;
                break;
            case 2 :
                Rodeur rodeur = new Rodeur(nom, niveau, force, agilite, intelligence);
                afficherPresentation("Fffuitt je suis le Rodeur ", rodeur);
                personnage = rodeur;
                break;
            case 3 :
                Mage mage = new Mage(nom, niveau, force, agilite, intelligence);
                afficherPresentation("Abracadabra je suis le magicien ", mage);
                personnage = mage;
                break;
            default:
                personnage = null;
                break;
        }
        return personnage;

    }

    /**
     * Méthode jouer().
     * Elle permet de lancer le jeu une fois les personnages instanciés.
     *
     * La main est donnée au premier joueur pour qu'il choisisse son action (par la méthode demanderAction, il peut choisir entre Attaque Basique ou Attaque Spéciale);
     * les calculs des impacts positifs ou négatifs sont faits pour lui et son adversaire,
     * ceci par le biais des méthodes attaquer et combattreDeFaconSpeciale qui sont définies dans la classe Personnage.
     *
     * Puis c'est le tour du deuxième joueur de devenir attaquant et de choisir son action avec les conséquences qui en découlent.
     *
     * Et ainsi de suite jusqu'à ce qu'un des deux joueurs ait perdu (il n'a plus de vitalité).
     */
    public void jouer() {
        Personnage joueur, adversaire;
        int nbTours = 1, action = 0;
        boolean fin = false;
        do {
            if (nbTours % 2 == 1) {
                joueur = joueur1;
                adversaire = joueur2;
            }
            else {
                joueur = joueur2;
                adversaire = joueur1;
            }
            action = demanderAction(joueur);
            switch (action) {
                case 1 :
                    joueur.attaquer(adversaire);
                    break;
                case 2 :
                    joueur.combattreDeFaconSpeciale(adversaire);
                    break;
                default :
                    break;
            }
            nbTours++;
        } while (joueur1.getVitalite() >0 && joueur2.getVitalite() >0);
        if (joueur1.getVitalite() <= 0)
            System.out.println("Joueur 1 a perdu");
        else
            System.out.println("Joueur 2 a perdu");
    }

    private static Scanner sc = new Scanner(System.in);

    /**
     * Méthode demander
     * Cette méthode est générique dans ce sens qu'elle affiche un message indiquant au joueur ce qu'il doit entrer, puis elle contrôle que l'entrée est bien un entier compris dans les bornes valMin, valMax.
     * En cas de saisie incorrecte, gérée par interruption ou par contrôle de valeur, un message d'erreur est affiché
     * et on boucle ainsi jusqu'à ce que l'entrée soit correcte..
     * @param message le message à afficher
     * @param valMin  la valeur minimale (un nombre entier) acceptée en entrée
     * @param valMax  la valeur maximale (un nombre entier) acceptée en entrée
     * @return la valeur entrée.
     */

    public int demander(String message, int valMin, int valMax) {
        int reponse = -1;

        System.out.println(message);
        do {
            try {
                reponse = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Veuillez saisir un nombre entier ");
                continue;
            } finally {
                sc.nextLine();
            }
            if (reponse < valMin || reponse > valMax)
                System.out.println("Veuillez saisir une valeur entière entre " + valMin + " et " + valMax);
        } while (reponse < valMin || reponse > valMax);
        return reponse;
    }

    private void afficherPresentation(String message, Personnage personnage) {
        System.out.print(message + personnage.getNom() + " niveau " + personnage.getNiveau());
        System.out.println(" je possède " + personnage.getVitalite() + " de vitalite, " + personnage.getForce() + " de force, " + personnage.getAgilite() + " d'agilite, " + personnage.getIntelligence() + " d'intelligence !");
    }


    private int demanderAction(Personnage personnage) {
        return demander(personnage.getNom() + " (" + personnage.getVitalite() + " Vitalité) veuillez choisir votre action (1: Attaque Basique, 2 : Attaque Spéciale",1,2);

    }
}
