package com.antocecere77.springselenium;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class User {

    @Autowired
    private Address address;

    @Autowired
    private Salary salary;

    public void printDetails() {
        System.out.println("Address: " + this.address.getStreet());
        System.out.println("Salary: " + this.salary.getAmount());
    }
}
