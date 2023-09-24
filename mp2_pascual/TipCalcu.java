import javax.swing.*;
public class TipCalcu 
{
    public static void main(String[] args) 
    {
        // Assigning the Data Type
        String payment, tipped;
        Double flt_payment, flt_tipped, tip_amnt, total_bill;

        //Creating Multiple input box
        JTextField bill = new JTextField();
        JTextField tip = new JTextField();
        Object[] message = 
        {
            "Bill Before Tip:", bill,
            "Tip Rate (%):", tip
        };

        int tip_calcu = JOptionPane.showConfirmDialog(null, message, "Calculator", JOptionPane.OK_CANCEL_OPTION);
        if (tip_calcu == JOptionPane.OK_OPTION)
        {
            // Converting String/s (payment & tipped) to Double
            payment = bill.getText();
            flt_payment = Double.parseDouble(payment);
            tipped = tip.getText();
            flt_tipped = Double.parseDouble(tipped);

            //Computations
            tip_amnt = flt_payment * (flt_tipped * 0.01);
            total_bill = flt_payment + tip_amnt;

            //Displaying output using Message Dialog
            JOptionPane.showMessageDialog(null,  "Bill: Php " + flt_payment + 
            "\nTip (%): " + flt_tipped + "%" + 
            "\n\n" +"Tip Amount: Php " + tip_amnt + 
            "\nTotal Bill: Php " + String.format("%.2f", total_bill));
        }
        
    }
}
