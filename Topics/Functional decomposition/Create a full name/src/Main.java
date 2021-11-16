// Don't delete scanner import
import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println(createFullName(scanner.nextLine(), scanner.nextLine()));


    }

    //implement your method here
    public static String createFullName(String a, String b) {
        String k = a + " " + b;
        return k;

    }
}
