package org.example;

public class Main {
    public static void main(String[] args) {
        Carrello carrello = new Carrello();
        carrello.inserisciProdotto(new Abbigliamento("1111", 100, 'f', "XS", "Rhove"));
        carrello.inserisciProdotto(new Freschi("2222", 1.50, "Lukaku", 104, 512, true));
        carrello.inserisciProdotto(new Freschi("1234", 20.20, "Chala", 70, 32, false));
        System.out.println(carrello.calcolaPrezzoTotale());
        System.out.println(carrello.calcolaCalorieTotali());

        carrello.elenca();
    }
}