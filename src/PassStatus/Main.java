package PassStatus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int mathematic, physics, chemistry, turkish, music, counterForLesson = 0;
        double average = 0.0;

        System.out.println("Not Ortalaması Hesaplayıcı");
        System.out.print("Matematik Notunuz: ");
        mathematic = scn.nextInt();

        System.out.print("Fizik Notunuz: ");
        physics = scn.nextInt();

        System.out.print("Kimya Notunuz: ");
        chemistry = scn.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkish = scn.nextInt();

        System.out.print("Müzik Notunuz: ");
        music = scn.nextInt();

        if(mathematic >= 0 && mathematic <= 100){
            average += mathematic;
            counterForLesson++;
        }
        if(physics >= 0 && physics <= 100){
            average += physics;
            counterForLesson++;
        }
        if(chemistry >= 0 && chemistry <= 100){
            average += chemistry;
            counterForLesson++;
        }
        if(turkish >= 0 && turkish <= 100){
            average += turkish;
            counterForLesson++;
        }
        if(music >= 0 && music <= 100){
            average += music;
            counterForLesson++;
        }

        if(counterForLesson != 0){
            average = average / counterForLesson;
            if (average >= 55){
                System.out.println("Tebrikler, sınıfı geçtiniz!");
            }else {
                System.out.println("Sınıfta kaldınız!!!");
            }
            System.out.println("Not ortalamanız : " + average);
        }else{
            System.out.println("Ortalamaya dahil edilebilecek notlar girmediniz!!!");
        }
    }
}