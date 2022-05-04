public class Matrix {
    private int[][] matrix;
    private int row, column;

    public Matrix(int n, int m) {
        row = n;
        column = m;
        matrix = new int[row][column];
        //Заполнение матрицы
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public Matrix(int[][] arr) {
        row = arr.length;
        column = arr[0].length;
        matrix = arr.clone();
    }

    public void print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public Matrix add(Matrix matrix2) {
        int[][] sum = new int[row][column];
        int[][] temp = new int[0][0];
        if (matrix2.row == row && matrix2.column == column) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    sum[i][j] = matrix[i][j] + matrix2.matrix[i][j];
                }
            }
            return new Matrix(sum);
        } else
            System.out.println("Cкладывать матрицы можно только одинаковой размерности!");
        return new Matrix(temp);
    }

    public Matrix multi(Matrix matrix2) {
        int[][] multi = new int[row][column];
        int[][] temp = new int[0][0];
        if (matrix2.row == row && matrix2.column == column) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    multi[i][j] += matrix[i][j] * matrix2.matrix[i][j];
                }
            }
            return new Matrix(multi);
        } else
            System.out.println("Умножать матрицы можно только одинаковой размерности!");
        return new Matrix(temp);
    }

    public void equals(Matrix matrix2) {
        if (matrix.equals(matrix2)) {
            System.out.println("Матрицы равны");
        } else {
            System.out.println("Матрицы не равны");
        }
    }

    public void transposed() {
        System.out.println("Транспонированная матрица: ");
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < column; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String args[]) {
        Matrix m1 = new Matrix(3, 3);
        m1.print();

        int[][] arr1 = {{1, 2, 3}, {1, 3, 6}, {3, 6, 7}};
        Matrix m5 = new Matrix(arr1);
        m5.print();

        Matrix res = m1.multi(m5);
        res.print();

        Matrix res1 = m1.add(m5);
        res1.print();

        m1.transposed();
        m1.print();

        m1.equals(m5);
    }
}