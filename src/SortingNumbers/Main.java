package SortingNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int firstNumber, secondNumber, thirdNumber;

        System.out.println("Lütfen birbirinden farklı sayılar giriniz!");
        System.out.print("Birinci sayı : ");
        firstNumber = scn.nextInt();

        System.out.print("İkinci sayı : ");
        secondNumber = scn.nextInt();

        System.out.print("Üçüncü sayı : ");
        thirdNumber = scn.nextInt();

        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            if(secondNumber > thirdNumber){
                System.out.println("\nSıralama : " + firstNumber + " > " + secondNumber + " > " + thirdNumber);
            }else {
                System.out.println("\nSıralama : " + firstNumber + " > " + thirdNumber + " > " + secondNumber);
            }
        }else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            if(firstNumber > thirdNumber){
                System.out.println("\nSıralama : " + secondNumber + " > " + firstNumber + " > " + thirdNumber);
            }else {
                System.out.println("\nSıralama : " + secondNumber + " > " + thirdNumber + " > " + firstNumber);
            }
        }else{
            if(firstNumber > secondNumber){
                System.out.println("\nSıralama : " + thirdNumber + " > " + firstNumber + " > " + secondNumber);
            }else {
                System.out.println("\nSıralama : " + thirdNumber + " > " + secondNumber + " > " + firstNumber);
            }
        }
    }
}
