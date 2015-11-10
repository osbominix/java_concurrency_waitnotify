package com.wait.notify;

/**
 * Created by yl on 10.11.15.
 */
public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        JobThread jobThread = new JobThread();
        jobThread.start();

        synchronized(jobThread){
            try{

                System.out.println();
                System.out.println("MainThread: I am Waiting for jobThread to complete.");
                System.out.println();
                jobThread.wait();

                System.out.println("MainThread: Okay, it's my turn.");
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println();
            System.out.println("MainThread: let's get the value of jobThread.total: " + jobThread.total);
            System.out.println();
        }
    }
}
