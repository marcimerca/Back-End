package esercizio;

public abstract class Dipendente implements GestioneTurno {
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public double calcolaSalario(){
        return getStipendio();
    };

    @Override
    public void checkIn() {
        System.out.println("Il dipendente con matricola: " + this.getMatricola() + " ha iniziato il turno.");
    }
}
