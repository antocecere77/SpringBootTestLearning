package com.antocecere77.springselenium;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Salary {

    @Value("${amount:500}")
    int amount;
}
