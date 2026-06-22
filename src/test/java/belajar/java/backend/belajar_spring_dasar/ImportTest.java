package belajar.java.backend.belajar_spring_dasar;

import belajar.java.backend.belajar_spring_dasar.data.Bar;
import belajar.java.backend.belajar_spring_dasar.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void tesImport() {
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);

    }
}
