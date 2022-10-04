import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter maintenance cost of Spring: ");
        double s1 = in.nextDouble();
        System.out.print("Enter maintenance cost of Fall: ");
        double s2 = in.nextDouble();
        System.out.print("Enter maintenance cost of Summer: ");
        double s3 = in.nextDouble();
        System.out.print("Enter maintenance cost of Winter: ");
        double s4 = in.nextDouble();
        System.out.println("Maintenance details");
        System.out.printf("Spring: $%.2f\n", s1);
        System.out.printf("Fall: $%.2f\n", s2);
        System.out.printf("Summer: $%.2f\n", s3);
        System.out.printf("Winter: $%.2f\n", s4);
        System.out.printf("Yearly: $%.2f\n", s1+s2+s3+s4);
    }

}