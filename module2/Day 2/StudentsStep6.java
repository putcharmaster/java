import java.util.Scanner;
import java.time.LocalDate;

public class StudentsStep6 {

    final static String BOLD = "\033[1m";
    final static String ITALIC = "\033[3m";
    final static String RESET = "\033[0m";

    static String registeredStudents = "";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ask how many students to input
        System.out.print("How many students do you want to register? ");
        int studentsAmount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= studentsAmount; i++) {
            System.out.println(">>> Student " + i + " <<<");
            createNewStudent(scanner);
        }

        System.out.println();
        System.out.println("List of registered students:");
        System.out.println(registeredStudents);

        scanner.close();
    }

    public static void createNewStudent(Scanner scanner) {
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
        int age = calculateAge(currentYear, birthYear, birthMonth, birthDay);

        //Get the birth month name
        String birthMonthName = getMonthName(birthMonth);

        //Add the student to the list
        registeredStudents += BOLD + firstName + " " + lastName + RESET;
        registeredStudents += " born the " + birthDay + " of " + birthMonthName + " " + birthYear + " (" + age + " years old). ";
        registeredStudents += "Registered to " + ITALIC + courseRegistered + RESET + "\n";
    }

    public static String getMonthName (int monthNumber) {
        String birthMonthName = "";
        switch(monthNumber) {
            case 1: birthMonthName = "January"; break;
            case 2: birthMonthName = "February"; break;
            case 3: birthMonthName = "March"; break;
            case 4: birthMonthName = "April"; break;
            case 5: birthMonthName = "May"; break;
            case 6: birthMonthName = "June"; break;
            case 7: birthMonthName = "July"; break;
            case 8: birthMonthName = "August"; break;
            case 9: birthMonthName = "September"; break;
            case 10: birthMonthName = "October"; break;
            case 11: birthMonthName = "November"; break;
            case 12: birthMonthName = "December"; break;
        }
        return birthMonthName;
    }

    public static int calculateAge(int currentYear, int birthYear, int birthMonth, int birthDay) {
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
        return age;
    }
}