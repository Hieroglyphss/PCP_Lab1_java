package com.company;

public class Main {
    public static void main(String[] args) {
        BreakThread breakThread = new BreakThread();

        new MainThread(1, breakThread, 3000).start();
        new MainThread(2, breakThread, 5000).start();
        new MainThread(3, breakThread, 7000).start();
        new MainThread(4, breakThread, 9000).start();
        new MainThread(5, breakThread, 11000).start();
        new MainThread(6, breakThread, 13000).start();
        new MainThread(7, breakThread, 15000).start();
        new MainThread(8, breakThread, 17000).start();
        new MainThread(9, breakThread, 19000).start();
        new MainThread(10, breakThread, 21000).start();
        new MainThread(11, breakThread, 23000).start();
        new MainThread(12, breakThread, 25000).start();

        new Thread(breakThread).start(); // Управляючий потік
    }
}