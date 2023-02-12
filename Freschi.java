package org.example;

public class Freschi extends Alimentari{
    private static double costoSacchetto = 0.05;
    private boolean confezionato;

    public Freschi(String codice, double prezzoUnitario, String descrizione, double peso, double calorieUnitarie, boolean confezionato) {
        super(codice, prezzoUnitario, descrizione, peso, calorieUnitarie);
        this.confezionato = confezionato;
    }

    public static double getCostoSacchetto() {
        return costoSacchetto;
    }

    public static void setCostoSacchetto(double costoSacchetto) {
        Freschi.costoSacchetto = costoSacchetto;
    }

    public boolean isConfezionato() {
        return confezionato;
    }

    public void setConfezionato(boolean confezionato) {
        this.confezionato = confezionato;
    }

    @Override
    public double calcolaImporto() {
        double prezzoFinale = getPrezzoUnitario();

        if (confezionato)
            prezzoFinale += getCostoSacchetto();

        return prezzoFinale;
    }

    @Override
    public String toString() {
        return super.toString() + "Freschi{" +
                "confezionato=" + confezionato +
                ", peso=" + peso +
                '}';
    }
}
