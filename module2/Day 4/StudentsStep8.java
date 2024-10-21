import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class StudentsStep8 {

    final static String BOLD = "\033[1m";
    final static String ITALIC = "\033[3m";
    final static String RESET = "\033[0m";

    //List to store the students
    static ArrayList<String> registeredStudents = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String option = "";
        while (!option.equals("e")) {
            printMenu();
            System.out.print("Select an option: ");
            option = scanner.nextLine();
    
            switch (option) {
                case "a":
                    //Create a new student
                    createNewStudent(scanner);
                    break;
                case "b":
                    //Remove a student
                    removeStudent(scanner);
                    break;
                case "c":
                    //Print list of students
                    printStudents();
                    break;
                case "d":
                    //Print one student
                    printOneStudent(scanner);
                    break;
                default:
                    break;
            }
        } 
        
        scanner.close();
    }

    /**
     * This function will request the user to input the necessary information to add a new student to the list registeredStudents.
     * It will format the student information into a string called "student" and then will add the string to the list.
     * @param scanner the scanner object needed to read from the input.
     */
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
        int age = calculateAge(birthYear, birthMonth, birthDay);

        //Get the birth month name
        String birthMonthName = getMonthName(birthMonth);

        //Add the student to the list
        String student = BOLD + firstName + " " + lastName + RESET;
        student += " born the " + birthDay + " of " + birthMonthName + " " + birthYear + " (" + age + " years old). ";
        student += "Registered to " + ITALIC + courseRegistered + RESET;

        registeredStudents.add(student);
    }

    /**
     * This function will convert a month number (from 1 to 12) to the corresponding month name.
     * @param monthNumber the month number to be converted.
     * @return the name of the month that corresponds to monthNumber.
     */
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

    /**
     * This function will calculate the age of a person taking into account the current date and the person's birthday.
     * It will get the current date using LocalDate.now().
     * @param birthYear the year in which the person was born
     * @param birthMonth the month in which the person was born
     * @param birthDay the day of the month in which the person was born
     * @return the person's age.
     */
    public static int calculateAge(int birthYear, int birthMonth, int birthDay) {
        int age = LocalDate.now().getYear() - birthYear;
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

    /**
     * This function will print the information of all students stored in the list registeredStudents.
     * It will loop through the list and print one student per line.
     */
    public static void printStudents() {
        System.out.println("List of students:");
        for (int i = 0; i < registeredStudents.size(); i++) {
            System.out.println(registeredStudents.get(i));
        }
    }

    /**
     * This function will print the information of one student stored in the list registeredStudents.
     * If the student is found, it will print it, otherwise it will print "student not found".
     * @param scanner the scanner object needed to read from the input.
     */
    public static void printOneStudent(Scanner scanner) {
        int studentIndex = searchForStudent(scanner);
        if (studentIndex >= 0) {
            System.out.println("Student:");
            System.out.println(registeredStudents.get(studentIndex));
        } else {
            System.out.println("Student not found.");
        }
    }

    /**
     * This function will print the menu to the user
     */
    public static void printMenu() {
        System.out.println();
        System.out.println("Options menu:");
        System.out.println("(a) add a student");
        System.out.println("(b) remove a student");
        System.out.println("(c) see the list of students");
        System.out.println("(d) search for one student");
        System.out.println("(e) exit");
    }

    /**
     * This function will remove one student stored in the list registeredStudents.
     * If the student is found, it will remove it, otherwise it will print "student not found".
     * @param scanner the scanner object needed to read from the input.
     */
    public static void removeStudent(Scanner scanner) {
        int studentIndex = searchForStudent(scanner);
        if (studentIndex >= 0) {
            registeredStudents.remove(studentIndex);
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    /**
     * This function will search for a student in the list registeredStudents.
     * It will request the student name from the user and will loop through the list until the student is found.
     * @param scanner the scanner object needed to read from the input.
     * @return the position of the student in the list in case it was found, -1 if it was not found.
     */
    public static int searchForStudent(Scanner scanner) {
        System.out.print("Enter the student name: ");
        String studentName = scanner.nextLine();
        for (int i = 0; i < registeredStudents.size(); i++) {
            if (registeredStudents.get(i).contains(studentName)) {
                return i;
            }
        }
        return -1;
    }
}