package esercizio_1;

import java.util.Random;

public class NumeriCasuali {
    int[] array = new int[5];

    public int[] generaNumeri(){
        for(int i = 0; i< array.length; i++){
            array[i] = new Random().nextInt(1,11);
        }
        return array;

    }




}
