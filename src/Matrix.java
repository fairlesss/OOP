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
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // row = arr.length;
                // column = arr[i].length; вот это действие непонятно, можно проще
            }
        }
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
            System.out.println("Сумма матриц :");
            //Вывод здесь не нужен нарушение принципа единственной отвественности
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    sum[i][j] = matrix[i][j] + matrix2.matrix[i][j];
                    System.out.print("\t" + sum[i][j]);
                }
                System.out.println();
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
                    for (int k = 0; k < column; k++) {
                        multi[i][j] += matrix[i][k] * matrix2.matrix[k][j];
                    }
                }
            }
            // System.out.println("Произведение матриц :");
            // for (int i = 0; i < row; i++) {
            //     for (int j = 0; j < column; j++) {
            //         System.out.print("\t" + multi[i][j]);
            //     }
            //     System.out.println();
            // }//вывод здесь не нужен
            return new Matrix(multi);
        } else
            System.out.println("Умножать матрицы можно только одинаковой размерности!");
        return new Matrix(temp);
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
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("\t%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Matrix m1 = new Matrix(3, 3);
        m1.print();

        int[][] arr = {{1, 2, 3}, {1, 3, 6}, {3, 6, 7}, {1, 2, 3}};
        Matrix m4 = new Matrix(arr);

        int[][] arr1 = {{1, 2, 3}, {1, 3, 6}, {3, 6, 7}};
        Matrix m5 = new Matrix(arr1);
        m5.print();

        Matrix res = m1.multi(m5);//Нужно наверное сохранить результат как и в сложении
//        m1.add(m5);
//        m1.add(m4);
//        m1.multi(m4);
    }
}