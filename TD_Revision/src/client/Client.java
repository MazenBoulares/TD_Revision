package client;

import voiture.Voiture;

import java.util.Objects;

public class Client implements Comparable{

    private int code;
    private String nom;
    private String prenom;


    public Client(int code, String nom, String prenom)  {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "client.Client{" +
                "code=" + code +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return code == client.code && Objects.equals(nom, client.nom) && Objects.equals(prenom, client.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, nom, prenom);
    }

    @Override
    public int compareTo(Object o) {
        if (this.code < ((Client)o).getCode()) {
            return -1;
        } else if (this.code > ((Client)o).getCode()) {
            return 1;
        } else {
            return 0;
        }}
}