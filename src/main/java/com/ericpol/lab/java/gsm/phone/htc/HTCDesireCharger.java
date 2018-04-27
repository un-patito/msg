package com.ericpol.lab.java.gsm.phone.htc;

import com.ericpol.lab.java.gsm.Producer;
import com.ericpol.lab.java.gsm.phone.charger.Charger;

/**
 * Created by mwar on 2016-02-27.
 */
public class HTCDesireCharger implements Charger {

    public int getVoltage() {
        return 2;
    }

    public Producer getProducer() {
        return Producer.HTC;
    }

}
