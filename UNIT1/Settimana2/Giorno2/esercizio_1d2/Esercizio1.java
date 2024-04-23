package esercizio_1d2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrivi il numero di elementi che vuoi inserire");
        int numero = scanner.nextInt();
        scanner.nextLine();

        HashSet<String> parole = new HashSet<>();


        String parola;
        ArrayList<String> paroleDuplicate = new ArrayList<>();


        while (parole.size() < numero) {
            System.out.println("Inserisci parola");
            parola = scanner.nextLine();
            if (!parole.add(parola)) {
                paroleDuplicate.add(parola);
            } else {
                parole.add(parola);
            }


        }


        System.out.println("Lista parole distinte: " + parole);
        System.out.println("Numero parole distinte: " + parole.size());
        System.out.println("Lista parole duplicate: " + paroleDuplicate);


    }
}
