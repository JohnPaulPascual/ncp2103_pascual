import javax.swing.*;

public class TelcoPrefixes
{
    public static void main (String[] args)
    {
        String telcoNum = (JOptionPane.showInputDialog(null, "Please enter your 11-Digit mobile number: ",
        "Telco. Identifier", JOptionPane.QUESTION_MESSAGE));
        if (telcoNum.length() != 11)
        {
            JOptionPane.showMessageDialog(null, "Invalid Mobile Number: " + telcoNum, "ERROR!", JOptionPane.YES_OPTION);
            return;
        }
        String prefix = telcoNum.substring (0,4), network;

        switch (prefix) 
        //Globe & TM
        {
            case "0966": case "0906": case "0916":
            case "0905": case "0915":
                network = "GLOBE/TM";
            break;

        // SMART & TNT
            case "0918": case "0907": case "0912":
            case "0919": case "0909":
                network = "SMART/TNT";
            break;
        // SUN
            case "0933": case "0973": case "0940":
            case "0934": case "0974":
                network = "SUN";
            break;
        default:
            network = "UNKNOWN NUMBER";
            break;
        }
        JOptionPane.showMessageDialog(null, "Mobile Number: " +
        telcoNum + "\n" + "Mobile Network: " + network);


    }

}