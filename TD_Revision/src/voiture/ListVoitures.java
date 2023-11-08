package voiture;

import java.util.List;
import java.util.Iterator;

public class ListVoitures {
    private List<Voiture> voitures;

    public ListVoitures() {
    }

    public ListVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }


    public List<Voiture> getVoitures() {
        return voitures;

    }

    public void setVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }

    public void ajoutVoiture(Voiture v) throws VoitureException {
        if (voitures.contains(v)) {
            throw new VoitureException("ce voiture existe déja");
        } else
            voitures.add(v);
    }

    public void supprimeVoiture(Voiture v) throws VoitureException {
        if (voitures.contains(v) == false) {
            throw new VoitureException("ce n'existe pas, on ne peut pas le supprimer");
        } else
            voitures.remove(v);
    }

    public Iterator<Voiture> iterateur() {
        return voitures.iterator();
    }

    public int size() {
        return voitures.size();
    }

    public void affiche() {
        voitures.forEach(item -> System.out.println(item));

    }
}