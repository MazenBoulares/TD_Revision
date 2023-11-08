package voiture;

public class CriterePrix implements Critere {
    private float prix;

    public CriterePrix(float prix) {
        this.prix = prix;
    }

    public boolean estSatisfaitPar(Voiture v) {
        if (v.getPrixLocation() <= this.prix)
            return true;
        else
            return false;
    }
}