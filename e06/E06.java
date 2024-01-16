import java.util.Scanner;
class E06 {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        System.out.print("Which multiplication table to show?");
        int number = input.nextInt();
        for (int i = 0; i <= 10; i++) {
        int multiplication = i * number;
        System.out.println(i + " x " + number + " = " + multiplication);
        }
    }
}
