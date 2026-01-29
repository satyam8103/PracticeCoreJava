import java.util.Arrays;

public class MultidimensionArray {
    public static void main(String[] args) {
        int [][] arr = new int[3][]; // will have to give size in row of the array

        int [][] arr2 = {
                {1,2,3},
                {4,5},
                {9,3,1}
        };
        System.out.println(Arrays.toString(arr2[1]));
    }
}
