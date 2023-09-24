import javax.swing.JOptionPane;

public class NumberDivisibilityCounter {
    public static void main(String[] args) 
    {
        String startStr = JOptionPane.showInputDialog("Enter the start of the number line:");
        String endStr = JOptionPane.showInputDialog("Enter the end of the number line:");

        int start, end;
        try 
        {
            start = Integer.parseInt(startStr);
            end = Integer.parseInt(endStr);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid integers.");
            return;
        }

        int countDivisibleBy2 = 0;
        int countDivisibleBy3 = 0;
        int countDivisibleByBoth = 0;

        for (int num = start; num <= end; num++) {
            if (num % 2 == 0) 
            {
                countDivisibleBy2++;
            }
            if (num % 3 == 0) 
            {
                countDivisibleBy3++;
            }
            if (num % 2 == 0 && num % 3 == 0) 
            {
                countDivisibleByBoth++;
            }
        }

        String message = "Count of numbers divisible by 2: " + countDivisibleBy2 + "\n" +
                         "Count of numbers divisible by 3: " + countDivisibleBy3 + "\n" +
                         "Count of numbers divisible by both 2 and 3: " + countDivisibleByBoth;

        JOptionPane.showMessageDialog(null, message);
    }
}
