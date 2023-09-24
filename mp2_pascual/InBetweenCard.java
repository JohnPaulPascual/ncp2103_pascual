import javax.swing.JOptionPane;

public class InBetweenCard {
    public static void main(String[] args) {
        int minValue = 1; 
        int maxValue = 13; 
        int card1 = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
        int card2 = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
        int card3 = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);

        if (card1 != card2) { 
            String startChoice = JOptionPane.showInputDialog(null, "First Card : " + card1
                    + "\nSecond Card: " + card2 +
                    "\n\nIF DEAL INSERT 1" + "\nIF NO DEAL INSERT 0");

            int userChoice = Integer.parseInt(startChoice);
            JOptionPane.showMessageDialog(null, "Third Card: " + card3); 

            if (userChoice == 1) { 
                if (((card1 < card3) && (card3 < card2)) || ((card1 > card3) && (card3 > card2))) {
                    JOptionPane.showMessageDialog(null, "You Won!");
                } else { 
                    JOptionPane.showMessageDialog(null, "Aww Try Again");
                }
            } else { 
                JOptionPane.showMessageDialog(null, " Aww Try Again");
            }

        } else if (card1 == card2) { 
            String startChoice = JOptionPane.showInputDialog(null, "First Card : " + card1
                    + "\nSecond Card: " + card2 +
                    "\n\nIF HIGHER INSERT 1" + "\nIF LOWER INSERT 0");

            int userChoice = Integer.parseInt(startChoice);
            JOptionPane.showMessageDialog(null, "Third Card: " + card3);

            if (userChoice == 1) { 
                if (card3 > card1) {
                    JOptionPane.showMessageDialog(null, "You Won!");
                } else if (card1 < card3) { 
                    JOptionPane.showMessageDialog(null, "You Won!");
                } else {
                    JOptionPane.showMessageDialog(null, "Aww Try Again");
                }
            } else { 
                JOptionPane.showMessageDialog(null, "Aww Try Again");
            }
        }
    }
}
