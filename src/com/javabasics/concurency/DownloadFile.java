package com.javabasics.concurency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadFile implements Runnable{

    private  DownloadStatus status;
    public DownloadFile() {
        this.status = new DownloadStatus();
    }

    @Override
    public void run() {
        System.out.println("Download Thread Name: " + Thread.currentThread().getName());
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Download complete " + Thread.currentThread().getName());

        for (var i=1; i<=10_000;i++){
            if(Thread.interrupted()) break;
            status.increment();
//            System.out.println("Downloaded bytes: " + i);

        }
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
