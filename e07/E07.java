import java.util.Scanner;
class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which multiplication table to show?");
        int num1 = scanner.nextInt();
        System.out.println("Until which multiplier should the table show?");
        int num2 = scanner.nextInt();
        for (int i = 0; i <= num2; i++) {
        int multiplication = i * num1;
        System.out.println(i + " x " + num1 + " = " + multiplication);
        }
    }
}
