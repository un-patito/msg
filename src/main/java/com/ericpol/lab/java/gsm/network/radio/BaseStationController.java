package com.ericpol.lab.java.gsm.network.radio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by xdzm on 2015-12-08.
 */
public class BaseStationController implements Serializable{

    private static final long serialVersionUID = -3155468100755579794L;

    private Set<BaseTransceiverStation> btsList = new HashSet<BaseTransceiverStation>();

    public Set<BaseTransceiverStation> getBtsList() {
        return btsList;
    }
    public void addBts(BaseTransceiverStation bts){
        btsList.add(bts);
    }

    @Override
    public String toString() {
        return "BaseStationController{" +
                "btsList=" + btsList +
                '}';
    }

    public Set<BaseTransceiverStation> getBtsSet() {
        return btsList;
    }
}
