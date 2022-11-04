package FindingTheHypotenuseOfRigthTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //ÖNEMLİ NOT : hipotenüs bulma kodu için yorum satırındaki kodu, 3 kenar uzunluğunu alıp alan bulma kodu için programı direkt çalıştırın.

//        double firstPerpendicularEdge, secondPerpendicularEdge, hypotenuse;
//
//        System.out.print("Birinci Dik Kenar Uzunluğu : ");
//        firstPerpendicularEdge = scn.nextDouble();
//
//        System.out.print("İkinci Dik Kenar Uzunluğu : ");
//        secondPerpendicularEdge = scn.nextDouble();
//
//        hypotenuse = Math.sqrt(Math.pow(firstPerpendicularEdge,2) + Math.pow(secondPerpendicularEdge,2));
//        System.out.println("Hipotenüs : " + hypotenuse);

        double firstEdge, secondEdge, thirdEdge, perimeterOfTriangle, areaOfTriangle, u;

        System.out.print("Birinci Kenar Uzunluğu : ");
        firstEdge = scn.nextDouble();

        System.out.print("İkinci Kenar Uzunluğu : ");
        secondEdge = scn.nextDouble();

        System.out.print("Üçüncü Kenar Uzunluğu : ");
        thirdEdge = scn.nextDouble();

        perimeterOfTriangle = firstEdge + secondEdge + thirdEdge;
        System.out.println("Üçgenin Çevresi : " + perimeterOfTriangle);

        u = perimeterOfTriangle / 2;//the half of perimeter
        areaOfTriangle = Math.sqrt(u * (u-firstEdge) * (u-secondEdge) * (u-thirdEdge));
        System.out.println("Üçgenin Alanı : " + areaOfTriangle);
    }
}
