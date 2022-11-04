package KDVCostCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int kdvPercent, costWithoutKDV;
        double costWithKDV, costOfKDV;

        System.out.print("Tutarı girin: ");
        costWithoutKDV = scn.nextInt();
        kdvPercent = costWithoutKDV > 1000 ? 8 : 18;
        costOfKDV = (double)(costWithoutKDV * kdvPercent) / 100;
        costWithKDV = (double)(costWithoutKDV) + costOfKDV;

        System.out.println("KDV'siz Fiyat = " + costWithoutKDV);
        System.out.println("KDV'li Fiyat = " + costWithKDV);
        System.out.println("KDV Tutarı = " + costOfKDV);
    }
}
