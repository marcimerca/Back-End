package esercizio_2d2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci numero");
        int n = scanner.nextInt();

        ArrayList<Integer> lista1 = restituisciListaOrdinata(n);
        System.out.println(lista1);

        ArrayList<Integer> listaModificata = restituisciListaModificata(lista1);
        System.out.println(listaModificata);



    }

    public static ArrayList<Integer> restituisciListaOrdinata(int n) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lista.add(new Random().nextInt(0, 101));
        }

        Collections.sort(lista);
        return lista;
    }

    //classe collection è classe di utility, dà metodi aggiuntivi

     public static ArrayList<Integer> restituisciListaModificata(ArrayList<Integer> array){
         ArrayList<Integer> listaModificata = new ArrayList<>();
         listaModificata.addAll(array); //fa append
         Collections.reverse(array);

         listaModificata.addAll(array);

         return listaModificata;
     }
}
