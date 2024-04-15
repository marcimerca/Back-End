package esercizi;

import java.util.Arrays;

public class esercizio1 {
    public static void main(String[] args) {


        System.out.println(moltiplica(3,5));

        System.out.println(concatena("Sono nato nel ", 1997));

        String[] arr1 = {"ciao","a","Marcello","come", "va?"};

        String stringa = "te";

        System.out.println(Arrays.toString(inserisciInArray(arr1, stringa)));
    }
    public static int moltiplica (int x, int y){
        return x*y;
    }

    public static String concatena (String a, int x){
        return a + x;
    }

    public static String[] inserisciInArray (String[] arrStr, String a  ){
        String[] arrayFinale = new String[6] ;

        arrayFinale[0] = arrStr[0];
        arrayFinale[1] = arrStr[1];
        arrayFinale[2] = a;
        arrayFinale[3]=  arrStr[2];
        arrayFinale[4]=  arrStr[3];
        arrayFinale[5]=  arrStr[4];
        return arrayFinale;








    }

}
