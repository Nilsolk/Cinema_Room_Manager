import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] array = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = '.';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1 || i == j) {
                    array[i][j] = '*';
                }
                array[n / 2][j] = '*';
                array[i][n / 2] = '*';
            }
        }
        for (char[] a : array) {
            for (char i : a) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}