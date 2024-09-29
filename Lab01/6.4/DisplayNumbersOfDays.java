import java.util.Scanner;

public class DisplayNumbersOfDays {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; 
            }
            return true; 
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1; 
        }
    }

    public static int convertMonthToNumber(String month) {
        month = month.trim().toLowerCase();
        switch (month) {
            case "january": case "jan.": case "jan": case "1":
                return 1;
            case "february": case "feb.": case "feb": case "2":
                return 2;
            case "march": case "mar.": case "mar": case "3":
                return 3;
            case "april": case "apr.": case "apr": case "4":
                return 4;
            case "may": case "5":
                return 5;
            case "june": case "jun.": case "jun": case "6":
                return 6;
            case "july": case "jul.": case "jul": case "7":
                return 7;
            case "august": case "aug.": case "aug": case "8":
                return 8;
            case "september": case "sept.": case "sep": case "9":
                return 9;
            case "october": case "oct.": case "oct": case "10":
                return 10;
            case "november": case "nov.": case "nov": case "11":
                return 11;
            case "december": case "dec.": case "dec": case "12":
                return 12;
            default:
                return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = -1;
        int year = -1;

        while (month == -1) {
            System.out.print("Enter the month (name, abbreviation, or number): ");
            String monthInput = scanner.nextLine();
            month = convertMonthToNumber(monthInput);
            if (month == -1) {
                System.out.println("Invalid month. Please try again.");
            }
        }

        while (year < 0) {
            System.out.print("Enter a valid year: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year < 0) {
                    System.out.println("Year must be a non-negative number. Please try again.");
                }
            } else {
                System.out.println("Invalid year. Please enter a numeric value.");
                scanner.next(); 
            }
        }

        int days = getDaysInMonth(month, year);
        if (days == -1) {
            System.out.println("Invalid month entered.");
        } else {
            System.out.println("Number of days: " + days);
        }

        scanner.close();
    }
}
