package ChineseZodiacCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dateOfBirth, remainder;
        String chineseZodiac;

        System.out.print("Doğum Yılınızı Giriniz : ");
        dateOfBirth = scn.nextInt();

        remainder = dateOfBirth % 12;

        chineseZodiac = switch (remainder) {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "";
        };
        System.out.println("Çin Zodyağı Burcunuz : " + chineseZodiac);
    }
}
