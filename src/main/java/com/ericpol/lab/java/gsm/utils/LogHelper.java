package com.ericpol.lab.java.gsm.utils;


public class LogHelper {

    public static synchronized void log(Object entity, String msg){
        System.out.println("[thread=" + Thread.currentThread().getName() + "]\t[" + entity + "]\t" + msg);
    }
}
