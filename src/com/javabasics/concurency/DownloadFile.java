package com.javabasics.concurency;

public class DownloadFile implements Runnable{

    private  DownloadStatus status;

    public DownloadFile(DownloadStatus status) {
        this.status = status;
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
}
