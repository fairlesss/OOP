import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public Scanner scan = new Scanner(System.in);
    public int matrix1[][], matrix2[][], sum[][], multi[][];
    public int row, column;
    public Random random = new Random();

    public void create() {
        System.out.println("Введите количество строк: ");
        row = Integer.parseInt(scan.nextLine());
        System.out.println("Введите количество столбцов: ");
        column = Integer.parseInt(scan.nextLine());

        matrix1 = new int[row][column];
        matrix2 = new int[row][column];
        sum = new int[row][column];
        multi = new int[row][column];

        // Заполнение 1-й матрицы
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = random.nextInt(50) + 1;
            }
        }

        // Заполнение 2-й матрицы
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = random.nextInt(20) + 1;
            }
        }
    }

    public void display() {
        System.out.println("\nПервая матрица :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\t" + matrix1[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nВторая матрица :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\t" + matrix2[i][j]);
            }
            System.out.println();
        }
    }

    public void add() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
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

    public void multi() {
        if (row == column) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    for (int k = 0; k < column; k++) {
                        multi[i][j] += matrix1[i][k] * matrix2[k][j];
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

    public void transportation() {
        //для первой матрицы
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < column; j++) {
                int temp = matrix1[i][j];
                matrix1[i][j] = matrix1[j][i];
                matrix1[j][i] = temp;
            }
        }
        System.out.println("\nТранспонирование первой матрицы: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("\t%3d", matrix1[i][j]);
            }
            System.out.println();
        }
        //для второй матрицы
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < column; j++) {
                int temp = matrix2[i][j];
                matrix2[i][j] = matrix2[j][i];
                matrix2[j][i] = temp;
            }
        }
        System.out.println("\nТранспонирование второй матрицы: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("\t%3d", matrix2[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Matrix obj = new Matrix();
        obj.create();
        obj.display();
        obj.add();
        obj.multi();
        obj.transportation();
    }
}