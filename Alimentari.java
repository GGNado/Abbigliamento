package org.example;

public class Alimentari extends Merce{
    private String descrizione;
    protected double peso;
    private double calorieUnitarie;

    public Alimentari(String codice, double prezzoUnitario, String descrizione, double peso, double calorieUnitarie) {
        super(codice, prezzoUnitario);
        this.descrizione = descrizione;
        this.peso = peso;
        this.calorieUnitarie = calorieUnitarie;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCalorieUnitarie() {
        return calorieUnitarie;
    }

    public void setCalorieUnitarie(double calorieUnitarie) {
        this.calorieUnitarie = calorieUnitarie;
    }

    @Override
    public double calcolaImporto() {
        return getPrezzoUnitario();
    }

    public double calcolaCalorie(){
        return calorieUnitarie;
    }

    @Override
    public String toString() {
        return "Alimentari{" +
                "descrizione='" + descrizione + '\'' +
                ", peso=" + peso +
                ", calorieUnitarie=" + calorieUnitarie +
                '}';
    }
}
