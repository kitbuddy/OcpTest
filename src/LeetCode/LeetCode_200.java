package LeetCode;
/*Given an m x n 2D binary grid grid which represents a map of '1's (land)
 and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent
lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.*/
public class LeetCode_200 {

    public static void main(String[] args) {
        String[][] grid = {
                {"1", "1", "1", "1", "0"},
                {"1", "1", "0", "1", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "0", "0", "0"}
        };

        char [][] grid1 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
                };

        System.out.println(  LeetCode_200.numIslands(grid));
        System.out.println(  LeetCode_200.numIslands2(grid1));
    }

    public static int numIslands(String[][] grid) {

        int count = 0;

        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == "1"){
                    count++;
                    callBFS(grid, i, j);
                }
            }
        }
        return count;
    }

    private static void callBFS(String[][] grid, int i, int j) {

        if (i<0 || i>= grid.length || j<0|| j>= grid[i].length || grid[i][j] == "0"){
            return;
        }

        grid[i][j] = "0";
        callBFS(grid, i+1, j);
        callBFS(grid, i-1, j);
        callBFS(grid, i, j+1);
        callBFS(grid, i, j-1);
    }


    public static int numIslands2(char[][] grid) {

        int count = 0;

        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == '1'){
                    count++;
                    callBFS2(grid, i, j);
                }
            }
        }
        return count;
    }

    private static void callBFS2(char[][] grid, int i, int j) {

        if (i<0 || i>= grid.length || j<0|| j>= grid[i].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';
        callBFS2(grid, i+1, j);
        callBFS2(grid, i-1, j);
        callBFS2(grid, i, j+1);
        callBFS2(grid, i, j-1);
    }

}
