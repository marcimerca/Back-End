package esercizio_3;

import java.util.Scanner;

/* Esercizio #3 - while
Scrivere un programma che chiede di inserire una stringa e la suddivida in caratteri separati dalla virgola. Il programma si ripete fino a che l'utente non inserisce la stringa ":q"
*/

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci stringa");
        String s = scanner.nextLine();

        while(!s.equals(":q") ) {
            for(int i = 0; i < s.length() ; i++) {
                if( i != s.length() - 1) {
                    System.out.print(s.charAt(i) + ",");
                } else {
                    System.out.print(s.charAt(i));
                }

            }
            System.out.println();
            System.out.println("Inserisci stringa");
           s = scanner.nextLine();

        }

    }




}
