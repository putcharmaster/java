import java.util.Scanner;
import java.time.LocalDate;

public class Student 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
//        int currentMonth = today.getMonthValue();
//        int currentDay = today.getDayOfYear();

        //int currentYear = LocalDate.now().getYear();

        System.out.print("How many students do you want to register? ");
        int number_of_student = scan.nextInt();
        scan.nextLine();


        String list_of_students = "";
        String studentInfo = "";

        for (int i = 1; i <= number_of_student; i++){
        
            System.out.println(">>> Student " + i + " <<<");
            System.out.print("Enter first name: ");
            String name = scan.nextLine();
            
            
            System.out.print("Enter last name: ");
            String lastName = scan.nextLine();
        
            System.out.print("Enter birthday (day of month): ");
            int day = scan.nextInt();

            System.out.print("Enter birthday month: ");
            int month = scan.nextInt();
        

            System.out.print("Enter birth year: ");
            int year = scan.nextInt();
        

            while (year > currentYear){
                System.out.print("The birth year cannot be in the future, please enter a valid birth year: ");
                year = scan.nextInt();
            }

            scan.nextLine();


            System.out.print("Enter course registered: ");
            String course = scan.nextLine();
            
            String birthMonthName = "";
            switch(month){
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


            studentInfo = name +" " +lastName+", ";
            studentInfo += day + " " + birthMonthName +" "+year+", ";
            studentInfo += course+"\n";
            list_of_students = list_of_students.concat(studentInfo);
            System.out.println();
        }
        System.out.println(list_of_students);
    }
}

/*
        //calculate age
        int age = currentYear-year;
        if ((month > currentMonth) || (month == currentMonth && day > currentDay))
            age--;
    
        

        System.out.print("\n\n");
        System.out.println("student name: "+name +" " +lastName);
        System.out.println("Date of Birth: "+ day + " " + birthMonthName+" "+year);

        System.out.println("Age: "+age);
       
        System.out.println("Course Registered: " + course);
        scan.close();
    }
    */

