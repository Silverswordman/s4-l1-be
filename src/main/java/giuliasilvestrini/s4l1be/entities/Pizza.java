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


    public Pizza(String nome, double prezzo, int calorie) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    public Pizza(String nome, double prezzo, int calorie, List<String> toppings) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
        this.toppings = toppings;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                '}';
    }
}
