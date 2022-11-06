package GroceryCashierProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PEAR = 2.14;
        final double APPLE = 3.67;
        final double TOMATO = 1.11;
        final double BANANA = 0.95;
        final double AUBERGINE = 5.00;
        Scanner scn = new Scanner(System.in);
        double cost;
        int amountOfPear, amountOfApple, amountOfTomato, amountOfBanana, amountOfAubergine;

        System.out.print("Armut kaç kilo? : ");
        amountOfPear = scn.nextInt();

        System.out.print("Elma kaç kilo? : ");
        amountOfApple = scn.nextInt();

        System.out.print("Domates kaç kilo? : ");
        amountOfTomato = scn.nextInt();

        System.out.print("Muz kaç kilo? : ");
        amountOfBanana = scn.nextInt();

        System.out.print("Patlıcan kaç kilo? : ");
        amountOfAubergine = scn.nextInt();

        cost = (amountOfPear * PEAR) + (amountOfApple * APPLE) + (amountOfTomato * TOMATO) + (amountOfBanana * BANANA)
                + (amountOfAubergine * AUBERGINE);
        System.out.println("Toplam Tutar : " + cost + " TL");
    }
}
