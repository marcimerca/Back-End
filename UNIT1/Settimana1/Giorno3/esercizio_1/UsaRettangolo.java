package esercizio_1;

public class UsaRettangolo {
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(4.5,9);

        Rettangolo rettangolo2 = new Rettangolo(3,2.5);

        System.out.println(rettangolo1.getH());

        stampaRettangolo(rettangolo1);
        stampaRettangolo(rettangolo2);
        stampaDueRettangoli(rettangolo1, rettangolo2);



    }
    public static void stampaRettangolo(Rettangolo r){
        System.out.println("Il perimetro del rettangolo è " + r.calcolaPerimetro() + ". L'area del rettangolo è " + r.calcolaArea() );

    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {

        System.out.println("Il perimetro del primo rettangolo è " + r1.calcolaPerimetro() + " e la sua area è " + r1.calcolaArea() + "." + " Il perimetro del secondo rettangolo è " + r2.calcolaPerimetro() + " e la sua area è " + r2.calcolaArea() + "." + "La somma dei perimetri dei due rettangoli è " + (r1.calcolaPerimetro() + r2.calcolaPerimetro()) + "." + "La somma delle aree dei due rettangoli è " + (r1.calcolaArea() + r2.calcolaArea())+ ".");
    }


}
