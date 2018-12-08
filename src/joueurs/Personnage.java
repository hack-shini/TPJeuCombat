package joueurs;

import sorts.AttaqueBasique;
import sorts.AttaqueSpeciale;
import sorts.AucuneAttaqueBasique;
import sorts.AucuneAttaqueSpeciale;

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
        // Vérifier que force + agilité + intelligence = niveau
       /* try {
            assertEqual(force + agilite + intelligence, niveau);
        }
        catch () {

        }
        */
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

    public abstract void attaquer(Personnage autreJoueur) ;

    public abstract void combattreDeFaconSpeciale(Personnage joueur) ;

    public void subirAttaque(int dommages) {
        this.vie -= dommages;
        System.out.println(nom + " perd " + dommages + " points de vie");
    }

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

    public int getVie() {
        return vie;
    }

    public void perdVitalite(int dommage) {
        this.vie -= dommage;
        if (vie <= 0) {
            System.out.println(nom + "est mort");
        }
    }

    public int gagneVitalite(int gain) {
        int gainReel;
        if (this.vie + gain > vieAuDepart) {
            System.out.println(nom + "a retrouvé sa vitalité initiale, il ne peut pas la dépasser");
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

    public void setAttaqueBasique(AttaqueBasique attaqueBasique) {
        this.attaqueBasique = attaqueBasique;
    }

    public void setAttaqueSpeciale(AttaqueSpeciale attaqueSpeciale) {
        this.attaqueSpeciale = attaqueSpeciale;
    }
}
