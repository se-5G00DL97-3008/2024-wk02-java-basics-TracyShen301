import java.util.Scanner;
class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextDouble();
        if (number > 0) {
        System.out.println("Positive number");
        }
        if (number < 0) {
        System.out.println("Negative number");
        }
    }
}
