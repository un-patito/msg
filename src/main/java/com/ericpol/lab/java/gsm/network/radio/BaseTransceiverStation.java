package com.ericpol.lab.java.gsm.network.radio;

import java.io.Serializable;

public class BaseTransceiverStation implements Serializable{

    private int id;

    private BaseStationController bsc;

    public void setBsc(BaseStationController bsc) {
        this.bsc = bsc;
    }

    public BaseTransceiverStation(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BTS{ id=" + id + "\t}";
    }

}
