public class GameState {
        public static String checkWinner(char[][] board) {

            // Rows & Columns
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == board[i][1] &&
                        board[i][1] == board[i][2] &&
                        board[i][0] != ' ')
                    return board[i][0] == 'O' ? "WIN" : "LOSE";

                if (board[0][i] == board[1][i] &&
                        board[1][i] == board[2][i] &&
                        board[0][i] != ' ')
                    return board[0][i] == 'O' ? "WIN" : "LOSE";
            }

            // Diagonals
            if (board[0][0] == board[1][1] &&
                    board[1][1] == board[2][2] &&
                    board[0][0] != ' ')
                return board[0][0] == 'O' ? "WIN" : "LOSE";

            if (board[0][2] == board[1][1] &&
                    board[1][1] == board[2][0] &&
                    board[0][2] != ' ')
                return board[0][2] == 'O' ? "WIN" : "LOSE";

            // Draw
            boolean isDraw = true;
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    if (board[i][j] == ' ')
                        isDraw = false;

            if (isDraw) return "DRAW";

            return null;
        }
    }

