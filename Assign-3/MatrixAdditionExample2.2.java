public class MatrixAdditionExample2.2 {
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
        
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        
        int[][] resultMatrix = new int[rows][columns];
        
        // Add matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);
        
        System.out.println("Matrix Sum:");
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
