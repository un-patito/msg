package com.ericpol.lab.java.gsm.utils;

import java.util.Date;
import java.util.Random;

public class IDGenerator {

    private static Random random = new Random(new Date().getTime());

    /**
     * provides randomm integer number
     * @return random integer number in 0 to 1000 range
     */
    public static int newID() {

        // TODO: implement identifier generation, cache already generated ids in a set to check if newly generated were used before

        return 0;
    }
}
