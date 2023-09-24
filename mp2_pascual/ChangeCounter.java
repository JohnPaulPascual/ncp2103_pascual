import javax.swing.*;

public class ChangeCounter 
{
    public static void main(String[] args) 
    {
        Integer peso_1, peso_2, peso_3, peso_4, peso_5, peso_6, peso_7, peso_8, peso_9, cent_10, cent_11, cent_12;
        Double change;
        
        change = Double.parseDouble(JOptionPane.showInputDialog("Enter Change: "));
        String totalChange = "Change (pesos): " + change;
        double cent = change % 1;
        cent = (int)(cent * 100);
        int centchange = (int) ((cent / 10) * 10.0);

        if (change > 0) 
        {
            peso_1 = (int) (change / 1000);
            if (peso_1 > 0 )
            {
                change = change - (peso_1 * 1000);
            }

            peso_2 = (int) (change / 500);
            if (peso_2 > 0 )
            {
                change = change - (peso_2 * 500);
            }

            peso_3 = (int) (change / 200);
            if (peso_3 > 0 )
            {
                change = change - (peso_3 * 200);
            }

            peso_4 = (int) (change / 100);
            if (peso_4 > 0 )
            {
                change = change - (peso_4 * 100);
            }

            peso_5 = (int) (change / 50);
            if (peso_5 > 0 )
            {
                change = change - (peso_5 * 50);
            }

            peso_6 = (int) (change / 20);
            if (peso_6 > 0 )
            {
                change = change - (peso_6 * 20);
            }

            peso_7 = (int) (change / 10);
            if (peso_7 > 0 )
            {
                change = change - (peso_7 * 10);
            }

            peso_8 = (int) (change / 5);
            if (peso_8 > 0 )
            {
                change = change - (peso_8 * 5);
            } 
            
            peso_9 = (int) (change / 1);
            if (peso_9 > 0 )
            {
                change = change - peso_9;
            } 

            cent_10 = (int) (centchange / 10);
            if (cent_10 > 0 )
            { 
                centchange = centchange - (cent_10 * 10);
            } 
            
            cent_11 = (int) (centchange / 5);
            if (cent_11 > 0 )
            {
                centchange = centchange - (cent_11 * 5 );
            }
            
            cent_12 = (int) (centchange / 1);
            if (cent_12 > 0 )
            {
                centchange = centchange - cent_12;
            } 
          
            String changeMessage = "Change Count:\n" +
                                        "1000   -- " + peso_1 + "\n" +
                                        "500     -- " + peso_2 + "\n" +
                                        "200     -- " + peso_3 + "\n" +
                                        "100     -- " + peso_4 + "\n" +
                                        "50       -- " + peso_5 + "\n" +
                                        "20       -- " + peso_6 + "\n" +
                                        "10       -- " + peso_7 + "\n" +
                                        "5         -- " + peso_8 + "\n" +
                                        "1         -- " + peso_9 + "\n" +
                                        "Cents: " + "\n" +
                                        "10       -- " + cent_10 + "\n" +
                                        "5         -- " + cent_11 + "\n" +
                                        "1         -- " + cent_12;
            
            JOptionPane.showMessageDialog(null, totalChange + "\n\n" + changeMessage);
            
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "INVALID INPUT");
        }
        
    }
}