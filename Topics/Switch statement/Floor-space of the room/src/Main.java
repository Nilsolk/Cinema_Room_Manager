import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.nextLine()){
            case "triangle":
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double p = (a+b+c)/2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle":
                double k = sc.nextDouble();
                double t = sc.nextDouble();
                System.out.println(k * t);
                break;
            case "circle":
                double r = sc.nextDouble();
                System.out.println(3.14 * r * r);

        }

    }
}