import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m = sc.nextInt();
        double p = sc.nextInt();
        int k = sc.nextInt();



        int t = 0;

        while (k > m) {
            m += m * (1 * p / 100);
            t++;
        }
        System.out.print(t);
    }
}
