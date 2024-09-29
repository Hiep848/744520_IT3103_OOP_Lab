import java.util.Scanner;

public class EquationSolver {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int choice;

        do 
        {
            System.out.println("\n----- Equation Solver Menu -----");
            System.out.println("1. Solve first-degree equation ax + b = 0");
            System.out.println("2. Solve system of first-degree equations with two variables");
            System.out.println("3. Solve second-degree equation ax^2 + bx + c = 0");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");
            choice = input.nextInt();

            switch (choice)
            {
                case 1:
                    SolveFirstDegreeEquation(input);
                    break;
                case 2:
                    SolveSystemOfEquations(input);
                    break;
                case 3:
                    SolveSecondDegreeEquation(input);
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
        
        input.close();
    }


    // Solve the first-degree equation (linear equation) with one variable
    public static void SolveFirstDegreeEquation(Scanner input){
        System.out.println("Solve first-degree equation ax + b = 0");
        System.out.print("Enter a: ");
        double a1 = input.nextDouble();
        System.out.print("Enter b: ");
        double b1 = input.nextDouble();

        if (a1 == 0)
        {
            if (b1 == 0)
            {
                System.out.println("Infinite solutions");
            }
            else
            {
                System.out.println("No solution");
            }
        }
        else 
        {
            double result1 = -b1 / a1;
            System.out.println("x = " + result1);
        }
    }
    // Solve the system of first-degree equations with two variables
    public static void SolveSystemOfEquations(Scanner input){
        System.out.println("\nSolve system of first-degree equations with two variables");
        System.out.println("a11 * x1 + a12 * x2 = b1");
        System.out.println("a21 * x1 + a22 * x2 = b2");

        System.out.print("Enter a11: ");
        double a11 = input.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = input.nextDouble();
        System.out.print("Enter b1: ");
        double b11 = input.nextDouble();

        System.out.print("Enter a21: ");
        double a21 = input.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = input.nextDouble();
        System.out.print("Enter b2: ");
        double b22 = input.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b11 * a22 - b22 * a12;
        double D2 = a11 * b22 - a21 * b11;
        if (D == 0) {
            if (D1 != 0 || D2 != 0) 
            {
                System.out.println("Infinite solutions");
            } 
            else 
            {
                System.out.println("No solution");
            }
        } 
        else
        {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
    }
    // Sovle the second-degree equation with one variable
    public static void SolveSecondDegreeEquation(Scanner input){
        System.out.println("\nSolve second-degree equation ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
        double a2 = input.nextDouble();
        System.out.print("Enter b: ");
        double b2 = input.nextDouble();
        System.out.print("Enter c: ");
        double c2 = input.nextDouble();

        if (a2 == 0) 
        {
            if (b2 == 0) 
            {
                if (c2 == 0)
                {
                    System.out.println("Infinite solutions");
                }
                else
                {
                    System.out.println("No solution");
                }
            }
            else 
            {
                double result2 = -c2 / b2;
                System.out.println("x = " + result2);
            }
        }
        else
        {
            double delta = b2 * b2 - 4 * a2 * c2;
            if (delta > 0)
            {
                double root1 = (-b2 + Math.sqrt(delta)) / (2 * a2);
                double root2 = (-b2 - Math.sqrt(delta)) / (2 * a2);
                System.out.println("Two real roots: x1 = " + root1 + ", x2 = " + root2);
            }
            else if (delta == 0)
            {
                double root = -b2 / (2 * a2);
                System.out.println("One real root: x = " + root);
            }
            else
            {
                System.out.println("No real roots");
            }
        }
    }
}
