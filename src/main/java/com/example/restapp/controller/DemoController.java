package com.example.restapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;
import java.util.Set;

public class DemoController {
    /*@RestController
    @RequestMapping("/person")
    public class CustomerController {

        private CustomerRepository customerRepository;

        private CustomerService customerService;

        public CustomerController(
                CustomerRepository customerRepository, CustomerService customerService) {
            this.customerRepository = customerRepository;
            this.customerService = customerService;
        }

        @RequestMapping("/add")
        public ResponseEntity<Long> addCustomer(@RequestBody final CustomerDto customerDto) {
            Long customerId = customerService.add(customerDto);
            URI addedCustomer =
                    ServletUriComponentsBuilder.fromCurrentRequest()
                            .path("/{id}")
                            .buildAndExpand(customerId)
                            .toUri();
            return ResponseEntity.created(addedCustomer).body(customerId);
        }

        @RequestMapping("/all")
        public Set<Customer> getAllCustomers() {
            return customerRepository.findAll();
        }

        @PatchMapping("/{id}")
        public ResponseEntity<CustomerDto> updateCustomer(
                @PathVariable final long id, @RequestBody CustomerDto customerDto) {
            return ResponseEntity.ok(customerService.update(id, customerDto));
        }

        @GetMapping("/{id}")
        public ResponseEntity<Optional<CustomerDto>> findCustomerById(@PathVariable final long id) {
            return ResponseEntity.ok(customerService.findOneById(id));
        }
    }*/
}
