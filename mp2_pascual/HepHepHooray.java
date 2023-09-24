import javax.swing.*;

public class HepHepHooray
{
    public static void main(String[] args)
    {
        Integer input_num;
        String num_input, output, display_mess;

        num_input = JOptionPane.showInputDialog ("Enter a Number:");
        input_num = Integer.parseInt(num_input);

        output = "";

        if (input_num % 3 == 0 && input_num % 5 == 0)
        {
            output = "HEP-HEP HOORAY!";
        }
        else if (input_num % 3 == 0)
        {
            output = "HEP-HEP!";
        }
        else if (input_num % 5 == 0)
        {
            output = "HOORAY!";
        }
        else
        {
            output = "OH NO!";
        }

        display_mess =  ("Number: " + input_num + "\n____________________\n" + output);

        JOptionPane.showMessageDialog (null, display_mess, "Hep-Hep Hooray!", JOptionPane.PLAIN_MESSAGE);
    }
} 