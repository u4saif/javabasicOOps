package com.javabasics.concurency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {


    public void show(){
        List<DownloadFile> downloadFileList = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        for(var i=0;i<10;i++){
            var task = new DownloadFile();
            downloadFileList.add(task);

            Thread thread = new Thread(task);
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

        var toralBytes = downloadFileList.stream()
                        .map(t->t.getStatus().getTotalBytes())
                                .reduce(Integer::sum);
        System.out.println("Toal Bytes downlaoded: "+ toralBytes);


    }
}
