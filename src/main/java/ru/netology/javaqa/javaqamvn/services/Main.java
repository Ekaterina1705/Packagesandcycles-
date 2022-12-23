package ru.netology.javaqa.javaqamvn.services;

import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();

        int min = 10;
        int max = 99;

        int count = service.calculateSQR(-150, 5);


            System.out.println(count);
    }
}


