package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BreakThread breakThread = new BreakThread();

        System.out.print("Введіть кількість потоків: ");
        int numberOfThreads = scanner.nextInt();

        long[] durations = new long[numberOfThreads]; // Массив тривалостей виконання у мілісекундах

        for (int i = 0; i < numberOfThreads; i++) {
            System.out.print("Тривалість для потоку " + (i + 1) + " в мілісекундах: ");
            durations[i] = scanner.nextLong();
        }

        for (int i = 0; i < numberOfThreads; i++) {
            new MainThread(i + 1, breakThread, durations[i]).start();
        }

        new Thread(breakThread).start(); // Управляючий потік

        scanner.close(); // Закриваємо сканер
    }
}
