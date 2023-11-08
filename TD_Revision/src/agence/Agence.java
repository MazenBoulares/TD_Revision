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

//    public List<Voiture> selectVoitureSelonCritere(Critere c) {
////à completer
//    }

    public Set<Client> ensembleClientsLoueurs() {
        Set<Client> sc= new HashSet<>();
        for(Client c: ClientVoitureLoue.keySet()){
            sc.add(c);
        }

        return sc;
    }

//    public Collection<ListVoitures> collectionVoituresLouees() {
//        Collection<ListVoitures> sv= new Collection<>() {
//        };
//
//        for(ListVoitures lv: ClientVoitureLoue.values())
//        {
//
//               sv.add(lv.getVoitures());
//
//        }
//
//        return sv;
//    }

    public void afficheLesClientsEtLeursListesVoitures() {
        for(Map.Entry<Client,ListVoitures> entry: ClientVoitureLoue.entrySet()){
            Client e=entry.getKey();
            ListVoitures d=entry.getValue();
            System.out.println(e.toString());
            d.affiche();
        }



    }

    public Map<Client, ListVoitures> triCodeCroissant() {

       TreeMap<Client,ListVoitures> tm= new TreeMap<>();


        Map<Client, ListVoitures> m2=new HashMap<>();
        m2.putAll(tm);

        return m2;



    }

    public Map<Client, ListVoitures> triNomCroissant() {
// à completer
    }
}


