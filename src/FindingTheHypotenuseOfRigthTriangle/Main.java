package FindingTheHypotenuseOfRigthTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double firstPerpendicularEdge, secondPerpendicularEdge, hypotenuse, perimeterOfTriangle, areaOfTriangle, u;

        System.out.print("Birinci Dik Kenar Uzunluğu : ");
        firstPerpendicularEdge = scn.nextDouble();

        System.out.print("İkinci Dik Kenar Uzunluğu : ");
        secondPerpendicularEdge = scn.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(firstPerpendicularEdge,2) + Math.pow(secondPerpendicularEdge,2));
        System.out.println("Hipotenüs : " + hypotenuse);

        perimeterOfTriangle = firstPerpendicularEdge + secondPerpendicularEdge + hypotenuse;
        System.out.println("Üçgenin Çevresi : " + perimeterOfTriangle);

        u = perimeterOfTriangle / 2;
        areaOfTriangle = Math.sqrt(u * (u-firstPerpendicularEdge) * (u-secondPerpendicularEdge) * (u-hypotenuse));
        System.out.println("Üçgenin Alanı : " + areaOfTriangle);
    }
}
