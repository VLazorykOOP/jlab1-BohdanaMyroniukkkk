public class task3 {
    public static void main(String[] args) {
        int[][] A = {
            {10, 5, 8, 12},
            {7, 3, 9, 6},
            {14, 4, 11, 2},
            {13, 1, 15, 16}
        };
        
        int minColumnIndex = findMinElementColumn(A);

        int[][] shiftedMatrix = shiftColumns(A, minColumnIndex);

        System.out.println("Matrix after cyclic shift:");
        printMatrix(shiftedMatrix);
    }

    public static int findMinElementColumn(int[][] matrix) {
        int minValue = Integer.MAX_VALUE;
        int minColumnIndex = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                    minColumnIndex = j;
                }
            }
        }

        return minColumnIndex;
    }

    public static int[][] shiftColumns(int[][] matrix, int minColumnIndex) {
        int n = matrix.length;
        int[][] shiftedMatrix = new int[n][n];

        for (int j = 0; j < n; j++) {
            int shiftedColumn = (j + minColumnIndex) % n;
            for (int i = 0; i < n; i++) {
                shiftedMatrix[i][j] = matrix[i][shiftedColumn];
            }
        }

        return shiftedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
    
