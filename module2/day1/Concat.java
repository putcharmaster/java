// package module2.day1;

public class Concat {
    public static String concat(String s1, String s2){
        return s1 += s2;
    }
    public static void main(String[] args) {
        String s1 = "hello ";
        String s2 = "world";

        String s = concat(s1,s2);
        System.out.printf("%s.\n", s);
    }    
}
