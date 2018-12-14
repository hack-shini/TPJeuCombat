package joueurs;

import sorts.AttaqueBasique;
import sorts.AttaqueSpeciale;
import sorts.AucuneAttaqueBasique;
import sorts.AucuneAttaqueSpeciale;

/**
 * Classe Personnage
 *
 * Elle définit un personnage du jeu de combat épique avec ses différentes caractéristiques. Cette classe est abstraite et ses spécialisations permettent d'instancier l'un ou l'autre des personnages en tant que tel.
 *
 * La méthode attaquer implémente l'attaque basique d'un joueur sur son adversaire. Elle fait appel à l'interface attaqueBasique pour que l'attaque soit différentiée en fonction de la classe du personnage choisi.
 * La méthode combattreDeFaconSpeciale implémente l'attaque spéciale. Elle fait appel à l'interface attaqueSpeciale pour que l'attaque soit différentiée en fonction de la classe  du personnage choisi.
 *
 * Le choix d'utiliser des interfaces donne la possibilité d'ajouter sans effort de nouveaux types de personnages et de nouveaux comportements puisque les traitements sont déportés dans des classes séparées.
 *
 */
public abstract class Personnage {
    protected String nom;
    protected int niveau;
    protected int vieAuDepart;
    protected int vie;
    protected int force;
    protected int agilite;
    protected int intelligence;
    protected AttaqueBasique attaqueBasique = new AucuneAttaqueBasique();
    protected AttaqueSpeciale attaqueSpeciale = new AucuneAttaqueSpeciale();

    public Personnage(){};

    public Personnage(String nom, int niveau, int force, int agilite, int intelligence, AttaqueBasique attaqueBasique, AttaqueSpeciale attaqueSpeciale) {

        this.nom = nom;
        this.niveau = niveau;
        this.vieAuDepart = niveau * 5;
        this.vie = this.vieAuDepart;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        this.attaqueBasique = attaqueBasique;
        this.attaqueSpeciale = attaqueSpeciale;
    }

    /**
     * La méthode attaquer implémente l'attaque basique d'un joueur sur son adversaire.
     * Elle fait appel à la méthode utiliserArmeDeBase de l'interface attaqueBasique pour que le traitement de l'attaque soit implémenté dans des classes séparées en fonction de la classe du personnage choisi.
     * Les différentes implémentations se font dans le package sorts qui contient l'attaque basique pour chaque type de personnage :
     * - CoupdEpee pour Guerrier,
     * - TirAlArc pour Rodeur,
     * - BouleDeFeu pour Mage.
     * On pourrait facilement ajouter d'autres types de personnages donc d'autres types d'attaque basique sans modifier le code ici.
     *
     * @param adversaire    l'adversaire sur qui le coup est porté
     */
    public void attaquer(Personnage adversaire) {
        attaqueBasique.utiliserArmeDeBase(this, adversaire);
    };

    /**
     * La méthode combattreDeFaconSpeciale implémente l'attaque spéciale d'un joueur (sur son adversaire ou pour pour lui-même).
     * Elle fait appel à la méthode utiliserArmeSpeciale de l'interface attaqueSpeciale pour que le traitement de l'attaque soit implémenté dans des classes séparées en fonction de la classe du personnage choisi.
     * Les différentes implémentations se font dans le package sorts qui contient l'attaque spéciale pour chaque type de personnage :
     * - CoupDeRage pour Guerrier,
     * - Concentration pour Rodeur,
     * - Soin pour Mage.
     * On pourrait facilement ajouter d'autres types de personnages donc d'autres types d'attaque spéciale sans modifier le code ici.
     *
     * @param adversaire l'adversaire sur qui le coup est éventuellement porté
     */

    public void combattreDeFaconSpeciale(Personnage adversaire) {
        this.attaqueSpeciale.utiliserArmeSpeciale(this, adversaire);
    };

    public String getNom() {
        return nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getVitalite() {
        return vie;
    }

    /**
     * Méthode perdVitalite
     * Cette méthode retranche le dommage subi de la vitalité du personnage (sa vie).
     * Si vie tombe à 0, le personnage est déclaré mort.
     * @param dommage   le dommage subi
     * @return vivant  un booléen qui vaut true si le personnage est vivant, false s'il est mort.
     */
    public boolean perdVitalite(int dommage) {
        boolean vivant = true;
        System.out.println(nom + " perd " + dommage + " points de vie");
        this.vie -= dommage;
        if (vie <= 0) {
            vivant = false;
            System.out.println(nom + " est mort");
        }
        return vivant;
    }

    /**
     * Méthode gagneVitalite
     * Ajoute un gain à la vie du personnage. Mais vérifie la condition que son niveau de vie ne peut pas être supérieur à celui qu'il avait au départ.
     * @param gain
     * @return
     */
    public int gagneVitalite(int gain) {
        int gainReel;
        if (this.vie + gain > vieAuDepart) {
            System.out.println(nom + " a retrouvé sa vitalité initiale, il ne peut pas la dépasser");
            gainReel = vieAuDepart - this.vie;
            this.vie = vieAuDepart;
        } else {
            this.vie += gain;
            gainReel = gain;
        }
        return (gainReel);
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void gagneAgilite(int agilite) {
        this.agilite += agilite;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

}
