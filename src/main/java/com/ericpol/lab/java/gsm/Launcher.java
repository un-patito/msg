package com.ericpol.lab.java.gsm;


/**
 * Created by xdzm on 2015-09-25.
 */
public class Launcher {


    public static void main(String[] args)  {

        System.out.println("[Launcher] starting system...");

        // TODO code here

        System.out.println("[Launcher] done.");
    }

/*
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
*/


}
