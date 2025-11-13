import javax.swing.JOptionPane;

public class StringToInteger {
    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Enter a numeric value:");
            int number = Integer.parseInt(input);
            JOptionPane.showMessageDialog(null, "You entered: " + number);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Please enter a valid integer!");
        }
    }
}
