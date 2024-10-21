import java.util.Scanner;
import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;

public class StudentsStep9 {

    final static String BOLD = "\033[1m";
    final static String ITALIC = "\033[3m";
    final static String RESET = "\033[0m";

    //List to store the students
    static Map<String, Map<String,String>> registeredStudents = new HashMap<>();

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
                    System.out.print("Would you like to filter the list by course? Enter the name of the course or enter 'all' to see the students of all courses: ");
                    String course = scanner.nextLine();
                    //Print list of students
                    printStudents(course);
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

        //Add the student to the map
        Map<String, String> studentData = new HashMap<>();
        studentData.put("firstName", firstName);
        studentData.put("lastName", lastName);
        studentData.put("birthDay", String.valueOf(birthDay));
        studentData.put("birthMonth", String.valueOf(birthMonth));
        studentData.put("birthYear", String.valueOf(birthYear));
        studentData.put("age", String.valueOf(age));
        studentData.put("course", courseRegistered);

        registeredStudents.put(firstName + " " + lastName, studentData);
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
     * This function will format the data of one student before printing it to the output.
     * @param student The map where the student data is stored.
     * @return The formatted string.
     */
    public static String formatStudentOutput(Map<String,String> student) {
        String studentString = BOLD + student.get("firstName") + " " + student.get("lastName") + RESET;
        //Get the birth month name
        String birthMonthName = getMonthName(Integer.valueOf(student.get("birthMonth")));
        studentString += " born the " + student.get("birthDay") + " of " + birthMonthName + " " + student.get("birthYear") + " (" + student.get("age") + " years old). ";
        studentString += "Registered to " + ITALIC + student.get("course") + RESET;
        return studentString;
    }

     /**
      * This function will print the information of the students stored in the list registeredStudents.
      * It will loop through the list and print one student per line. If 'course' is 'all', it will print all students, otherwise it will print only those inscribed to the course.
      * @param course The course to filter the list of students.
      */
    public static void printStudents(String course) {
        System.out.println("List of students:");
        for (Map<String, String> student : registeredStudents.values()) {
            if (course.equalsIgnoreCase("all") || student.get("course").equals(course)) {
                System.out.println(formatStudentOutput(student));
            }
        }
    }

    /**
     * This function will print the information of one student stored in the list registeredStudents.
     * If the student is found, it will print it, otherwise it will print "student not found".
     * @param scanner the scanner object needed to read from the input.
     */
    public static void printOneStudent(Scanner scanner) {
        System.out.print("Enter the student name: ");
        String studentName = scanner.nextLine();
        if (registeredStudents.containsKey(studentName)) {
            System.out.println("Student:");
            System.out.println(formatStudentOutput(registeredStudents.get(studentName)));
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
        System.out.print("Enter the student name: ");
        String studentName = scanner.nextLine();
        if (registeredStudents.containsKey(studentName)) {
            registeredStudents.remove(studentName);
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }
}