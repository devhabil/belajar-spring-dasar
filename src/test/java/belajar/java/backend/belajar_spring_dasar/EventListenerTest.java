package belajar.java.backend.belajar_spring_dasar;

import belajar.java.backend.belajar_spring_dasar.listener.LoginAgainSuccessListener;
import belajar.java.backend.belajar_spring_dasar.listener.LoginSuccessListener;
import belajar.java.backend.belajar_spring_dasar.listener.UserListener;
import belajar.java.backend.belajar_spring_dasar.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class,
            UserListener.class
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
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("habil", "habil");
        userService.login("salah", "habil");
        userService.login("habil", "salah");
    }
}
