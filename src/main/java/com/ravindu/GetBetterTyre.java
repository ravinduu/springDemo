package com.ravindu;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GetBetterTyre implements VehicleTyres {

    @Override
    public void getTyres() {
        System.out.println("Better tyre....");
    }
}
