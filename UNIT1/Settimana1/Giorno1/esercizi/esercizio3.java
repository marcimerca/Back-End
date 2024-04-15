package esercizi;

import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci lato1 del rettangolo");

       double l1 = scanner.nextFloat();

        System.out.println("Inserisci lato2 del rettangolo");

        double l2 = scanner.nextFloat();

        System.out.println("Il perimetro del rettangolo è " + perimetroRettangolo(l1, l2) );

        System.out.println("Inserisci numero");
        int x = scanner.nextInt();

        System.out.println(pariDispari(x));


        System.out.println("Inserisci lato1 del triangolo");
        double l1t = scanner.nextDouble();
        System.out.println("Inserisci lato2 del triangolo");
        double l2t = scanner.nextDouble();
        System.out.println("Inserisci lato3 del triangolo");
        double l3t = scanner.nextDouble();

        System.out.println("L'area del triangolo è " + areaTriangolo(l1t, l2t, l3t) );
    }
    public static double perimetroRettangolo(double a, double b){
        return 2*(a + b);
    }

    public static int pariDispari(int x){
        if(x%2 == 0){
            return 0;
        } else {
            return 1;
        }
    }
    public static double areaTriangolo(double a, double b, double c){
       double semiPerim = (a + b + c) /2;
       return Math.sqrt(semiPerim*(semiPerim - a)* (semiPerim-b)* (semiPerim-c));
    }
}
