import javax.swing.JOptionPane;

class InvalidContactException extends Exception {
    public InvalidContactException(String message) {
        super(message);
    }
}

public class ContactValidation {
    public static void main(String[] args) {
        try {
            String contact = JOptionPane.showInputDialog("Enter contact number:");

            if (!contact.startsWith("09") || contact.length() != 11) {
                throw new InvalidContactException("Invalid contact number format!");
            }

            JOptionPane.showMessageDialog(null, "Contact number accepted!");
        } catch (InvalidContactException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
