import javax.swing.JOptionPane;

 class DivisionProgram {
    public static void main(String[] args) {
        try {
          
            String numStr = JOptionPane.showInputDialog("Enter numerator:");
            String denStr = JOptionPane.showInputDialog("Enter denominator:");

        
            int numerator = Integer.parseInt(numStr);
            int denominator = Integer.parseInt(denStr);

          
            int result = numerator / denominator;
            JOptionPane.showMessageDialog(null, "Result: " + result);

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: Division by zero!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Invalid (non-integer) input!");
        } finally {
            JOptionPane.showMessageDialog(null, "Computation completed.");
        }
    }
}
