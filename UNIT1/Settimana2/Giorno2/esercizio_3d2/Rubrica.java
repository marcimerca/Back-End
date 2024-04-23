package esercizio_3d2;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {
    private HashMap<String, Integer> contatti;

    public Rubrica(){
        contatti = new HashMap<String,Integer>();
    }

    public void aggiungiContatto( String nome, Integer numero){
        contatti.put(nome, numero);
    }

    public void rimuoviContatto( String nome){
        contatti.remove(nome);
    }

    public Integer cercaContattoPerNome(String nome){
       return contatti.get(nome);
    }

    public void cercaContattoDaNumero(Integer numero){
        Set<String> nomi = contatti.keySet();
        for(String nome: nomi){
            if(contatti.get(nome).equals(numero)){
                System.out.println(nome + " " + contatti.get(nome)); ;
            }
        }


    }






}
