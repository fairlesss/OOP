public class Matrix {
    private int[][] matrix;
    private int row, column;

    public Matrix(int n, int m) {
        row = n;
        column = m;
        matrix = new int[row][column];

        //Заполнение и печать матрицы
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public Matrix(int[][] arr) {
        this.matrix = arr;//В целом, так не очень хорошо делать, так как массивы являются ссылочными типами и
        //если изменить arr где-то за пределами, то изменится и matrix, что приведет к неожиданным проблемам.
        //Лучше выделит новую памяь и поэлементно скопировать
        row = arr.length;
        column = arr.length;
        // Вывод матрицы лучше в отдлеьный метод,так как код дублируется здесь и в предыдущем конструкторе. 
        //Плюс у вас будет возможность вывести когда хотите. Это Нарушение принипа Единственной ответсвенности, который можете загуглить в интернете
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public Matrix add(Matrix matrix2) {
        int[][] sum = new int[row][column];
        if (matrix2.row == row && matrix2.column == column) {
            System.out.println("Сумма матриц :");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    sum[i][j] = matrix[i][j] + matrix2.matrix[i][j];
                }
            }
        } else
            System.out.println("Cкладывать матрицы можно только одинаковой размерности!");
        return new Matrix(sum);//Должны быть разные return для разных условий
    }

    public Matrix multi(Matrix matrix2) {
        int[][] multi = new int[row][column];
        if (matrix2.row == row && matrix2.column == column) {
            System.out.println("Произведение матриц :");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    for (int k = 0; k < column; k++) {
                        multi[i][j] += matrix[i][k] * matrix2.matrix[k][j];
                    }
                }
            }
        } else
            System.out.println("Умножать матрицы можно только одинаковой размерности!");
        return new Matrix(multi);//Должны быть разные return для разных условий
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
        Matrix m2 = new Matrix(3, 3);
        int[][] arr = {{1, 2, 3}, {1, 3, 6}, {3, 6, 7}, {1, 2, 3}};
        Matrix m4 = new Matrix(arr);
        int[][] arr1 = {{1, 2, 3}, {1, 3, 6}, {3, 6, 7}};
        Matrix m5 = new Matrix(arr1);

        m1.add(m4);
        m1.multi(m4);
        m1.add(m5);
        m1.multi(m5);
    }
}