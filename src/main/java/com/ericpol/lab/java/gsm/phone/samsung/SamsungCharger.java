package com.ericpol.lab.java.gsm.phone.samsung;

import com.ericpol.lab.java.gsm.Producer;
import com.ericpol.lab.java.gsm.phone.charger.Charger;

/**
 * Created by mwar on 2016-02-15.
 */
public class SamsungCharger implements Charger {

    public int getVoltage() {
        return 2;
    }

    public Producer getProducer() {
        return Producer.SAMSUNG;
    }

}
