package com.antocecere77.springselenium;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {

    private Address address;

    private Salary salary;

    public User(Address address, Salary salary) {
        this.address = address;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Address: " + this.address.getStreet());
        System.out.println("Salary: " + this.salary.getAmount());
    }
}
