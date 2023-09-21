package in.astro;

import in.astro.config.model.customer.Customer;
import in.astro.config.model.product.Product;
import in.astro.repo.customer.ICustomerRepository;
import in.astro.repo.product.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringDataJpaMultipleDbConfigApplication implements CommandLineRunner {
    @Autowired
    private IProductRepository productRepository;
    @Autowired
    private ICustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaMultipleDbConfigApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.saveAll(
                Arrays.asList(
                        new Product(1,"C-001","Fossil"),
                        new Product(2,"C-002","Armani"),
                        new Product(3,"C-003","Tissot")
                )
        );
        customerRepository.saveAll(
                Arrays.asList(
                        new Customer(1,"sachin","saching@wcl.com"),
                        new Customer(2,"kholi","kholi@rcb.in"),
                        new Customer(3,"rahul","rahul@csk.in")
                )
        );
    }
}
