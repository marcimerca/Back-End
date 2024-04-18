package esercizio;

public class Volontario implements GestioneTurno {
    private String nome;
    private int eta;
    private String CV;

    public Volontario(String nome, int eta, String CV) {
        this.nome = nome;
        this.eta = eta;
        this.CV = CV;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println("Il volontario " + this.nome + " ha iniziato il turno.");
    }
}
