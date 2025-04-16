package assignment1;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Determine the number of days in the month
        int daysInMonth = 0;

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                daysInMonth = 30;
                break;
            case 2: // February
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalid month. Please enter a value between 1 and 12.");
                return;
        }

        // Output the result
        System.out.println("Number of days in month " + month + " of year " + year + " is: " + daysInMonth);
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
