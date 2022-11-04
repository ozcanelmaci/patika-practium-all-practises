package KDVCostCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double costWithoutKDV, costWithKDV, costOfKDV;
        int kdvPercent;

        System.out.print("Tutarı girin: ");
        costWithoutKDV = scn.nextDouble();
        kdvPercent = costWithoutKDV > 1000 ? 8 : 18;
        costOfKDV = costWithoutKDV * kdvPercent / 100;
        costWithKDV = costWithoutKDV + costOfKDV;

        System.out.println("KDV'siz Fiyat = " + costWithoutKDV);
        System.out.println("KDV Oranı = %" + kdvPercent);
        System.out.println("KDV'li Fiyat = " + costWithKDV);
        System.out.println("KDV Tutarı = " + costOfKDV);
    }
}
