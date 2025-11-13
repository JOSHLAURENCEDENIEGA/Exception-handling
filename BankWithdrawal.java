import javax.swing.JOptionPane;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankWithdrawal {
    public static void main(String[] args) {
        double balance = 1000.0;
        try {
            String withdrawStr = JOptionPane.showInputDialog("Enter withdrawal amount:");
            double withdraw = Double.parseDouble(withdrawStr);

            if (withdraw > balance) {
                throw new InsufficientBalanceException("Insufficient funds!");
            }

            balance -= withdraw;
            JOptionPane.showMessageDialog(null, "Transaction successful! Remaining balance: " + balance);
        } catch (InsufficientBalanceException e) {
            JOptionPane.showMessageDialog(null, "Transaction error: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Invalid input!");
        } finally {
            JOptionPane.showMessageDialog(null, "Transaction completed.");
        }
    }
}
