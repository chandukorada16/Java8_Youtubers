package com.vtalent.batch28.arrays;

public class Demo {
    public static void main(String[] args) {
        final String resource1 = "chandu";
        final String resource2 = "java developer";
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread1: locked resource 1");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }
                synchronized (resource2) {
                    System.out.println("Thread 1:locked resource 2");
                }

            }

        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread2: locked resource 2");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }
                synchronized (resource1) {
                    System.out.println("Thread 2:locked resource 1");
                }

            }

        };
        t1.start();
        t2.start();
    }

    }
