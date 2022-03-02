public class FunWith2dArrays {
    public static int totalElements(int[][] grid) {
        int height = grid.length;
        int width = 0;

        if (height != 0) {
            width = grid[0].length;
        }
        return height * width;
    }

    public static void fourCorners(String[][] grid) {
        int height = grid.length;
        int width = grid[0].length;

        String toPrint = "";
        toPrint += grid[0][0] + "\n";
        toPrint += grid[0][width - 1] + "\n";
        toPrint += grid[height - 1][0] + "\n";
        toPrint += grid[height - 1][width - 1] + "\n";
        System.out.print(toPrint);
    }
}
