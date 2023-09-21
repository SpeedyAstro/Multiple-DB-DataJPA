package in.astro.restcontroller;

import in.astro.config.model.customer.Customer;
import in.astro.config.model.product.Product;
import in.astro.repo.customer.ICustomerRepository;
import in.astro.repo.product.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MultipleDataRestController {
    @Autowired
    private IProductRepository productRepository;
    @Autowired
    private ICustomerRepository customerRepository;

    @GetMapping("/products")
    public List<Product> fetchAllProducts(){
        return productRepository.findAll();
    }
    @GetMapping("/customers")
    public List<Customer> fetchAllCustomers(){
        return customerRepository.findAll();
    }
}
