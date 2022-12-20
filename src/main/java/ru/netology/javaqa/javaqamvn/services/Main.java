package ru.netology.javaqa.javaqamvn.services;

public class Main {

    public static void main(String[] args) {
        SqrtService service = new SqrtService();

        int min = 10;
        int max = 99;

        int count = service.calcSqrt(-150, 5);


            System.out.println(count);
    }
}


