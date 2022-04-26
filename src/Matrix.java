public class Matrix {
    private int matrix[][], sum[][], multi[][];
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
        //Вывод элементов
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void addition(Matrix matrix2) {
        sum = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = matrix[i][j] + matrix2.matrix[i][j];
            }
        }
        System.out.println("\nСумма матриц :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\t" + sum[i][j]);
            }
            System.out.println();
        }
    }

    public void multiplication(Matrix matrix2) {
        multi = new int[row][column];
        if (matrix2.row == row && matrix2.column == column) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    for (int k = 0; k < column; k++) {
                        multi[i][j] += matrix[i][k] * matrix2.matrix[k][j];
                    }
                }
            }
            System.out.println("\nПроизведение матриц :");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print("\t" + " " + multi[i][j]);
                }
                System.out.println();
            }
        } else
            System.out.println("\nПеремножение матриц не возможно");
    }

    public void transposed() {
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < column; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("\nТранспонированная матрица: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("\t%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Matrix m1 = new Matrix(3, 3);
        Matrix m2 = new Matrix(3, 3);
        Matrix m3 = new Matrix(3, 4);
        m1.transposed();
        m1.addition(m2);
        m1.multiplication(m2);
        m2.multiplication(m3);
    }
}