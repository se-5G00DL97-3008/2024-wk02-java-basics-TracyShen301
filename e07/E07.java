import java.util.Scanner;
class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which multiplicand multiplication table to show?");
        int num1 = input.nextInt();
        System.out.print("Until which multiplier?");
        int num2 = scanner.nextInt();
        for (int i = 0; i <= num2; i++) {
        int multiplication = i * num1;
        System.out.println(i + " x " + num1 + " = " + multiplication);
        }
    }
}
