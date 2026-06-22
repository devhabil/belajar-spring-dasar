package belajar.java.backend.belajar_spring_dasar;

import belajar.java.backend.belajar_spring_dasar.configuration.BarConfiguration;
import belajar.java.backend.belajar_spring_dasar.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
