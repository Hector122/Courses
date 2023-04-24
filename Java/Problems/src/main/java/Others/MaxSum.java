package Others;


import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxSum {

//    public Array[] number(int[] numbs){
////       int max = Arrays.stream(numbs).max().getAsInt();
////       int sum =
//
//    }

    public int getMax(int[] numbs){
        int max = numbs[0];
        for (int numb : numbs) {
            if (numb > max) {
                max = numb;
            }
        }
        return max;
    }
}


// {1,4,7,9,34}