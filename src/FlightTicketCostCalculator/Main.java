package FlightTicketCostCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int distance, age, typeOfTrip;
        double normalCost, discountForAge, discountForTypeOfTrip, costWithDiscount, totalCost;

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = scn.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = scn.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        typeOfTrip = scn.nextInt();

        if(typeOfTrip != 1 && typeOfTrip != 2){
            System.out.println("\nHatalı Veri Girdiniz");
        }
        else {
            if(distance >= 0){
                normalCost = distance * 0.10;
                if(age < 12){
                    discountForAge = normalCost * 0.5;
                    costWithDiscount = normalCost - discountForAge;
                } else if (age <= 24) {
                    discountForAge = normalCost * 0.1;
                    costWithDiscount = normalCost - discountForAge;
                } else if (age > 65) {
                    discountForAge = normalCost * 0.3;
                    costWithDiscount = normalCost - discountForAge;
                }else{
                    costWithDiscount = normalCost;
                }
                if(typeOfTrip == 2){
                    discountForTypeOfTrip = costWithDiscount * 0.20;
                    totalCost = (costWithDiscount - discountForTypeOfTrip) * 2;
                }else{
                    totalCost = costWithDiscount;
                }
                System.out.println("\nToplam Tutar : " + totalCost);
            }else {
                System.out.println("\nHatalı Veri Girdiniz");
            }
        }
    }
}
