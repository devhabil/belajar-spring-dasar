package belajar.java.backend.belajar_spring_dasar.client;

import lombok.Data;

@Data
public class PaymentGatewayClient {

    private String endpoint;

    private String privateKey;

    private String publicKey;
}
