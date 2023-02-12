package org.example;

public class Abbigliamento extends Merce{
    private static double SCONTOUOMO = 5;
    private static double SCONTODONNA = 10;
    private Character sesso;
    private String taglia;
    private String tipologia;

    public Abbigliamento(String codice, double prezzoUnitario, Character sesso, String taglia, String tipologia) {
        super(codice, prezzoUnitario);
        this.sesso = sesso;
        this.taglia = taglia;
        this.tipologia = tipologia;
    }

    public static double getSCONTOUOMO() {
        return SCONTOUOMO;
    }

    public static double getSCONTODONNA() {
        return SCONTODONNA;
    }


    public char getSesso() {
        return sesso;
    }

    public void setSesso(char sesso) {
        this.sesso = sesso;
    }

    public String getTaglia() {
        return taglia;
    }

    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    @Override
    public double calcolaImporto() {
        double prezzoFinale = getPrezzoUnitario();
        if (sesso.equals('M') || sesso.equals('m')){
            prezzoFinale = getPrezzoUnitario() - (prezzoFinale * getSCONTOUOMO() / 100);
        } else {
            prezzoFinale = getPrezzoUnitario() - (prezzoFinale * getSCONTODONNA() / 100);
        }
        return prezzoFinale;
    }

    @Override
    public double calcolaCalorie() {
        return 0;
    }

    @Override
    public String toString() {
        return  "Abbigliamento{" +
                "SCONTODONNA=" + SCONTODONNA +
                ", sesso=" + sesso +
                ", taglia='" + taglia + '\'' +
                ", tipologia='" + tipologia + '\'' +
                '}';
    }
}
