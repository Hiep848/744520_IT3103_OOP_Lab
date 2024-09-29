import java.util.Arrays;
import java.util.Scanner;

public class OperatingArrays {
    public static void main(String[] args){
        int[] A;

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to enter array values? (yes/no)");
        String choice = input.nextLine().toLowerCase();

        if (choice.equals("yes"))
        {
            A = getArray(input);
        }
        else{
            A = new int[]{1789, 2035, 1899, 1456, 2013};
        }
            System.out.println("Original array: " + Arrays.toString(A));
            Arrays.sort(A);
            System.out.println("Sorted array: " + Arrays.toString(A));

            int sum = 0;
            for (int number : A)
            {
                sum+=number;
            }
            double average = (double) sum / A.length;

            System.out.println("Sum of array elements: " + sum);
            System.out.println("Average of array elements: " + average);

            input.close();
        
    }

    private static int[] getArray(Scanner input)
    {
        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();
        int[] A = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++)
        {
            A[i] = input.nextInt();
        }
        return A;
    }
}