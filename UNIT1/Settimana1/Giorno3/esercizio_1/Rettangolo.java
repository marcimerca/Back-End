package esercizio_1;

public class Rettangolo {

    private double h;
    private double l;

    public Rettangolo(double h, double l){
        this.h = h;
        this.l = l;

    }

    public double calcolaPerimetro() {
        return 2*(this.h+this.l);
    }

    public double calcolaArea() {
        return this.h*this.l;
    }

    public double getH() {
        return h;
    }

    public double getL() {
        return l;
    }


}
