class E02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number:");
        double num1 = input.nextDouble();
        System.out.print("Give another number: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double product = num1 * num2;
        double difference = num1 - num2;
        double quotient = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " / " + num2 + " = " + quotient);

    }
}
