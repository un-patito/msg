package com.ericpol.lab.java.gsm.phone.htc;

import com.ericpol.lab.java.gsm.Producer;
import com.ericpol.lab.java.gsm.phone.Phone;


/**
 * Created by xdzm on 2016-01-29.
 */
public class HTCDesire extends Phone {

    public HTCDesire(int id) {
        super(id);
    }

    @Override
    public Producer getProducer() {
        return Producer.HTC;
    }

    @Override
    public String getModel() {
        return "Desire";
    }

    @Override
    public int getPowerConsumption() {
        return 15;
    }
}
