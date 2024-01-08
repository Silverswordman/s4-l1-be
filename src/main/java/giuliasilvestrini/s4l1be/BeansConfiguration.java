package giuliasilvestrini.s4l1be;

import giuliasilvestrini.s4l1be.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;

@Configuration
public class BeansConfiguration {
    @Bean
    Pizza getPizza() {
        return new Pizza("Margherita", 3.5, 1104,);
    }


}
