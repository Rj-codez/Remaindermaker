public class oprators {
    public static void main(String[] args) {
        int num1 = 378, num2 = 2;

        int modulus = num1 % num2;

        printRemainder(modulus); // instead of System.out.println
    }

    // Custom print method
    public static void printRemainder(int value) {
        System.out.println("Remainder: " + value);
    }
}

