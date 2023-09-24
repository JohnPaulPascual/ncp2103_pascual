import java.util.Random;
import javax.swing.JOptionPane;


public class InBetweenGame
{
    public static void main(String[] args) 
    {
        double INITIAL_MONEY = 1000.00;
        JOptionPane.showMessageDialog(null, "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "\t\t                             IN BETWEEN GAME!\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", "In-Between Game", JOptionPane.PLAIN_MESSAGE );

        while (true) 
        {
            Random random = new Random();
            int random_card1 = random.nextInt(1,14);
            int random_card2 = random.nextInt(1,14);
            int random_card3 = random.nextInt(1,14);


            StringBuilder message = new StringBuilder
            ("             Current Money: PHP ").append(String.format("%.2f", INITIAL_MONEY));
            String money_bet_str = JOptionPane.showInputDialog(null, message + 
            "\n                         Place Your Bet: ", "Bet", JOptionPane.PLAIN_MESSAGE);
            double money_bet = Double.parseDouble(money_bet_str);

 

            if (money_bet <= INITIAL_MONEY) 
            {
                if (money_bet >= 100.00) 
                {
                    JOptionPane.showMessageDialog(null, "             THE CARDS ARE!\n" +
                            "                 First Card: " + random_card1 + "\n" +
                            "               Second Card: " + random_card2 + "\n" +
                            "   ~~~~~~~~~~~~~~~~~~~~~~~");

                    String [] 
                    options = {"Deal", "No Deal"};
                    int user_option = JOptionPane.showOptionDialog(null,
                            "       Deal or No Deal",
                            "      Choose an option",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[0]);

                    String status = "";
                    if (user_option == 0) 
                    {
                        if (random_card1 == random_card2) 
                        {
                            String[] highLowOptions = {"High [H]", "Low [L]"};
                            int highLowOption = JOptionPane.showOptionDialog(null,
                                    "        High [H] or Low [L] ",
                                    "Choose High or Low",
                                    JOptionPane.DEFAULT_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    highLowOptions,
                                    highLowOptions[0]);

                            if (highLowOption == 0) 
                            {
                                if (random_card3 > random_card1) 
                                {
                                    INITIAL_MONEY += money_bet;
                                    status = "             YOU WIN!";
                                } 
                                else 
                                {
                                    INITIAL_MONEY -= money_bet;
                                    status = "             YOU LOSE";
                                }
                            } 
                            else 
                            {
                                if (random_card3 < random_card1) 
                                {
                                    INITIAL_MONEY += money_bet;
                                    status = "             YOU WIN!";
                                } 
                                else 
                                {
                                    INITIAL_MONEY -= money_bet;
                                    status = "             YOU LOSE!";
                                }
                            }
                            JOptionPane.showMessageDialog(null, 
                            "           Third Card: " + random_card3 + "\n" + status +
                                    "\n\tCurrent Money is PHP " + String.format("%.2f", INITIAL_MONEY));
                        } 
                        else 
                        {
                            if (((random_card1 > random_card3) && (random_card2 < random_card3))
                                    || ((random_card1 < random_card3) && (random_card2 > random_card3))) 
                            {
                                INITIAL_MONEY += money_bet;
                                status = "              YOU WIN!";
                            } 
                            else if ((random_card1 == random_card3) && (random_card2 == random_card3)) 
                            {
                                INITIAL_MONEY -= money_bet;
                                status = "              YOU LOSE!";
                            } 
                            else 
                            {
                                INITIAL_MONEY -= money_bet;
                                status = "              YOU LOSE!";
                            }
                            JOptionPane.showMessageDialog(null, "           Third Card: " + random_card3 + "\n" + status +
                                    "\nCurrent Money is PHP " + String.format("%.2f", INITIAL_MONEY));
                        }
                    } 
                    else 
                    {

                        INITIAL_MONEY -= (money_bet / 2);
                        JOptionPane.showMessageDialog(null, "            Third Card: " + random_card3 + "\n               NO DEAL!" +
                                "\nCurrent Money is PHP " + String.format("%.2f", INITIAL_MONEY));
                    }

                    if (INITIAL_MONEY <= 99) 
                    {
                        JOptionPane.showMessageDialog(null, "   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                                "                   ~ Game Ends Your Money is not enough you Lose ~");
                        break;
                    }

                    String play_again = JOptionPane.showInputDialog(null, "             Continue (Y/Q)?");
                    if (play_again == null || play_again.equalsIgnoreCase("Q")) 
                    {
                        JOptionPane.showMessageDialog(null, "   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                                "          ~ Game Ends Total Money is PHP " + String.format("%.2f", INITIAL_MONEY) + " ~" +
                                "\n   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;
                    }
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Minimum Bet is PHP 100.00");
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "\t\tYou Don't Have Enough Money\n" +
                        "\t\t  Current Money is " + String.format("%.2f", INITIAL_MONEY));
            }
        }
    }
}
