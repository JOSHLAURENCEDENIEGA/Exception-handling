import javax.swing.JOptionPane;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {
    public static void main(String[] args) {
        try {
            String ageStr = JOptionPane.showInputDialog("Enter your age:");
            int age = Integer.parseInt(ageStr);

            if (age < 18) {
                throw new InvalidAgeException("Access denied – Age must be 18 or older.");
            } else {
                JOptionPane.showMessageDialog(null, "Access granted.");
            }
        } catch (InvalidAgeException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Invalid input. Please enter a number.");
        }
    }
}
