package esercizio_3d2;

public class UsaRubrica {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        rubrica.aggiungiContatto("Mario","3433553");
        rubrica.aggiungiContatto("Giovanni","0239929");
        rubrica.stampaRubrica();

        System.out.println(rubrica.cercaContattoPerNome("Mario"));
        System.out.println(rubrica.cercaContattoDaNumero("3433553"));
        System.out.println(rubrica.cercaContattoDaNumero("1233443"));

        rubrica.rimuoviContatto("Mario");
        rubrica.stampaRubrica();
    }
}
