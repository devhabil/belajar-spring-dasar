package belajar.java.backend.belajar_spring_dasar;

import belajar.java.backend.belajar_spring_dasar.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {


}
