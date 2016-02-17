package com.clouway.patterns.pool;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Pool {
    private static Pool ourInstance = new Pool();
    List<Chair> chairPool = new ArrayList<Chair>();
    ChairPoolFactory poolFactory = new ChairPoolFactory();

    public static Pool getInstance() {
        return ourInstance;
    }

    private Pool() {
    }

    public Chair aquire() throws NoAvailableChairsException {
        if(chairPool.size()>0) {
            Chair chair = chairPool.get(0);
            chairPool.remove(0);
            return chair;
        }
        return poolFactory.createChair();
    }


    public void release(Chair chair){
            chairPool.add(chair);
    }

    public void maxPoolSize(int maxSize) {
        poolFactory.maxCreatedChairs(maxSize);
    }

}
