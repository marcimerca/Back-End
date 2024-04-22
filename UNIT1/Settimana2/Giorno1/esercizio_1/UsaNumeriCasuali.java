package esercizio_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class UsaNumeriCasuali {
    static Logger logger = LoggerFactory.getLogger("logger3");

    public static void main(String[] args) {
        NumeriCasuali numericasuali = new NumeriCasuali();

        int[] array1 = numericasuali.generaNumeri();
        stampaArray(array1);

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int numero;
        int posizione;
        System.out.println("Inserire un numero");
        numero = scanner.nextInt();


        while (numero != 0) {
            System.out.println("In quale posizione vuoi inserirlo?");
            posizione = scanner.nextInt();

            try {
                array1[posizione] = numero;
                stampaArray(array1);
            } catch (ArrayIndexOutOfBoundsException e) {
                logger.error("Le posizioni disponibili per inserire un numero vanno da 0 a 4.");
            }

            System.out.println("Inserire un numero");

            numero = scanner.nextInt();

        }

    }


    public static void stampaArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i <= 3) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i] + ".");
            }
        }

    }
}
