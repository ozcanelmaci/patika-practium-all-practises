package FindingTheAreaOfPieceCircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        int radius;
        double angle, area;

        Scanner scn = new Scanner(System.in);
        System.out.print("Yarıçap : ");
        radius = scn.nextInt();

        System.out.print("Açı : ");
        angle = scn.nextDouble();

        area = (pi * radius * radius * angle) / 360;

        System.out.print("Yarıçapı " + radius + ", merkez açısının ölçüsü " + angle + " olan daire diliminin alanı : " + area);
    }
}
