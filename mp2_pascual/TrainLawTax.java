import javax.swing.*;

public class TrainLawTax {
    public static void main(String[] args) 
    {
        float monthlySalary = Float.parseFloat(JOptionPane.showInputDialog("Enter the Monthly Salary : "));
        float annualTax = monthlySalary * 12;

        float estimatedTax = calculate(annualTax);
        String disp_message = "Monthly Salary: " + String.format("%.2f", monthlySalary) + "\n" +
                "Annual Tax: " + String.format("%.2f", annualTax) + "\n" +
                "_____________________" + "\n" +
                "Estimated Tax: " + String.format("%.2f", estimatedTax);

        JOptionPane.showMessageDialog(null, disp_message, "Train Law Tax", JOptionPane.INFORMATION_MESSAGE);
    }

    public static float calculate(float annualTax) 

    {
        if (annualTax <= 250000) 
        {
            return 0;
        } 
        else if (annualTax < 400000) 
        {
            return (annualTax - 250000) * 0.2f / 12;
        }
        else if (annualTax < 800000) {
            return (((annualTax - 400000) * 0.25f) + 30000) / 12;
        } 
        else if (annualTax < 2000000) {
            return (((annualTax - 800000) * 0.30f) + 130000) / 12;
        } 
        else if (annualTax < 8000000) {
            return (((annualTax - 2000000) * 0.32f) + 490000) / 12;
        } 
        else {
            return (((annualTax - 8000000) * 0.35f) + 2410000) / 12;
        }
    }
}