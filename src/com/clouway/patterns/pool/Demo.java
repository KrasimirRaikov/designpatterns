package com.clouway.patterns.pool;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Demo {
    public static void main(String[] args) throws NoAvailableChairsException {
        Pool pool = Pool.getInstance();
        pool.maxPoolSize(3);

        Chair chair1 = pool.aquire();
        System.out.println(chair1.toString());
        pool.release(chair1);

        Chair chair1Again = pool.aquire();
        System.out.println(chair1Again.toString());

        Chair chair2 = pool.aquire();
        System.out.println(chair2.toString());

        Chair chair3 = pool.aquire();
        System.out.println(chair3.toString());

        pool.release(chair2);
        pool.release(chair3);

        Chair chair2Again = pool.aquire();
        System.out.println(chair2Again.toString());
    }
}
