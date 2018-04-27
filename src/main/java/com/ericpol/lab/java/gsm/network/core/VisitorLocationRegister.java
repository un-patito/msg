package com.ericpol.lab.java.gsm.network.core;

import com.ericpol.lab.java.gsm.network.radio.BaseTransceiverStation;
import com.ericpol.lab.java.gsm.phone.Phone;

import java.io.File;
import java.io.IOException;

public class VisitorLocationRegister {

    private static final String VLR_FILE = "D:/vlr.txt";

    private File vlrFile;

    public VisitorLocationRegister(){
        vlrFile = new File(VLR_FILE);
        if(!vlrFile.exists()){
            try {
                vlrFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void register(Phone phone, BaseTransceiverStation bts) {

        // TODO : save Phone and BTS info into file
    }
}
