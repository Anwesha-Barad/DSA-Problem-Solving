import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        int closest = (x / y) * y;
        int multiplier = x / y;

        System.out.println(closest + "   " + y + "*" + multiplier);

    }
}