package LeapYearCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year;

        System.out.print("Yıl Giriniz : ");
        year = scn.nextInt();

        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println(year + " artık bir yıldır!");
            }else {
                System.out.println(year + " artık bir yıl değildir!");
            }
        }else{
            if(year % 4 == 0){
                System.out.println(year + " artık bir yıldır!");
            }else{
                System.out.println(year + " artık bir yıl değildir!");
            }
        }
    }
}
