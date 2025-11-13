import javax.swing.JOptionPane;

class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

public class ScoreAverage {
    public static void main(String[] args) {
        int[] scores = new int[5];
        int sum = 0;

        try {
            for (int i = 0; i < 5; i++) {
                String input = JOptionPane.showInputDialog("Enter score " + (i + 1) + " (0-100):");
                int score = Integer.parseInt(input);

                if (score < 0 || score > 100) {
                    throw new InvalidScoreException("Score must be between 0 and 100!");
                }

                scores[i] = score;
                sum += score;
            }

            double average = sum / 5.0;
            JOptionPane.showMessageDialog(null, "Average score: " + average);

        } catch (InvalidScoreException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Please enter numeric values only!");
        }
    }
}
