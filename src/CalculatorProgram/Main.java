package CalculatorProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int firstNumber, secondNumber, selection;

        System.out.print("İlk sayıyı giriniz: ");
        firstNumber = scn.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        secondNumber = scn.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        selection = scn.nextInt();

        switch (selection){
            case 1:
                System.out.println("Toplam : " + sum(firstNumber,secondNumber));
                break;
            case 2:
                System.out.println("Çıkarma : " + subtract(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println("Çarpma : " + multiply(firstNumber,secondNumber));
                break;
            case 4:
                if(secondNumber == 0){
                    System.out.println("Sayılar 0'a bölünemez!!!");
                }else{
                    System.out.println("Bölme : " + divide(firstNumber,secondNumber));
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız!!!");
        }
    }

    public static int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public static int subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public static double divide(int firstNumber, int secondNumber){
        return (double) firstNumber / secondNumber;
    }
}
