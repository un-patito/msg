package com.ericpol.lab.java.gsm.network.core;

import com.ericpol.lab.java.gsm.network.radio.BaseStationController;
import com.ericpol.lab.java.gsm.network.radio.BaseTransceiverStation;
import com.ericpol.lab.java.gsm.phone.Phone;

import java.util.HashSet;
import java.util.Set;

public class MobileSwitchingCenter  {
    
    private VisitorLocationRegister vlr = new VisitorLocationRegister();

    private Set<BaseStationController> bscSet = new HashSet<BaseStationController>();

    private Set<BaseStationController> bscList = new HashSet<BaseStationController>();

    public void addBsc(BaseStationController bsc){
        bscList.add(bsc);
    }

    public BaseTransceiverStation attach(Phone p){
        int phoneId = p.getId();
        BaseTransceiverStation myBts = null;

        for (BaseStationController bsc : bscList){
            for(BaseTransceiverStation bts : bsc.getBtsList()){
                if(myBts==null || Math.abs(bts.getId() - phoneId) < Math.abs(myBts.getId() - phoneId)){
                    myBts = bts;
                }
            }
        }

        return myBts;
    }

    public Set<BaseTransceiverStation> getBtsSet(){
        Set<BaseTransceiverStation> btsSet = new HashSet<BaseTransceiverStation>();
        for(BaseStationController bsc : bscSet){
            btsSet.addAll(bsc.getBtsSet());
        }
        return btsSet;
    }

    @Override
    public String toString() {
        return "MobileSwitchingCenter{" +
                "bscList=" + bscList +
                ", vlr=" + vlr +
                '}';
    }
}
