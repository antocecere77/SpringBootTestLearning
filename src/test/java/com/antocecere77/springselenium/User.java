package com.antocecere77.springselenium;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class User {

    private Address address;

    private Salary salary;

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Autowired
    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Address: " + this.address.getStreet());
        System.out.println("Salary: " + this.salary.getAmount());
    }
}
