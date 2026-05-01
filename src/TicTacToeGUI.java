
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

    public class TicTacToeGUI {

        JFrame frame;
        JButton[][] buttons = new JButton[3][3];
        Board board = new Board();

        public TicTacToeGUI() {
            frame = new JFrame("Tic Tac Toe - Minimax AI");
            frame.setSize(400, 400);
            frame.setLayout(new GridLayout(3, 3));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            initializeButtons();

            frame.setVisible(true);
        }

        private void initializeButtons() {

            ActionListener listener = e -> {
                JButton clicked = (JButton) e.getSource();

                int row = -1, col = -1;

                // Find which button was clicked
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (buttons[i][j] == clicked) {
                            row = i;
                            col = j;
                        }
                    }
                }

                // Player move
                if (board.playerMove(row, col)) {
                    buttons[row][col].setText("X");

                    String result = GameState.checkWinner(board.board);
                    if (result != null) {
                        endGame(result);
                        return;
                    }

                    // AI move
                    AIPlayer.makeMove(board);
                    updateBoardUI();

                    result = GameState.checkWinner(board.board);
                    if (result != null) {
                        endGame(result);
                    }
                }
            };

            // Create buttons
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    buttons[i][j] = new JButton("");
                    buttons[i][j].setFont(new Font("Arial", Font.BOLD, 40));

                    buttons[i][j].addActionListener(listener);

                    frame.add(buttons[i][j]);
                }
            }
        }

        // Sync GUI with board
        private void updateBoardUI() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    buttons[i][j].setText(String.valueOf(board.board[i][j]));
                }
            }
        }

        // End game popup
        private void endGame(String result) {
            JOptionPane.showMessageDialog(frame, result);

            // Disable all buttons
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    buttons[i][j].setEnabled(false);
        }
    }

