package com.ericpol.lab.java.gsm.phone.charger;

import com.ericpol.lab.java.gsm.phone.Phone;

public class ChargingController {

    private Charger charger;

    private Phone phone;

    public ChargingController(Phone phone, Charger charger){
        this.phone = phone;
        this.charger = charger;
    }

    public void plugIn(final int hours){

        compatibilityCheck();

        for(int i=1;i<=hours;i++) {
            System.out.println(phone + "charging...");
            try {
                Thread.sleep(5*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(charge()){
                System.out.println(phone + "battery full. charging interrupted.");
                break;
            };
        }
        System.out.println(phone + "charging finished.");
    }

    private void compatibilityCheck(){

    }

    private boolean charge(){

        int battery = phone.getBattery();
        int increase = charger.getVoltage();
        boolean batteryFull = false;

        // TODO 1: increase battery level

        // TODO 2: check if level didn't exeeded maximum level

        // TODO 3: return information if battery is full already

        return batteryFull;
    }

    public Charger getCharger() {
        return charger;
    }

    public Phone getPhone() {
        return phone;
    }
}
