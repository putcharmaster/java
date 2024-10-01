package module1.day5;

public class Ex1_2 {
    public static void main(String[] args){
        System.out.println("\033[35mI'm Magenta\033[0m");//magenta color
        System.out.println("\033[1mI'm bold\033[0m");//bold
        System.out.println("\33[3mI'm italic\33[0m");//italic
        System.out.println("\33[2mI'm what\33[0m");//in grey
        System.out.println("\33[4mI'm what\33[0m");//underline
        System.out.println("\33[20mI'm what\33[0m");//nothing
        System.out.println("\33[21mI'm what\33[0m");//double underline
    
    }
}
/*
 * using \033 is more common than \33.  although they work the same.
 */