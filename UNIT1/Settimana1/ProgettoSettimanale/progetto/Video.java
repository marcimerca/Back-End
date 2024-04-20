package progetto;

public class Video extends ElementoMultimediale implements Riproducibile, Luminosita {
    private int durata;
    public int volume;
    public int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
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
        for(int i =0; i < durata; i++) {
            System.out.println(this.getTitolo() +  stampaPuntiEsclamativiAsterischi());
        }
    }

    public String stampaPuntiEsclamativiAsterischi(){
        String stringa = "";
        for(int i =0; i < volume; i++) {
            stringa += "!";
        }
        for(int i = 0; i< luminosita; i++) {
            stringa += "*";
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

    @Override
    public void aumentaLuminosita() {
        this.luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        this.luminosita--;
    }

    @Override
    public void chiamaMetodo() {
        this.play();
    }
}
