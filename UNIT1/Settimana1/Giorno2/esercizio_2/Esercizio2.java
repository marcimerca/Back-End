/* Esercizio #2 - switch
Scrivere un programma che chiede un intero in ingresso e lo stampa in lettere se il valore è compreso tra 0 e 3, altrimenti stampa un messaggio d'errore usando il costrutto switch.
 */

package esercizio_2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci numero fra 0 e 3");

        int n = scanner.nextInt();

        daNumeroAStringa(n);
    }

    public static void daNumeroAStringa (int n) {
        switch (n) {
            case 0:
                System.out.println("Il numero è zero");
                break;
            case 1:
                System.out.println("Il numero è uno");
                break;
            case 2:
                System.out.println("Il numero è due");
                break;
            case 3:
                System.out.println("Il numero è tre");
                break;
            default:
                System.out.println("Errore, numero non compreso fra 0 e 3");
        }
    }


}
