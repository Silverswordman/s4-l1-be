package giuliasilvestrini.s4l1be;

import giuliasilvestrini.s4l1be.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

@Configuration
public class BeansConfiguration {
    @Bean
    public Pizza Margherita() {
        Pizza pizza = new Pizza();
        pizza.setNome("Margherita");
        pizza.setPrezzo(4.99);
        pizza.setCalorie(1104);
        pizza.setToppings(Arrays.asList("pomodoro", "mozzarella"));
        return pizza;
    }

    @Bean
    public Pizza Hawaiana() {
        Pizza pizza = new Pizza();
        pizza.setNome("Prosciutto e Margherita");
        pizza.setPrezzo(4.99);
        pizza.setCalorie(1104);
        pizza.setToppings(Arrays.asList("pomodoro", "mozzarella", "prosciutto", "ananas"));
        return pizza;
    }


}