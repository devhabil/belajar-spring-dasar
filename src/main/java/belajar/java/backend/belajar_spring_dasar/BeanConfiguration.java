package belajar.java.backend.belajar_spring_dasar;

import belajar.java.backend.belajar_spring_dasar.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Create New foo");
        return foo;
    }
}
