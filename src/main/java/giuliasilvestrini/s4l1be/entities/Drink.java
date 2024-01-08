package giuliasilvestrini.s4l1be.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Drink {
    private String nome;
    private double prezzo;
    private int calorie;
}
