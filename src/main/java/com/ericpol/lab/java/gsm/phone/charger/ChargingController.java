package com.ericpol.lab.java.gsm.phone.charger;

import com.ericpol.lab.java.gsm.phone.Phone;

public class ChargingController {

    private Charger charger;

    private Phone phone;

    public ChargingController(Phone phone, Charger charger){
        this.phone = phone;
        this.charger = charger;
    }

    public void plugIn(final int hours) throws IncompatibleChargerException{

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

    private void compatibilityCheck() throws IncompatibleChargerException{

        if(charger.getProducer()!=phone.getProducer()){
            throw new IncompatibleChargerException("charger of producer " + charger.getProducer() +
                    "does not match phone producer " + phone.getProducer());
        }

    }
    private boolean charge(){

        int battery  = phone.getBattery();
        int increase = charger.getVoltage();
        boolean batteryFull = false;

        battery+=increase;

        if(battery>=Phone.MAX_BATTERY){
            batteryFull = true;
            phone.setBattery(Phone.MAX_BATTERY);
        } else {
            phone.setBattery(battery);
        }
        return batteryFull;

        // TODO: increase battery level, ensure doesn't exceed maximum value, return info if full


    }

    public Charger getCharger() {
        return charger;
    }

    public Phone getPhone() {
        return phone;
    }
}
