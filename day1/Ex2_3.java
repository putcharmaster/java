public class Ex2_3 {
    public static void main(String[] args) {
        int volumeOfAFile = 256;
        int totalStorage = 5000;
        int file = totalStorage / volumeOfAFile;
        int remain = totalStorage % volumeOfAFile;
        System.out.println("The storage will be able to fit " + file + " files");
        System.out.println(remain + " GB will remain");
    }
}
