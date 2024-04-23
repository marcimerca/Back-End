package esercizio_3d2;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {
    private HashMap<String, String> contatti;

    public Rubrica(){
        contatti = new HashMap<>();
    }

    public void aggiungiContatto( String nome, String numero){
        contatti.put(nome, numero);
    }

    public void rimuoviContatto( String nome){
        contatti.remove(nome);
    }

    public String cercaContattoPerNome(String nome){
       return contatti.get(nome);
    }

    public String cercaContattoDaNumero(String numero){
        Set<String> nomi = contatti.keySet();
        for(String nome: nomi){
            if(contatti.get(nome).equals(numero)){
               return nome;
            }
        }
        return null;

    }

    public void stampaRubrica(){
        System.out.println(contatti);
    }






}
