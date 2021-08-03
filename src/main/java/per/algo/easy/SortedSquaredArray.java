package per.algo.easy;

public class SortedSquaredArray {
    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        // I should give focus onto one very important thing
        // that is input array is in sorted order.!!
        int smallest=0;
        int largest=array.length-1;
        int [] output=new int[array.length];
        int tobesquared=0;
        for(int i=array.length-1;i>=0;i--)
        {
            if(Math.abs(array[smallest])<Math.abs(array[largest]))
            {
                tobesquared=array[largest];
                largest--;
            }else{
                tobesquared=array[smallest];
                smallest++;
            }
         output[i]=tobesquared*tobesquared;
        }
        return output;
    }
}
