package org.example;

import java.util.ArrayList;

public class Carrello {
    private int oggetti;
    private ArrayList<Merce> contenutoCarrello;

    public Carrello(){
        contenutoCarrello = new ArrayList<>();
    }

    public void inserisciProdotto(Merce merce){
        if (contenutoCarrello.contains(merce)){
            System.out.println("Impossibile aggiungere prodotto. Gia presente");
            return;
        }
        contenutoCarrello.add(merce);
    }

    public double calcolaPrezzoTotale(){
        double prezzoFinale = 0;
        for (Merce variabile : contenutoCarrello){
            prezzoFinale += variabile.calcolaImporto();
        }

        return prezzoFinale;
    }

    public double calcolaCalorieTotali(){
        double calorieTotali = 0;

        for (Merce merci : contenutoCarrello){
            calorieTotali += merci.calcolaCalorie();
        }

        return calorieTotali;
    }

    public void elenca(){
        for (Merce merce : contenutoCarrello){
            System.out.println(merce.toString());
        }
    }
}
