package belajar.java.backend.belajar_spring_dasar;

import belajar.java.backend.belajar_spring_dasar.service.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

public class AwareTest {

    @Component
    @Import({
            AuthService.class
    })
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testAware() {
        AuthService authService = applicationContext.getBean(AuthService.class);

        Assertions.assertEquals("belajar.java.backend.belajar_spring_dasar.service.AuthService", authService.getBeanName());
        Assertions.assertNotNull(authService.getApplicationContext());
        Assertions.assertSame(applicationContext, authService.getApplicationContext());
    }
}
