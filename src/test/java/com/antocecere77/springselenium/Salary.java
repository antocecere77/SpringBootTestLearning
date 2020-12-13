package com.antocecere77.springselenium;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Salary {

    int amount;

    public Salary() {
        this.amount = 1000;
    }


}
