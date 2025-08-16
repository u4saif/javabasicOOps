package com.javabasics.concurency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
//    private Lock lock = new ReentrantLock();

    public void increment(){
        try{
//            lock.lock();
             totalBytes++;
        }catch (RuntimeException e){
            System.out.println(e);
        }
//        finally {
//        lock.unlock();
//        }
    }

    public int getTotalBytes() {
        return totalBytes;
    }
}
