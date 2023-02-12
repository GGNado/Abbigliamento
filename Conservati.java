package org.example;

public class Conservati extends Alimentari{
    private String marca;

    public Conservati(String codice, double prezzoUnitario, String descrizione, double peso, double calorieUnitarie, String marca) {
        super(codice, prezzoUnitario, descrizione, peso, calorieUnitarie);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Conservati{" +
                "marca='" + marca + '\'' +
                ", peso=" + peso +
                '}';
    }
}
