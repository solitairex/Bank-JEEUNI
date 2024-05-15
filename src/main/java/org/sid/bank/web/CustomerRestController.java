package org.sid.bank.web;

import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sid.bank.dtos.CustomerDTO;
import org.sid.bank.entities.Customer;
import org.sid.bank.exceptions.CustomerNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.sid.bank.services.BankAccountService;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class CustomerRestController {
    private BankAccountService bankAccountService;
    @GetMapping("/customers")
    public List<CustomerDTO> customers(){
        return bankAccountService.listCustomers();
    }
    @GetMapping("/customers/{id}")
    public CustomerDTO getCustomer(@PathVariable(name="id")Long customerId)throws CustomerNotFoundException {
return bankAccountService.getCustomer(customerId);
    }
    @PostMapping("/customers")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        return bankAccountService.saveCustomer(customerDTO);
    }
    @PutMapping("/customers/{customerId}")
    public CustomerDTO updateCustomer(@PathVariable Long customerId,CustomerDTO customerDTO){
        customerDTO.setId(customerId);
        return bankAccountService.updateCustomer(customerDTO);
    }
    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable long id){bankAccountService.deleteCustomer(id);}
}
