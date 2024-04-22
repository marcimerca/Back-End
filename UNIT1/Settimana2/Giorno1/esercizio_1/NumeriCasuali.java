package esercizio_1;

public class NumeriCasuali {
    int[] array = new int[5];

    public int[] generaNumeri(){
        for(int i = 0; i< array.length; i++){
            array[i] = (int) Math.floor(Math.random()* 11);
        }
        return array;

    }




}
