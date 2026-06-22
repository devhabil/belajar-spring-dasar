package belajar.java.backend.belajar_spring_dasar;

import belajar.java.backend.belajar_spring_dasar.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "belajar.java.backend.belajar_spring_dasar.repository",
        "belajar.java.backend.belajar_spring_dasar.service",
        "belajar.java.backend.belajar_spring_dasar.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
