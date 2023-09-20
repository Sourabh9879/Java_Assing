public class MatrixScalarMultiplicationExample2.3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int scalar = 3;
        
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int[][] resultMatrix = new int[rows][columns];
        
        // Multiply matrix by scalar
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix[i][j] * scalar;
            }
        }
        
        System.out.println("Original Matrix:");
        displayMatrix(matrix);
        
        System.out.println("Result Matrix after Scalar Multiplication:");
        displayMatrix(resultMatrix);
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
