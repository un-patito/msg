package com.ericpol.lab.java.gsm.phone;

import com.ericpol.lab.java.gsm.Producer;
import com.ericpol.lab.java.gsm.network.radio.BaseTransceiverStation;
import com.ericpol.lab.java.gsm.phone.charger.Charger;
import com.ericpol.lab.java.gsm.phone.charger.ChargingController;
import com.ericpol.lab.java.gsm.network.core.MobileSwitchingCenter;
import com.ericpol.lab.java.gsm.phone.charger.IncompatibleChargerException;
import com.ericpol.lab.java.gsm.utils.LogHelper;

import java.util.Set;


public abstract class Phone {

    private int id;

    public static final int MAX_BATTERY = 100;

    private int battery = Phone.MAX_BATTERY;

    private Status status = Status.DISCONNECTED;

    public abstract Producer getProducer();

    public abstract String getModel();

    public abstract int getPowerConsumption();

    public Phone(int id){
        this.id = id;
        battery-=getPowerConsumption();
    }

    public void charge(Charger charger, int hours) {
        ChargingController controller = new ChargingController(this, charger);
        try {
            controller.plugIn(hours);
        } catch (IncompatibleChargerException e) {
            e.printStackTrace();
        }
    };

    public void register(MobileSwitchingCenter msc){

        LogHelper.log(this, "registering ...");

        if(status==Status.DISCONNECTED) {
            BaseTransceiverStation bts = msc.attach(this);
            battery -= getPowerConsumption();
            status = Status.CONNECTED;
            LogHelper.log(this, "connected to " + bts);

        } else {
            LogHelper.log(this, "already connected. registration skipped.");
        }
    }

    private BaseTransceiverStation findClosestStation(Set<BaseTransceiverStation> btsSet){
        BaseTransceiverStation candidate = null;

        // TODO: return the closest bts. phone and bts ids represent location

        for(BaseTransceiverStation bts : btsSet){
            if(candidate==null || Math.abs(bts.getId()-id) < Math.abs(candidate.getId()-id)){
                candidate = bts;
            }
        }

        return candidate;
    }

    public int getId() {
        return id;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int v){
        battery = v;
    }

    public String toString(){
        return getProducer() + " " + getModel() + ":" + id + ":b="
                + battery + ":s=" + status;
    }
    static enum Status {
        CONNECTED,
        DISCONNECTED
    }

}
