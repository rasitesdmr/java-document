package matrix1;

public class MatrixAddition {
    public static void main(String[] args) {
        System.out.println("Matrixlerin Toplamı");

        int[][] ilkMatrix = {{1, 2}, {3, 4}};
        int[][] ikinciMatrix = {{5, 6}, {7, 8}};

        System.out.println("İlk Matrix:\n");
        displayMatrix(ilkMatrix);

        System.out.println("İkinci Matrix:\n");
        displayMatrix(ikinciMatrix);

        System.out.println("Matrixlerin toplamı\n");
        sum(ilkMatrix, ikinciMatrix);
    }

    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void sum(int[][] ilk, int[][] ikinci) {
        int satir = ilk.length;
        int sutun = ilk[0].length;
        int[][] sum = new int[satir][sutun];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                sum[i][j] = ilk[i][j] + ikinci[i][j];
            }
        }
        displayMatrix(sum);
    }
}
