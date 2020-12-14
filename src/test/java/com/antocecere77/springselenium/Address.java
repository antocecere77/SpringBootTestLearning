package com.antocecere77.springselenium;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Address {

    @Value("${street}")
    private String street;
}
