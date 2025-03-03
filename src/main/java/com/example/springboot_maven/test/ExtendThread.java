package com.example.springboot_maven.test;

import java.sql.SQLOutput;

public class ExtendThread extends Thread{// 继承自Thread

    private String name;
    public ExtendThread(String name){
        this.name = name;
    }

    @Override
    public void run(){// 必须重写run方法，并且将线程任务放到run里执行
        for (int i= 0; i<5; i++){
            System.out.println(name + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExtendThread t1 = new ExtendThread("线程一");
        ExtendThread t2 = new ExtendThread("线程二");
        t1.start();
        t2.start();
    }
}
//public class MyRunnable implements Runnable{// 必须要实现Runnable接口
//    private String name;
//    public MyRunnable(String name){
//        this.name = name;
//    }
//    @Override
//    public void run() {// 必须要有run方法，并且将需要执行的任务放到run方法里
//        for (int i= 0; i<5; i++){
//            System.out.println(name + i);
//            try{
//                Thread.sleep(1000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        MyRunnable runnable1 = new MyRunnable("线程a");
//        MyRunnable runnable2 = new MyRunnable("线程A");
//
//        Thread thread1 = new Thread(runnable1);
//        Thread thread2 = new Thread(runnable2);
//
//        thread2.start();
//        thread1.start();
//    }
//
//
//}