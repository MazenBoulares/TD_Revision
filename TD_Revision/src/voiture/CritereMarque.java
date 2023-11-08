package voiture;

public class CritereMarque implements Critere {
    private String marque;

    public CritereMarque(String marque) {
        this.marque = marque;
    }


    public boolean estSatisfaitPar(Voiture Voiturev) {
        if (Voiturev instanceof Voiture) {
            if (marque.equals(((Voiture) Voiturev).getMarque()))
                return true;
            else
                return false;
        } else
            return false;
    }


}
