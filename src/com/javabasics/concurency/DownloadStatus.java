package com.javabasics.concurency;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private int totalBytes;

    public void increment(){
        totalBytes++;
    }

    public int getTotalBytes() {
        return totalBytes;
    }
}
