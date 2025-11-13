import javax.swing.JOptionPane;

public class ProductLookup {
    public static void main(String[] args) {
        String[] products = {"Apple", "Banana", "Orange", "Grapes", "Mango"};
        double[] prices = {20.5, 15.0, 25.0, 40.0, 30.5};

        try {
            String indexStr = JOptionPane.showInputDialog("Enter product index (0-4):");
            int index = Integer.parseInt(indexStr);

            String message = "Product: " + products[index] + "\nPrice: ₱" + prices[index];
            JOptionPane.showMessageDialog(null, message);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Error: Invalid index!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Please enter a numeric index!");
        } finally {
            JOptionPane.showMessageDialog(null, "Inventory lookup complete.");
        }
    }
}
