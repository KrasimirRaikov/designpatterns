package com.clouway.patterns.pool;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class ChairPoolFactory {

    private int maxSize;
    private int currentCount = 0;



    public void maxCreatedChairs(int maxSize) {
        this.maxSize = maxSize;
    }

    public Chair createChair() throws NoAvailableChairsException {
        if(currentCount<maxSize){
            currentCount++;
            return new Chair();
        }else{
            throw new NoAvailableChairsException("Sorry chair limit reached, and there are no free ones");
        }
    }
}
