import java.util.Scanner;

public class AddMatrices {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to enter matrix values? (yes/no)");
        String choice = input.nextLine().toLowerCase();

        if (choice.equals("yes"))
        {
            System.out.print("Enter the number of rows: ");
            int rows = input.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = input.nextInt();

            int[][] A1 = new int[rows][cols];
            int[][] A2 = new int[rows][cols];
            int[][] sum = new int[rows][cols];

            System.out.println("Enter elements of matrix 1:");
            for (int i = 0; i < rows; i++) 
            {
                for (int j = 0; j < cols; j++)
                {
                    A1[i][j] = input.nextInt();
                }
            }

            System.out.println("Enter elements of matrix 2:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) 
                {
                A2[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) 
                {
                    sum[i][j] = A1[i][j] + A2[i][j];
                }
            }
    
            System.out.println("The sum of the matrices is:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) 
                {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            int rows = 3;
            int cols = 3;
            int[][] A1 ={
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5},
            };
            System.out.println("Matrix 1: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) 
                {
                    System.out.print(A1[i][j] + " ");
                }
                System.err.println("");
            }

            int[][] A2 ={
                {0, 0, 3},
                {1, 3, 0},
                {2, 0, 5},
            };
            System.out.println("Matrix 2: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) 
                {
                    System.out.print(A2[i][j] + " ");
                }
                System.err.println("");
            }

            int[][] sum = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) 
                {
                    sum[i][j] = A1[i][j] + A2[i][j];
                }
            }
    
            System.out.println("The sum of the matrices is:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) 
                {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
        

        input.close();
    }
}
