package per.algo.easy;

import java.util.Arrays;

public class NonConstructableChange {

    //least non constructable change

    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.
        Arrays.sort(coins);

        int minumumAmount=0;


           for (int i =0;i<coins.length;i++){

                if( coins[i]>minumumAmount+1)
                {
                    return minumumAmount+1;
                } else{
                    minumumAmount+=coins[i];
                }

           }

        return minumumAmount+1;
    }

    public static void main(String[] args) {

        int[] input=new int[]  {1,1,1,1,1 }; //  1,1,2,3,5,7,22


        System.err.println(nonConstructibleChange(input));
    }
}
