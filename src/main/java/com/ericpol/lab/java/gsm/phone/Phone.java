package com.ericpol.lab.java.gsm.phone;

import com.ericpol.lab.java.gsm.phone.charger.Charger;
import com.ericpol.lab.java.gsm.phone.charger.ChargingController;
import com.ericpol.lab.java.gsm.network.core.MobileSwitchingCenter;


public abstract class Phone {

    private int id;

    public static final int MAX_BATTERY = 100;

    private int battery = Phone.MAX_BATTERY;

    private Status status = Status.DISCONNECTED;

    // TODO: create abstract methods indicating phone producer, model, and power consumption

    public Phone(int id){
        this.id = id;
        // TODO: reduce battery just after creation
    }

    public void charge(Charger charger, int hours) {
        ChargingController controller = new ChargingController(this, charger);
        controller.plugIn(hours);
    };

    public void register(MobileSwitchingCenter msc){

        System.out.println(this + "registering ...");

        // TODO 1: attach to MSC when disconnected, log proper message otherwise.

        // TODO 2: log BTS phone is connected to

        // TODO 3: reduce battery

        // TODO 4: change status to connected

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
        return id + ":b=" + battery + ":s=" + status;
    }

    static enum Status {
        CONNECTED,
        DISCONNECTED
    }

}
