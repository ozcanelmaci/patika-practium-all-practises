package AvarageGradeCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int mathematic, physics, chemistry, history, turkish, music;
        double average;
        String result;

        System.out.println("Not Ortalaması Hesaplayıcı");
        System.out.print("Matematik Notunuz: ");
        mathematic = scn.nextInt();

        System.out.print("Fizik Notunuz: ");
        physics = scn.nextInt();

        System.out.print("Kimya Notunuz: ");
        chemistry = scn.nextInt();

        System.out.print("Tarih Notunuz: ");
        history = scn.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkish = scn.nextInt();

        System.out.print("Müzik Notunuz: ");
        music = scn.nextInt();

        average = (double)(mathematic + physics + chemistry + history + turkish + music) / 6;
        System.out.println("\nNot ortalamanız : " + average);

        result = average > 60 ? "\nSınıfı Geçti" : "\nSınıfta Kaldı";
        System.out.println(result);
    }
}