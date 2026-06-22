package belajar.java.backend.belajar_spring_dasar;

import belajar.java.backend.belajar_spring_dasar.data.Bar;
import belajar.java.backend.belajar_spring_dasar.data.Foo;
import belajar.java.backend.belajar_spring_dasar.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo fooFirst(){
        return new Foo();
    }

    @Bean
    public Foo fooSecond(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
