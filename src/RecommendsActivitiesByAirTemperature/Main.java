package RecommendsActivitiesByAirTemperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int temperature;
        System.out.print("Sıcaklığı giriniz : ");
        temperature = scn.nextInt();

        if(temperature < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if (temperature <= 25) {
            if(temperature <= 15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if(temperature >= 10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
