package org.example;

public abstract class Merce {
    private String codice;
    private double prezzoUnitario;

    public Merce(String codice, double prezzoUnitario) {
        this.codice = codice;
        this.prezzoUnitario = prezzoUnitario;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(double prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }

    public abstract double calcolaImporto();
    public abstract double calcolaCalorie();

    @Override
    public String toString() {
        return "Merce{" +
                "codice='" + codice + '\'' +
                ", prezzoUnitario=" + prezzoUnitario +
                '}';
    }
}
