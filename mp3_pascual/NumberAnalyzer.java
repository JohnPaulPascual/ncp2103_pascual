import javax.swing.JOptionPane;

public class NumberAnalyzer {
    public static void main(String[] args) {
        int sumGreaterThan10 = 0;
        int productLessThan5 = 1;
        int countDivisibleBy3 = 0;
        int countDivisibleBy5 = 0;
        int productEvenNumbers = 1;

        while (true) {
            String inputStr = JOptionPane.showInputDialog("Enter an integer (0 to exit):");
            int number = Integer.parseInt(inputStr);

            if (number == 0) {
                break;
            }

            if (number > 10) {
                sumGreaterThan10 += number;
            }

            if (number < 5) {
                productLessThan5 *= number;
            }

            if (number % 3 == 0) {
                countDivisibleBy3++;
            }

            if (number % 5 == 0) {
                countDivisibleBy5++;
            }

            if (number % 2 == 0) {
                productEvenNumbers *= number;
            }
        }

        int thriceProductEvenNumbers = 3 * productEvenNumbers;

        String message = "Sum of all numbers greater than 10: " + sumGreaterThan10 + "\n" +
                         "Product of all numbers less than 5: " + productLessThan5 + "\n" +
                         "Count of numbers divisible by 3: " + countDivisibleBy3 + "\n" +
                         "Count of numbers divisible by 5: " + countDivisibleBy5 + "\n" +
                         "Thrice the product of all even numbers: " + thriceProductEvenNumbers;

        JOptionPane.showMessageDialog(null, message);
    }
}
