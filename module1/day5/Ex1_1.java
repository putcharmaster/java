package day5;

public class Ex1_1 {
    public static void main(String[] args){
        int quarter = 1;
        int year = 2023;
        double revenue = 1234567.89;
        double percentageChange = -2.5;

        System.out.printf("Q%d %d Revenue: $%,.2f Change %.1f%%", quarter, year, revenue, percentageChange);
    }
}
