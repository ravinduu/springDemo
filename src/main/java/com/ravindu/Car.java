package com.ravindu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Car{

    @Autowired
    VehicleTyres tyre;

    public VehicleTyres getTyre() {
        return tyre;
    }

    public void setTyre(GetTyres tyre) {
        this.tyre = tyre;
    }

    public void startEngine() {
        System.out.println("start .....");
        tyre.getTyres();
    }

}
