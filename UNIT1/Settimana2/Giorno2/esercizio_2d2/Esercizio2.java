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


                    stampaElementi(true, lista1);

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

    public static ArrayList<Integer> restituisciListaModificata(ArrayList<Integer> array) {
        ArrayList<Integer> listaModificata = new ArrayList<>();
        listaModificata.addAll(array); //fa append

        ArrayList<Integer> listaClone = new ArrayList<>(array);

        
        Collections.reverse(listaClone);

        listaModificata.addAll(listaClone);

        return listaModificata;
    }


    public static void stampaElementi(boolean b, ArrayList<Integer> lista) {
        if (b) {
            for (int i = 0; i < lista.size(); i = i + 2) {
                System.out.println(lista.get(i));
            }

        } else {
            for (int i = 1; i < lista.size(); i = i + 2) {
                System.out.println(lista.get(i));
            }
        }
    }
}

