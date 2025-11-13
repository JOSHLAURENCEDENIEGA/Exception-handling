import javax.swing.JOptionPane;

public class RetrieveGrade {
    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 88, 92};

        try {
            String indexStr = JOptionPane.showInputDialog("Enter student index (0-4):");
            int index = Integer.parseInt(indexStr);
            int grade = grades[index];
            JOptionPane.showMessageDialog(null, "Grade: " + grade);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Error: Invalid student index!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Please enter a numeric index!");
        }
    }
}
