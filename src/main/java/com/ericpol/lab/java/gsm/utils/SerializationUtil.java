package com.ericpol.lab.java.gsm.utils;

import java.io.*;

/**
 * Created by xdzm on 2015-12-09.
 */
public class SerializationUtil {

    public static void serialize(Object o, String fileName){

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Object deserialize(String fileName){

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(fileName));
            return ois.readObject();
        } catch (IOException e){
            return null;
        } catch (ClassNotFoundException e) {
            return null;
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
