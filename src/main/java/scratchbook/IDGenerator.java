package scratchbook;

import com.sun.xml.internal.ws.api.server.DocumentAddressResolver;

import java.util.*;

public class IDGenerator {

    private static Random random = new Random(new Date().getTime());
    private static Set ids = new HashSet();

    /**
     * provides randomm integer number
     *
     * @return random integer number in 0 to 1000 range
     */
    public static int newID() {

        // TODO: implement identifier generation, cache already generated ids in a set to check if newly generated were used before


        int newId;
        do {
            newId = random.nextInt(1000) + 1;
        } while (ids.contains(newId));
        ids.add(newId);

        System.out.println("IDs: " + ids);

        return newId;
    }
}