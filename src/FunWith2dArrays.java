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

    public static double average(int[][] arr) {
        double sum = 0;
        int size = arr.length * arr[0].length;

        for (int[] row : arr) {
            for (int column : row) {
                sum += column;
            }
        }

        return sum / size;
    }

    public static int[] indexFound(String[][] arr, String target) {
        int[] coords = {0, 0};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals(target)) {
                    coords = new int[] {i, j};
                }
            }
        }

        return coords;
    }
}
