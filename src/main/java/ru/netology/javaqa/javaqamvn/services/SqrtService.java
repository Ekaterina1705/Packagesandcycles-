package ru.netology.javaqa.javaqamvn.services;

public class SqrtService {
    public int calcSqrt (int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= min && x <= max) {
                count++;
            }
        }
        return count;
    }
}
