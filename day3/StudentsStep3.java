import java.util.Scanner;
import java.time.LocalDate;

public class StudentsStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read user inputs
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter birthday (day of month): ");
        int birthDay = scanner.nextInt();
        
        System.out.print("Enter birth month: ");
        int birthMonth = scanner.nextInt();
        
        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        //If the user enters a birth year in the future, request the year again.
        int currentYear = LocalDate.now().getYear();
        while (birthYear > currentYear) {
            System.out.print("The birth year cannot be in the future, please enter a valid birth year: ");
            birthYear = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline
        }
        
        System.out.print("Enter course registered: ");
        String courseRegistered = scanner.nextLine();

        // Calculate age
        int age = currentYear - birthYear;
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth < birthMonth) {
            age--;
        } else if (currentMonth == birthMonth) {
            int currentDay = LocalDate.now().getDayOfMonth();
            if (currentDay < birthDay) {
                age--;
            }
        }

        //Get the birth month name
        String birthMonthName = "";
        switch(birthMonth) {
            case 1:
                birthMonthName = "January";
                break;
            case 2:
                birthMonthName = "February";
                break;
            case 3:
                birthMonthName = "March";
                break;
            case 4:
                birthMonthName = "April";
                break;
            case 5:
                birthMonthName = "May";
                break;
            case 6:
                birthMonthName = "June";
                break;
            case 7:
                birthMonthName = "July";
                break;
            case 8:
                birthMonthName = "August";
                break;
            case 9:
                birthMonthName = "September";
                break;
            case 10:
                birthMonthName = "October";
                break;
            case 11:
                birthMonthName = "November";
                break;
            case 12:
                birthMonthName = "December";
                break;
        }

        // Display the student's information
        System.out.println("\nStudent Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + birthDay + " " + birthMonthName + " " + birthYear);
        System.out.println("Age: " + age);
        System.out.println("Course Registered: " + courseRegistered);

        scanner.close();
    }
}