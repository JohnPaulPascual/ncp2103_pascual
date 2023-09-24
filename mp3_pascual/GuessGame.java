import javax.swing.JOptionPane;
import java.util.Random;

public class GuessGame 
{
    public static void main(String[] args) 
    {
        int numTries = 0;
        Random random = new Random();
        int randomNum = random.nextInt(11);

        while (true) 
        {
            try 
            {
                String guessNumStr = JOptionPane.showInputDialog("Guess the Number 0-10:");
                int guessNum = Integer.parseInt(guessNumStr);

                if (guessNum < 0 || guessNum > 10) 
                {
                    JOptionPane.showMessageDialog(null, "Please Input 0-10");
                    continue;
                }

                numTries++;

                if (guessNum == randomNum) 
                {
                    String rank;

                    if (numTries == 1) 
                    {
                        rank = "pro";
                    } 
                    else if (numTries >= 2 && numTries <= 4) 
                    {
                        rank = "expert";
                    } 
                    else if (numTries >= 5 && numTries <= 6) 
                    {
                        rank = "beginner";
                    } 
                    else {

                        rank = "novice";
                    }

                    JOptionPane.showMessageDialog(null, "Congrats! Your rank is " + rank + "\nNumber of Tries: " +numTries);
                    System.exit(0);
                } else if (guessNum > randomNum) 
                {
                    JOptionPane.showMessageDialog(null, "Lower");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Higher");
                }
            } 
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, "Invalid input");
                return;
            }
        }
    }
}
