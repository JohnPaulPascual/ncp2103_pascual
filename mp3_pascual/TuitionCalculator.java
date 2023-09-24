import javax.swing.JOptionPane;

public class TuitionCalculator {

    public static void main(String[] args) {
        double initialTuition = Double.parseDouble(JOptionPane.showInputDialog("Enter the initial tuition fee (\u20B1):"));

        double annualIncreaseRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the annual increase rate (%):"));

        int numberOfYears = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of years to calculate:"));

        StringBuilder result = new StringBuilder("Tuition Fee (\u20B1): "+ initialTuition + "\nIncrease Rate (Percentage): " + 
        annualIncreaseRate +"\nTuition Fees for the Next " + numberOfYears + " Years:\n" + "_________________________\n");

        for (int year = 1; year <= numberOfYears; year++) {
            initialTuition = initialTuition + (initialTuition * (annualIncreaseRate/100));
            result.append("Year ").append(year).append(": \u20B1 ").append(String.format("%.2f", initialTuition)).append("\n");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }
}
