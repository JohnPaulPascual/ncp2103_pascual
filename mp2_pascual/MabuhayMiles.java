import javax.swing.*;

public class MabuhayMiles {
    public static void main(String[] args) 
    {
        String distnce, kmGallon, prcGallon;
        Double Distance, KmGallon, PrcGallon, need_gallon, trip_cost;

        JTextField distance = new JTextField();
        JTextField km_gallon = new JTextField();
        JTextField prc_gallon = new JTextField();
        Object[] message =
                {
                        "Enter the Driving Distance:", distance,
                        "Enter KM per Gallon:", km_gallon,
                        "Enter Price per Gallon:", prc_gallon
                };
        int Efficiency = JOptionPane.showConfirmDialog(null, message,
                "Triangle Side Length", JOptionPane.OK_CANCEL_OPTION);

        if (Efficiency == JOptionPane.OK_OPTION) {
            distnce = distance.getText();
            kmGallon = km_gallon.getText();
            prcGallon = prc_gallon.getText();

            Distance = Double.parseDouble(distnce);
            KmGallon = Double.parseDouble(kmGallon);
            PrcGallon = Double.parseDouble(prcGallon);

            need_gallon = (Distance / KmGallon);
            trip_cost = (need_gallon * PrcGallon);

            String trip_details = ("Enter the Driving Distance: " + distnce + "\n" +
                    "Enter KM per Gallon: " + kmGallon + "\n" +
                    "Enter Price per Gallon:" + prcGallon + "\n" +
                    "\n__________________________\n" +
                    "The Cost of Driving is: Php " + String.format("%.2f", trip_cost)); // Format trip_cost to 2 decimal places
            JOptionPane.showMessageDialog(null, trip_details, "Mabuhay Mile", JOptionPane.PLAIN_MESSAGE);
        }
    }
}