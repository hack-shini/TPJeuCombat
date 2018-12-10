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

    public void attaquer(Personnage autreJoueur) {
        attaqueBasique.utiliserArmeDeBase(this, autreJoueur);
    };

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

    public void setAttaqueBasique(AttaqueBasique attaqueBasique) {
        this.attaqueBasique = attaqueBasique;
    }

    public void setAttaqueSpeciale(AttaqueSpeciale attaqueSpeciale) {
        this.attaqueSpeciale = attaqueSpeciale;
    }
}
