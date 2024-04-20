package progetto;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {

    private int durata;
    private int volume;


    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(this.getTitolo() + " " + (stampaPuntiEsclamativi()));
        }
    }

    public String stampaPuntiEsclamativi() {
        String stringa = "";
        for (int i = 0; i < volume; i++) {
            stringa += "!";
        }
        return stringa;
    }

    @Override
    public void alzaVolume() {
        this.volume++;
    }

    @Override
    public void abbassaVolume() {
        this.volume--;
    }

    public void chiamaMetodo() {
        this.play();
    }
}
