package belajar.java.backend.belajar_spring_dasar.configuration;

import belajar.java.backend.belajar_spring_dasar.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar(){
        return new Bar();
    }
}
