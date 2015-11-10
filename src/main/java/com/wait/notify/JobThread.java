package com.wait.notify;

/**
 * Created by yl on 10.11.15.
 */
public class JobThread extends Thread{
    int total;
    @Override
    public void run(){

        synchronized(this){
            for(int i=0; i<10 ; i++){
                total += i;
                System.out.println("JobThread do some job " + i);
            }
            System.out.println("JobThread has been finished.");
            System.out.println();

            notify();
            System.out.println("JobThread: Hi, MainThread, i am finished.");
        }

    }
}
