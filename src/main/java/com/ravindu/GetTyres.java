package com.ravindu;

import org.springframework.stereotype.Component;

@Component
public class GetTyres implements VehicleTyres{

    @Override
    public void getTyres() {
        System.out.println("best tyres....");
    }
}
