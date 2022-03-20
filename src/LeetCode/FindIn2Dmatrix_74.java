package LeetCode;

public class FindIn2Dmatrix_74 {

    /*Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

    Integers in each row are sorted from left to right.
    The first integer of each row is greater than the last integer of the previous row.*/

    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};
        int target = 3;
        FindIn2Dmatrix_74.GetValuein2D(matrix, target);
    }

    private static void GetValuein2D(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == target) {
                    System.out.println("index is " + "[" + i + ", " + j + "]" );
                }
            }
        }
    }

}
