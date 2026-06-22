package belajar.java.backend.belajar_spring_dasar;

import belajar.java.backend.belajar_spring_dasar.data.Bar;
import belajar.java.backend.belajar_spring_dasar.data.Foo;
import belajar.java.backend.belajar_spring_dasar.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
