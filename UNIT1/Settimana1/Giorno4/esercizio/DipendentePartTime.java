package esercizio;

public class DipendentePartTime extends Dipendente {

    private double oreLavorate;
    private double tariffaOraria;

    public  DipendentePartTime( String matricola,Dipartimento dipartimento, double oreLavorate, double tariffaOraria) {
        super(matricola, 0, dipartimento);
        this.oreLavorate = oreLavorate;
        this.tariffaOraria = tariffaOraria;

    }

    @Override
    public double calcolaSalario() {
        return oreLavorate * tariffaOraria;
    }
}
