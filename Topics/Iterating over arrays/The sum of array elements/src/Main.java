import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int array [] = new int [k];
        for (int i = 0; i < k; i++) {
            int m = sc.nextInt();
            array[i] = m;
        }
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}