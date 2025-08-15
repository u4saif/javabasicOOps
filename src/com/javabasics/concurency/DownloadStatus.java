package com.javabasics.concurency;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private AtomicInteger totalBytes = new AtomicInteger();

    public void increment(){
        totalBytes.incrementAndGet();
    }

    public int getTotalBytes() {
        return totalBytes.get();
    }
}
