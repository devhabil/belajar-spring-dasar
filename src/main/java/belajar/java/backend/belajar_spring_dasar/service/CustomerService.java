package belajar.java.backend.belajar_spring_dasar.service;

import belajar.java.backend.belajar_spring_dasar.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter
    @Autowired
    @Qualifier("normalCustomerRepository")
    private CustomerRepository normalCustomerRepository;


    @Getter
    @Autowired
    @Qualifier("premiumCustomerRepository")
    private CustomerRepository premiumCustomerRepository;
}
