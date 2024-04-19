package progetto;

public class Immagine extends ElementoMultimediale implements Luminosita {

    public int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        this.luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        this.luminosita--;
    }


    public void show() {
        System.out.println(this.getTitolo() +  stampaAsterischi());
    }

    public String stampaAsterischi(){
        String stringa = "";
        for(int i =0; i < luminosita; i++) {
            stringa += "*";
        }
        return stringa;
    }


}
