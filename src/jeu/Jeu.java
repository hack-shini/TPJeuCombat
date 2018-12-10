package jeu;

import joueurs.Guerrier;
import joueurs.Mage;
import joueurs.Personnage;
import joueurs.Rodeur;

import java.util.Scanner;

public class Jeu {

    private static Scanner sc = new Scanner(System.in);

    public static int demander(String message, int valMin, int valMax) {
        int reponse = -1;

        System.out.println(message);
        do {
            try {
                reponse = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Veuillez saisir une valeur entière entre " + valMin + " et " + valMax);
                continue;
            } finally {
                sc.nextLine();
            }
            if (reponse <= valMin || reponse > valMax)
                System.out.println("Veuillez saisir une valeur entière entre " + valMin + " et " + valMax);
        } while (reponse <= valMin || reponse > valMax);
        return reponse;
    }

    private static void afficherPresentation(String message, Personnage personnage) {
        System.out.print(message + personnage.getNom() + " niveau " + personnage.getNiveau());
        System.out.println("je possède " + personnage.getVitalite() + " de vitalite, " + personnage.getForce() + " de force, " + personnage.getAgilite() + " d'agilite, " + personnage.getIntelligence() + " d'intelligence !");
    }


    public static Personnage creerPersonnage(int numJoueur) {

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

        String nom = "Joueur " + (char)numJoueur;

        switch (numClasseP) {
            case 1 :
                Guerrier guerrier = new Guerrier(nom, niveau, force, agilite, intelligence);
                afficherPresentation("Woarg je suis le Guerrier ", guerrier);
                personnage = guerrier;
                // return (guerrier);
                break;
            case 2 :
                Rodeur rodeur = new Rodeur(nom, niveau, force, agilite, intelligence);
                afficherPresentation("Fffuitt je suis le Rodeur ", rodeur);
                personnage = rodeur;
                // return (rodeur);
                break;
            case 3 :
                Mage mage = new Mage(nom, niveau, force, agilite, intelligence);
                afficherPresentation("Abracadabra je suis le magicien ", mage);
                personnage = mage;
                // return (mage);
                break;
            default:
                personnage = null;
                break;
        }
        return personnage;

    }

    public static int demanderAction(Personnage personnage) {
        return demander(personnage.getNom() + "(" + personnage.getVitalite() + " Vitalité) veuillez choisir votre action (1: Attaque Basique, 2 : Attaque Spéciale",1,2);

    }
}
