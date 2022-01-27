import java.util.Arrays;

public class multidimensional_array {
    public static void main(String[] args) {
        int[][] mult ={
                {1,2,3,6},
                {4,5,6,9},
                {8,9987,96,46,21,146,3}
        };


//        System.out.println(Arrays.toString(mult));
//        System.out.println(mult[1].length);



//        for (int row = 0; row < mult.length; row++) {
//            for (int col = 0; col < mult[row].length; col++) {
//                System.out.print(mult[row][col] + " ");
//            }
//            System.out.println();
//        }


        for (int[] ints : mult) {
            System.out.println(Arrays.toString(ints));

        }

    }
}
