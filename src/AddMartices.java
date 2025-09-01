public class AddMartices {
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        // Check if matrices have compatible dimensions for addition
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return null; // Or throw an exception
        }

        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] resultMatrix = new int[rows][cols];

        // Iterate through each element and perform addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return resultMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix is null.");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);

        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        if (sumMatrix != null) {
            System.out.println("\nSum of Matrices:");
            printMatrix(sumMatrix);
        }

        // Example of incompatible matrices
        int[][] matrix3 = {{1, 2}, {3, 4}};
        int[][] matrix4 = {{5, 6, 7}, {8, 9, 0}};
        System.out.println("\nAttempting to add incompatible matrices:");
        addMatrices(matrix3, matrix4);
    }
}
