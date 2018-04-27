package com.ericpol.lab.java.gsm.phone.charger;

import com.ericpol.lab.java.gsm.Producer;

public interface Charger {

	int getVoltage();

	Producer getProducer();

}
