package com.ericpol.lab.java.gsm;


import com.ericpol.lab.java.gsm.network.core.MobileSwitchingCenter;
import com.ericpol.lab.java.gsm.network.radio.BaseStationController;
import com.ericpol.lab.java.gsm.network.radio.BaseTransceiverStation;
import com.ericpol.lab.java.gsm.phone.Phone;
import com.ericpol.lab.java.gsm.phone.charger.Charger;
import com.ericpol.lab.java.gsm.phone.htc.HTCDesire;
import com.ericpol.lab.java.gsm.phone.htc.HTCDesireCharger;
import com.ericpol.lab.java.gsm.phone.samsung.SamsungCharger;
import com.ericpol.lab.java.gsm.phone.samsung.SamsungS6;
import com.ericpol.lab.java.gsm.utils.IDGenerator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xdzm on 2015-09-25.
 */
public class Launcher {

    public static void main(String[] args)  {

        System.out.println("[Launcher] starting system...");

        Phone samsungss6       = new SamsungS6(3);
        Phone htc              = new HTCDesire(2);

        Charger samsungCharger = new SamsungCharger();
        Charger HTCCharger     = new HTCDesireCharger();

        samsungss6.charge(samsungCharger, 3);
        htc.charge(HTCCharger, 2);

        Box<Phone>   phoneBox   = new Box<Phone>();
        Box<Charger> chargerBox = new Box<Charger>();

        phoneBox.setItem(samsungss6);
        chargerBox.setItem(samsungCharger);

        Map<Producer, Box <Phone>> flagshipPhones = new HashMap<Producer, Box<Phone>>();
        flagshipPhones.put(Producer.SAMSUNG, phoneBox);

        samsungss6 = flagshipPhones.get(Producer.SAMSUNG).getItem();

        samsungss6.register(initInfrastructure());

        System.out.println("[Launcher] done.");
    }


    private static MobileSwitchingCenter initInfrastructure(){

        MobileSwitchingCenter msc = new MobileSwitchingCenter();

        BaseStationController bsc1 = new BaseStationController();
        BaseTransceiverStation bts11 = new BaseTransceiverStation(IDGenerator.newID());
        BaseTransceiverStation bts12 = new BaseTransceiverStation(IDGenerator.newID());
        BaseTransceiverStation bts13 = new BaseTransceiverStation(IDGenerator.newID());
        bsc1.addBts(bts11);
        bsc1.addBts(bts12);
        bsc1.addBts(bts13);
        msc.addBsc(bsc1);

        BaseStationController bsc2 = new BaseStationController();
        BaseTransceiverStation bts21 = new BaseTransceiverStation(IDGenerator.newID());
        BaseTransceiverStation bts22 = new BaseTransceiverStation(IDGenerator.newID());
        BaseTransceiverStation bts23 = new BaseTransceiverStation(IDGenerator.newID());
        BaseTransceiverStation bts24 = new BaseTransceiverStation(IDGenerator.newID());
        bsc2.addBts(bts21);
        bsc2.addBts(bts22);
        bsc2.addBts(bts23);
        bsc2.addBts(bts24);
        msc.addBsc(bsc2);

        BaseStationController bsc3 = new BaseStationController();
        BaseTransceiverStation bts31 = new BaseTransceiverStation(IDGenerator.newID());
        BaseTransceiverStation bts32 = new BaseTransceiverStation(IDGenerator.newID());
        bsc3.addBts(bts31);
        bsc3.addBts(bts32);
        msc.addBsc(bsc3);

        return msc;
    }

}
