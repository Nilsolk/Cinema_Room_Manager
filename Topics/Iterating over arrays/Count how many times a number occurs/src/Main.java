import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int array[] = new int[k];
        for (int i = 0; i < k; i++){
            int m = sc.nextInt();
            array[i] = m;
        }
        int x = sc.nextInt();
        int sum = 0;
        for(int i : array){
            if (i == x){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
