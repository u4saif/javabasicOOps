package com.javabasics.concurency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {

    public void show(){
        var statusDownload = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();
        for(var i=0;i<10;i++){
        Thread thread = new Thread(new DownloadFile(statusDownload));
        thread.start();
        threads.add(thread);
        }

        for (var thread:threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Toal Bytes downlaoded: "+ statusDownload.getTotalBytes());


    }
}
