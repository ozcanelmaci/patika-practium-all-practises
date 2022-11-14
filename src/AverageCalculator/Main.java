package AverageCalculator;

import java.util.Scanner;

/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program.
* */
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int targetNumber, average, counter = 0, sum = 0;

        System.out.println("0'dan girdiğiniz sayıya kadar 3 ve 4'e tam bölünen sayıların ortalamasını bulan program");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.print("\nHedef Sayıyı Giriniz : ");
        targetNumber = scn.nextInt();

        for (int i = 0; i <= targetNumber; i++) {
            if(i % 12 == 0 && i != 0){
                sum += i;
                counter++;
            }
        }
        if(counter != 0){
            average = sum / counter;
            System.out.println("0'dan girdiğiniz sayıya kadar 3 ve 4'e tam bölünen sayıların ortalaması : " + average);
        }else{
            System.out.println("0'dan girdiğiniz sayıya kadar 3 ve 4'e tam bölünen sayı bulunamadı!!!");
        }

    }
}
