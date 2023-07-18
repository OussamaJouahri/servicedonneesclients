package net.Ouss.customerdataservice;

import net.Ouss.customerdataservice.entities.Customer;
import net.Ouss.customerdataservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("David Johns")
                    .email("f.johns@gmail.com").build());

            customerRepository.save(Customer.builder().name("test")
                    .email("kkk@gmail.com").build());

            customerRepository.save(Customer.builder().name("oussama")
                    .email("ouss@gmail.com").build());
        };
    }

}
