package vn.edu.iuh.fit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.Repositories.ViewRepository;
import vn.edu.iuh.fit.models.View;

import java.util.Random;

@SpringBootApplication
public class ViewApplication {

    @Autowired
    private ViewRepository viewRepository;

    public static void main(String[] args) {
        SpringApplication.run(ViewApplication.class, args);
    }

    @Bean
    CommandLineRunner test(){
        return args -> {

            Random random = new Random();
             for (int i=1; i<=10; i++){
              View view = new View(random.nextInt(1000,100000000));
              viewRepository.save(view);
          }
        };
    }

}
