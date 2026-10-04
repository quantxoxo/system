import java.util.Scanner;

class MatrixMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Transpose");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter rows: ");
                    int r = sc.nextInt();

                    System.out.print("Enter columns: ");
                    int c = sc.nextInt();

                    int[][] a = new int[r][c];
                    int[][] b = new int[r][c];

                    System.out.println("Enter first matrix:");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            a[i][j] = sc.nextInt();
                        }
                    }

                    System.out.println("Enter second matrix:");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            b[i][j] = sc.nextInt();
                        }
                    }

                    System.out.println("Addition:");

                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            System.out.print(
                                (a[i][j] + b[i][j]) + " "
                            );
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter rows of first matrix: ");
                    int r1 = sc.nextInt();

                    System.out.print("Enter columns of first matrix: ");
                    int c1 = sc.nextInt();

                    System.out.print("Enter rows of second matrix: ");
                    int r2 = sc.nextInt();

                    System.out.print("Enter columns of second matrix: ");
                    int c2 = sc.nextInt();

                    if (c1 != r2) {
                        System.out.println(
                            "Multiplication is not possible."
                        );
                        break;
                    }

                    int[][] m1 = new int[r1][c1];
                    int[][] m2 = new int[r2][c2];
                    int[][] result = new int[r1][c2];

                    System.out.println("Enter first matrix:");
                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c1; j++) {
                            m1[i][j] = sc.nextInt();
                        }
                    }

                    System.out.println("Enter second matrix:");
                    for (int i = 0; i < r2; i++) {
                        for (int j = 0; j < c2; j++) {
                            m2[i][j] = sc.nextInt();
                        }
                    }

                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c2; j++) {
                            for (int k = 0; k < c1; k++) {
                                result[i][j] +=
                                    m1[i][k] * m2[k][j];
                            }
                        }
                    }

                    System.out.println("Multiplication:");

                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c2; j++) {
                            System.out.print(result[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter rows: ");
                    int rows = sc.nextInt();

                    System.out.print("Enter columns: ");
                    int cols = sc.nextInt();

                    int[][] matrix = new int[rows][cols];

                    System.out.println("Enter matrix:");

                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            matrix[i][j] = sc.nextInt();
                        }
                    }

                    System.out.println("Transpose:");

                    for (int j = 0; j < cols; j++) {
                        for (int i = 0; i < rows; i++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}
