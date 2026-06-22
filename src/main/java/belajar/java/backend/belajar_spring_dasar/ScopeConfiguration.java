package belajar.java.backend.belajar_spring_dasar;

import belajar.java.backend.belajar_spring_dasar.data.Bar;
import belajar.java.backend.belajar_spring_dasar.data.Foo;
import belajar.java.backend.belajar_spring_dasar.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("Crete New Foo");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("Create new Bar ");
        return new Bar();
    }
}
