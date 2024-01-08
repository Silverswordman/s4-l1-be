package giuliasilvestrini.s4l1be.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Pizza {
    private String nome;
    private double prezzo;
    private int calorie;

    private List<String> toppings;


    public Pizza(String nome, double prezzo, int calorie, List<String> toppings) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
        this.toppings = toppings;
    }

    public Pizza() {

    }


    @Override
    public String toString() {
        return "Pizza{" +
                "nome= " + nome + '\'' +
                ", prezzo= " + prezzo +
                ", calorie= " +calorie + " ingredienti= "+  toppings +
        ' ';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
}
