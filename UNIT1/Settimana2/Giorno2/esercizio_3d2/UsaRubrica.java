package esercizio_3d2;

public class UsaRubrica {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        rubrica.aggiungiContatto("Mario",3433553);
        System.out.println(rubrica.cercaContattoPerNome("Mario"));
        rubrica.cercaContattoDaNumero(3433553);
    }
}
