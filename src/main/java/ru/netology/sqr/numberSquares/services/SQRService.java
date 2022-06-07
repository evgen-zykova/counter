package ru.netology.sqr.numberSquares.services;

public class SQRService {
    public int calcSqr(int limitA, int limitB) {
        int counter = 0;
        for (int a = 10; a <= 99; a++) {
            int i = a * a;
            if (i <= limitA) {
                continue;
            }
            if (i >= limitB) {
                break;
            }
            counter = counter + 1;
        }
        return counter;
    }
}
