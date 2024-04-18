package esercizio;

public class Dirigente extends Dipendente {

    public double bonus;

    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento, double bonus) {
        super(matricola, stipendio, dipartimento);
        this.bonus = bonus;
    }

    @Override
    public double calcolaSalario() {
        return super.calcolaSalario() + bonus;
    }
}
