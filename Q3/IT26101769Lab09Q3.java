public class IT26101769Lab09Q3 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        // Expression i: (3 * 4 + 5 * 7)^2[cite: 1]
        int expr1 = square(add(multiply(3, 4), multiply(5, 7)));

        // Expression ii: (4 + 7)^2 + (8 + 3)^2[cite: 1]
        int expr2 = add(square(add(4, 7)), square(add(8, 3)));

        // Display results[cite: 1]
        System.out.println("Result of (3*4+5*7)^2 : " + expr1);
        System.out.println("Result of (4+7)^2+(8+3)^2 : " + expr2);
    }
}