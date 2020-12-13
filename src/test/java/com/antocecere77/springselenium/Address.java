package com.antocecere77.springselenium;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Address {

    private String street;

    public Address() {
        this.street = "123 non main st";
    }
}
