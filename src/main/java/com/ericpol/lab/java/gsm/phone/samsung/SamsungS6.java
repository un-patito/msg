package com.ericpol.lab.java.gsm.phone.samsung;

import com.ericpol.lab.java.gsm.Producer;
import com.ericpol.lab.java.gsm.phone.Phone;

public class SamsungS6 extends Phone {

    public SamsungS6(int id) {
        super(id);
    }

    @Override
    public Producer getProducer() {
       return Producer.SAMSUNG;
    }

    @Override
    public String getModel() {
        return "S6";
    }

    @Override
    public int getPowerConsumption() {
        return 12;
    }
}
