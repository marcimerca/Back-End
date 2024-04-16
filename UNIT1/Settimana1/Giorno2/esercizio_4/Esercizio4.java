package esercizio_4;

import java.util.Scanner;

/*  #Esercizio #4 - for
Scrivere un programma che chiede all'utente di inserire un numero intero e stampi il conto alla rovescia a partire da quel numero fino a zero
 */
public class Esercizio4 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero");

        int n = scanner.nextInt();

        for(int i = n; i >= 0; i--) {
            System.out.println(i);
        }




    }
}
