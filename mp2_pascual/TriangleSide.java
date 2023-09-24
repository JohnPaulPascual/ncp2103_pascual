import javax.swing.*;
public class TriangleSide
{
    
    public static void main (String[] args)
    {
        //Custom button text
        Object[] options = 
        {
        "[1]-Sides",
        "[2]-Angle",
        "Cancel"
        };

        int triangle_option = JOptionPane.showOptionDialog(null,
        " [1]- Classify a Triangle based on the Lengths of its sides\n [2]-Classify a Triangle based on its Angles",
        "Triangle",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

        if (triangle_option == JOptionPane.YES_OPTION) 
        {
            TriangleSides();
        } 
        else if (triangle_option == JOptionPane.NO_OPTION) 
        {
            TriangleAngle();
        } 
        else 
        {}
    }

    public static void TriangleSides()
    
    {
        String side_1, side_2, side_3;
        Double side_one, side_two, side_three;

        //Creating Multiple input box
        JTextField sideOne = new JTextField();
        JTextField sideTwo = new JTextField();
        JTextField sideThree = new JTextField();
        Object[] message = 
        {
            "Side 1:", sideOne,
            "Side 2:", sideTwo,
            "Side 3:", sideThree
        };

        int triangleSide = JOptionPane.showConfirmDialog(null, message, 
        "Triangle Side Length", JOptionPane.OK_CANCEL_OPTION);

        if (triangleSide == JOptionPane.OK_OPTION)
        {                
            side_1 = sideOne.getText();
            side_2 = sideTwo.getText();
            side_3 = sideThree.getText();

            side_one = Double.parseDouble(side_1);
            side_two = Double.parseDouble(side_2);
            side_three = Double.parseDouble(side_3);
            if (isValidTriangle(side_one, side_two, side_three)) 
            {
                if (side_one.equals(side_two) && side_two.equals(side_three)) 
                {
                    JOptionPane.showMessageDialog(null, "Side 1: " + side_1 + 
                    "\nSide 2: " + side_2 + 
                    "\nSide 3: " + side_3 + 
                    "\n\n" + "Triangle: Equilateral", "Triangle Side Length", JOptionPane.PLAIN_MESSAGE);
                } 
                else if (side_one.equals(side_two) || side_one.equals(side_three) || side_two.equals(side_three)) 
                {
                    JOptionPane.showMessageDialog(null, "Side 1: " + side_1 + 
                    "\nSide 2: " + side_2 + 
                    "\nSide 3: " + side_3 + 
                    "\n\n" + "Triangle: Isosceles", "Triangle Side Length", JOptionPane.PLAIN_MESSAGE);
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Side 1: " + side_1 + 
                    "\nSide 2: " + side_2 + 
                    "\nSide 3: " + side_3 + 
                    "\n\n" + "Triangle: Scalene", "Triangle Side Length", JOptionPane.PLAIN_MESSAGE);
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Side 1: " + side_1 + 
                    "\nSide 2: " + side_2 + 
                    "\nSide 3: " + side_3 + 
                    "\n\n" + "Triangle: Invalid", "Triangle Side Length", JOptionPane.PLAIN_MESSAGE);
            }
            
        }
    

    }

    public static void TriangleAngle ()
    {
        String angle_1, angle_2, angle_3;
        Double angle_one, angle_two, angle_three;
        //Creating Multiple input box
        JTextField angleOne = new JTextField();
        JTextField angleTwo = new JTextField();
        JTextField angleThree = new JTextField();
        Object[] message = 
        {
            "Angle 1:", angleOne,
            "Angle 2:", angleTwo,
            "Angle 3:", angleThree
        };

        int triangleSide = JOptionPane.showConfirmDialog(null, message, 
        "Triangle Angle", JOptionPane.OK_CANCEL_OPTION);

        if (triangleSide == JOptionPane.OK_OPTION)
        {
            angle_1 = angleOne.getText();
            angle_2 = angleTwo.getText();
            angle_3 = angleThree.getText();

            angle_one = Double.parseDouble(angle_1);
            angle_two = Double.parseDouble(angle_2);
            angle_three = Double.parseDouble(angle_3);
            
            if (isValidAngle (angle_one, angle_two, angle_three))
            
            {
                if (angle_one < 90 && angle_two < 90 && angle_three < 90) 

                {
                    JOptionPane.showMessageDialog(null, "Side 1: " + angle_1 + 
                    "\nSide 2: " + angle_2 + 
                    "\nSide 3: " + angle_3 + 
                    "\n\n" + "Triangle: Acute-Angled", "Triangle Angle", JOptionPane.PLAIN_MESSAGE);

                } 
                else if (angle_one == 90 || angle_two == 90 || angle_three == 90) 
                {
                    JOptionPane.showMessageDialog(null, "Side 1: " + angle_1 + 
                    "\nSide 2: " + angle_2 + 
                    "\nSide 3: " + angle_3 + 
                    "\n\n" + "Triangle: Right-Angled", "Triangle Angle", JOptionPane.PLAIN_MESSAGE);
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Side 1: " + angle_1 + 
                    "\nSide 2: " + angle_2 + 
                    "\nSide 3: " + angle_3 + 
                    "\n\n" + "Triangle: Obtuse-Angled", "Triangle Angle", JOptionPane.PLAIN_MESSAGE);
                }

            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Side 1: " + angle_1 + 
                    "\nSide 2: " + angle_2 + 
                    "\nSide 3: " + angle_3 + 
                    "\n\n" + "Triangle: Invalid", "Triangle Angle", JOptionPane.PLAIN_MESSAGE);
            }
        }         
        
    }
    
    public static boolean isValidTriangle(double side_one, double side_two, double side_three) 
    {
        
        return (side_one + side_two > side_three) && (side_two + side_three > side_one) && (side_three + side_one> side_two);
    }

    public static boolean isValidAngle(double angle_one, double angle_two, double angle_three) 
    {
        
        return angle_one + angle_two + angle_three == 180;
    }
}