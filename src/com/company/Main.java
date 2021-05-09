package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int m = 100;                                      // квадратные метры
        double height , weight;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.println("Идекс массы тела");

        try {
            System.out.print("Введите Ваш рост: ");
            height = input.nextDouble();
            System.out.print("Введите Ваш вес: ");
            weight = input.nextDouble();
        }
        catch (Exception e) {
            System.out.println("Ошибка ввода.Программа будет закрыта.");
            return;
        }

        result = weight / (height / m * height / m);       // формула перевода в М2
        String str = String.format ("Ваш ИМТ %.1f ",result);
        System.out.print(str);

        if (result>0 && result <=16.5) {
            System.out.println("Крайний недостаток веса");
        }
        if (result>=17 && result <=18.4){
            System.out.println("Недостаток в весе");
        }
        if (result>=18.5 && result <=24.9){
            System.out.println("Нормальный вес");
        }
        if (result>=25 && result <=30){
            System.out.println("Избыточная масса тела");
        }
        if (result>=30.1 && result <=34.9){
            System.out.println("Ожирение");
        }
        if (result>=35 && result <=40) {
            System.out.println("Тяжелое ожирение");
        }
        if (result>40){
            System.out.println("Крайне тяжёлое ожирение");
        }
    }
}
