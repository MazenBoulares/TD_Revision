package agence;

import voiture.Voiture;


import voiture.CritereMarque;

import voiture.ListVoitures;

import voiture.VoitureException;

import voiture.Critere;

import client.Client;

import java.util.*;

public class Agence {
    private String nom;
    private ListVoitures vs;
    private Map<Client, ListVoitures> ClientVoitureLoue;


    public Agence(String nom) {
        this.nom = nom;
    }


    public void ajoutVoiture(Voiture v) throws VoitureException {
        vs.ajoutVoiture(v);
    }


    public void suppVoiture(Voiture v) throws VoitureException {
        vs.supprimeVoiture(v);
    }


    public void loueClientVoiture(Client cl, Voiture v) throws VoitureException {

        if (vs.getVoitures().contains(v)) {

            if (ClientVoitureLoue.containsKey(cl)) {
                ListVoitures vs2 = ClientVoitureLoue.get(cl);
                vs2.ajoutVoiture(v);
                ClientVoitureLoue.put(cl, vs2);
            } else {
                ListVoitures vs2 = new ListVoitures();
                vs2.ajoutVoiture(v);
                ClientVoitureLoue.put(cl, vs2);
            }
            this.suppVoiture(v);
        } else
            throw new VoitureException("l'agence n'a pas ce voiture");
    }


    public void retourClientVoiture(Client cl, Voiture v) throws VoitureException {

        if (ClientVoitureLoue.containsKey(cl)) {
            (ClientVoitureLoue.get(cl)).supprimeVoiture(v);
            vs.ajoutVoiture(v);

        } else {
            throw new VoitureException("le client n'a pas ce voiture");
        }

    }

    public List<Voiture> selectVoitureSelonCritere(Critere c) {
//à completer
    }

    public Set<Client> ensembleClientsLoueurs() {
        Set<Client> sc= new HashSet<>();
        for(Client c: ClientVoitureLoue.keySet()){
            sc.add(c);
        }

        return sc;
    }

    public Collection<ListVoitures> collectionVoituresLouees() {
        Set<Voiture> sv= new HashSet<>();

        for(ListVoitures lv: ClientVoitureLoue.values())
        {
            sv.add(lv.getVoitures().iterateur());
        }

        return sv;
    }

    public void afficheLesClientsEtLeursListesVoitures() {

    }

    public Map<Client, ListVoitures> triCodeCroissant() {

        // à completer
    }

    public Map<Client, ListVoitures> triNomCroissant() {
// à completer
    }
}


