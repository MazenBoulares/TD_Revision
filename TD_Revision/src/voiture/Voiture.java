package voiture;

import java.util.Objects;

public class Voiture {
    private int immariculation;
    private String marque;
    private float prixLocation;

    public Voiture(String marque, float prixLocation) {
        this.marque = marque;
        this.prixLocation = prixLocation;
    }

    public int getImmariculation() {
        return immariculation;
    }

    public void setImmariculation(int immariculation) {
        this.immariculation = immariculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(float prixLocation) {
        this.prixLocation = prixLocation;
    }

    @Override
    public String toString() {
        return "voiture.Voiture{" +
                "immariculation=" + immariculation +
                ", marque='" + marque + '\'' +
                ", prixLocation=" + prixLocation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voiture voiture = (Voiture) o;
        return immariculation == voiture.immariculation && Float.compare(prixLocation, voiture.prixLocation) == 0 && Objects.equals(marque, voiture.marque);
    }

    @Override
    public int hashCode() {
        return immariculation + marque.hashCode();
    }
}