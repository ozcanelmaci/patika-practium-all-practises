package BodyMassIndexCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kilo (kg) / Boy(m) * Boy(m)
        double height, bodyMass, weight;
        Scanner scn = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = scn.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = scn.nextDouble();

        bodyMass = weight / (Math.pow(height,2));
        System.out.println("Vücut Kitle İndeksiniz : " + bodyMass);
    }
}
