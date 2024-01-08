package giuliasilvestrini.s4l1be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class S4L1BeApplication {

    public static void main(String[] args) {
        SpringApplication.run(S4L1BeApplication.class, args);


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S4L1BeApplication.class);

        System.out.println(ctx.getBean("Margherita"));
        System.out.println(ctx.getBean("Hawaiana"));

        ctx.close();
    }

}
