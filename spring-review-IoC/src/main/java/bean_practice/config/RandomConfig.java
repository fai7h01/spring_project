package bean_practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomConfig {

    @Bean
    String message(){
        return "Welcome to Spring";
    }

    @Bean
    String randomText(){
        return "Spring core practice";
    }
}
